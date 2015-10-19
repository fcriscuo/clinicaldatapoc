package org.mskcc.cbio.clinicaldata.cbiodata.cache;

import com.google.api.client.repackaged.com.google.common.base.Strings;
import com.google.api.client.util.Lists;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.FluentIterable;
import io.reactivex.netty.protocol.http.server.HttpServerResponse;
import io.reactivex.netty.protocol.http.server.RequestHandler;
import org.apache.log4j.Logger;
import org.mskcc.cbio.clinicaldata.cbiodata.PatientCbioClinicalDataAttribute;
import org.mskcc.cbio.clinicaldata.cbiodata.dao.CbioCancerStudyMapper;
import org.mskcc.cbio.clinicaldata.cbiodata.dao.CbioClinicalAttributeMapper;
import org.mskcc.cbio.clinicaldata.cbiodata.dao.CbioClinicalEventMapper;
import org.mskcc.cbio.clinicaldata.cbiodata.dao.CbioClinicalPatientMapper;
import org.mskcc.cbio.clinicaldata.cbiodata.model.*;
import org.mskcc.cbio.clinicaldata.cbiodata.util.CbioInternalIdentifierService;
import org.mskcc.cbio.clinicaldata.cbiodata.util.CbioSessionManager;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import io.netty.buffer.*;
import io.reactivex.netty.RxNetty;
import io.reactivex.netty.protocol.http.server.HttpServer;
import io.reactivex.netty.protocol.http.server.HttpServerRequest;
import rx.Observable;

/**
 * Copyright (c) 2015 Memorial Sloan-Kettering Cancer Center.
 * <p/>
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 * documentation provided hereunder is on an "as is" basis, and
 * Memorial Sloan-Kettering Cancer Center
 * has no obligations to provide maintenance, support,
 * updates, enhancements or modifications.  In no event shall
 * Memorial Sloan-Kettering Cancer Center
 * be liable to any party for direct, indirect, special,
 * incidental or consequential damages, including lost profits, arising
 * out of the use of this software and its documentation, even if
 * Memorial Sloan-Kettering Cancer Center
 * has been advised of the possibility of such damage.
 * <p/>
 * Created by Fred Criscuolo on 4/20/15.
 * mod 12Jul2013 - supports Netty server to receive cache management commands
 * criscuof@mskcc.org
 */
public enum CbioDataService {
    INSTANCE;
    private static final Logger logger = Logger.getLogger(CbioDataService.class);
    private  final Long MAX_CACHE_SIZE = 5000L;
    private  final Long ID_CACHE_SIZE = 20000L;
     static final String RESET_CACHE_COMMAND = "reset";
    static final String SHUTDOWN_COMMAND = "shutdown";

     static final int DEFAULT_PORT = 9099;
    private HttpServer<ByteBuf,ByteBuf> nettyServer;
    /*
    Public method to activate the Netty server
     */
    public HttpServer<ByteBuf, ByteBuf> createServer() {
        logger.info("Netty server running on port " + DEFAULT_PORT);
       return RxNetty.createHttpServer(DEFAULT_PORT, new RequestHandler<ByteBuf, ByteBuf>() {
            @Override
            public Observable<Void> handle(HttpServerRequest<ByteBuf> httpServerRequest, HttpServerResponse<ByteBuf> httpServerResponse) {
                processRequest(httpServerRequest);
                return httpServerResponse.writeStringAndFlush("Signal processed");
            }
        });

    }
    /*
    Public method to process cache management commands from a Netty client
    Initial prototype looks for a reset command to purge and refresh cache contents
     */
    public void processRequest(HttpServerRequest<ByteBuf> request) {
        System.out.println("Signal received");
        String uri = request.getUri();
        if(uri.contains(RESET_CACHE_COMMAND)){
            this.refreshClinicalAttributeCache();
            this.refreshCancerStudyCache();
        } else if ( uri.contains(SHUTDOWN_COMMAND)){
            this.shutdownServer();
        }

    }
    private void shutdownServer() {

    }
    /*
    Private method to refresh the contents of the clinical attribute cache
    because the cbio database has been updated.
     */
    private void refreshClinicalAttributeCache() {
        logger.info("++++Refreshing contents of clinical attribute cache");
        Set<String> clinAttributeKeySet =
                cbioClinicalAttributeLoadingCache.asMap().keySet();
        for(String key : clinAttributeKeySet){
            cbioClinicalAttributeLoadingCache.refresh(key);
            logger.info("   Clinical attribute " + key +" refreshed in cache");
        }
    }

    private void refreshCancerStudyCache() {
        logger.info("++++Refreshing contents of cancer study cache");
        Set<String> cancerStudyKeySet = cbioCancerStudyLoadingCache.asMap().keySet();
        for (String key : cbioCancerStudyLoadingCache.asMap().keySet()) {
            cbioCancerStudyLoadingCache.refresh(key);
            logger.info("    Cancer study " +key +" refreshed in cache");
        }

    }

    /*
    >>>>>>>CancerStudy Cache
     */
    private CbioCancerStudyExample cbioCancerStudyExample = new CbioCancerStudyExample();
    private CbioCancerStudyMapper cbioCancerStudyMapper = CbioSessionManager.INSTANCE.getCbioSession()
            .getMapper(CbioCancerStudyMapper.class);

    public Optional<CbioCancerStudy> resolveCancerStudyByCancerStudyIdentifier(String identifier){
        if(!Strings.isNullOrEmpty(identifier)){
            try {
                CbioCancerStudy study = cbioCancerStudyLoadingCache.get(identifier);
                if (null != study) {
                    return Optional.of(study);
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }

        }
        return Optional.absent();
    }

    private LoadingCache<String, CbioCancerStudy> cbioCancerStudyLoadingCache = CacheBuilder.newBuilder()
            .maximumSize(MAX_CACHE_SIZE)
            .build(new CacheLoader<String, CbioCancerStudy>() {
                @Override
                public CbioCancerStudy load(String key) throws Exception {
                    cbioCancerStudyExample.clear();
                    cbioCancerStudyExample.createCriteria().andCANCER_STUDY_IDENTIFIEREqualTo(key);
                    List<CbioCancerStudy> studyList = cbioCancerStudyMapper.selectByExample(cbioCancerStudyExample);
                    if( studyList.size() > 0) {
                        return studyList.get(0);
                    }
                    return null;
                }
            });

    /*
    >>>>>CbioClinicalAttribute Cache
     */
    private CbioClinicalAttributeExample cbioClinicalAttributeExample = new CbioClinicalAttributeExample();
    private CbioClinicalAttributeMapper cbioClinicalAttributeMapper = CbioSessionManager.INSTANCE.getCbioSession()
            .getMapper(CbioClinicalAttributeMapper.class);

    public Optional<CbioClinicalAttribute> resolveClinicalAttributeByAttributeId(String attrId) {
        if (!Strings.isNullOrEmpty(attrId)) {
            try {
                CbioClinicalAttribute ca = cbioClinicalAttributeLoadingCache.get(attrId);
                if (null != ca) {
                    return Optional.of(ca);
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    private LoadingCache<String, CbioClinicalAttribute> cbioClinicalAttributeLoadingCache = CacheBuilder.newBuilder()
            .maximumSize(MAX_CACHE_SIZE)
            .build(new CacheLoader<String, CbioClinicalAttribute>() {
                @Override
                public CbioClinicalAttribute load(String key) throws Exception {
                    return cbioClinicalAttributeMapper.selectByPrimaryKey(key);
                }
            });

    /*
    >>>>>CbioClinicalPatient Cache
     */
    private CbioClinicalPatientExample cbioClinicalPatientExample = new CbioClinicalPatientExample();
    private CbioClinicalPatientMapper cbioClinicalPatientMapper = CbioSessionManager.INSTANCE.getCbioSession()
            .getMapper(CbioClinicalPatientMapper.class);


    public List<CbioClinicalPatient> resolveClinicalPatientListByCvrPatientId(String cvrPatientId){
        List<CbioClinicalPatient> retList = Lists.newArrayList();
        if(!Strings.isNullOrEmpty(cvrPatientId) ){
            Optional<Integer> internalIdOpt = CbioInternalIdentifierService.INSTANCE
                    .resolveCbioInternalIdByExternalId(cvrPatientId);
            if(internalIdOpt.isPresent()){
                try {
                    return cbioClinicalPatientCache.get(internalIdOpt.get());
                } catch (ExecutionException e) {
                    logger.error(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        return retList;
    }

    public Optional<List<PatientCbioClinicalDataAttribute>> resolvePatientClinicalDataAttributeListByCvrPatientId(final String cvrPatientId){
        if(!Strings.isNullOrEmpty(cvrPatientId)){
            Optional<Integer> keyOpt = CbioInternalIdentifierService.INSTANCE.resolveCbioInternalIdByExternalId(cvrPatientId);
            if(keyOpt.isPresent()){
                try {
                    List<CbioClinicalPatient> clinPatientList = cbioClinicalPatientCache.get(keyOpt.get());
                    List<PatientCbioClinicalDataAttribute> clinAttrList = FluentIterable.from(cbioClinicalPatientCache.get(keyOpt.get()))
                            .transform( new Function<CbioClinicalPatient, PatientCbioClinicalDataAttribute>() {
                                @Nullable
                                @Override
                                public PatientCbioClinicalDataAttribute apply(@Nullable CbioClinicalPatient input) {
                                    return new PatientCbioClinicalDataAttribute(cvrPatientId, input.getATTR_ID());
                                }
                            })
                          .toList();
                    return Optional.of(clinAttrList);
                } catch (ExecutionException e) {
                    logger.error(e.getMessage());
                    e.printStackTrace();
                }
            }

        }
        return Optional.absent();
    }


    private LoadingCache<Integer,List<CbioClinicalPatient>> cbioClinicalPatientCache = CacheBuilder.newBuilder()
            .maximumSize(MAX_CACHE_SIZE)
            .build(new CacheLoader<Integer, List<CbioClinicalPatient>>() {
                @Override
                public List<CbioClinicalPatient> load(Integer key)
                {
                    cbioClinicalPatientExample.clear();
                    cbioClinicalPatientExample.createCriteria().andINTERNAL_IDEqualTo(key);
                    List<CbioClinicalPatient> cbioClinicalPatientList =
                            cbioClinicalPatientMapper.selectByExample(cbioClinicalPatientExample);
                    // preload clinical attribute cache
                    for (CbioClinicalPatient ccp : cbioClinicalPatientList) {
                        try {
                            cbioClinicalAttributeLoadingCache.get(ccp.getATTR_ID());
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }
                    }
                    return cbioClinicalPatientList;
                }
            });

    /*
    >>>>>CbioClinicalEvent Cache
     */
    private CbioClinicalEventExample cbioClinicalEventExample = new CbioClinicalEventExample();
    private CbioClinicalEventMapper cbioClinicalEventMapper = CbioSessionManager.INSTANCE.getCbioSession()
            .getMapper(CbioClinicalEventMapper.class);

    public List<CbioClinicalEvent> resolveCbioPatientClinicalEventListByCbioInternalId(Integer internalId){
       List<CbioClinicalEvent> retList = Lists.newArrayList();
        if(null != internalId && internalId > 0){
            try {
                retList = cbioPatientClinicalEventCache.get(internalId);
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return retList;
    }

    public List<CbioClinicalEvent> resolveCbioPatientClinicalEventListByCvrPatientId(String cvrPatientId){
        if(!Strings.isNullOrEmpty(cvrPatientId)){
            Optional<Integer> cbioIdOpt = CbioInternalIdentifierService
                    .INSTANCE.resolveCbioInternalIdByExternalId(cvrPatientId);
            if(cbioIdOpt.isPresent()) {
                try {
                    return  cbioPatientClinicalEventCache.get(cbioIdOpt.get());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        return new ArrayList<CbioClinicalEvent>();
    }
    /*
    cache uses CBIO internal id as key
     */
    private LoadingCache<Integer,List<CbioClinicalEvent>>  cbioPatientClinicalEventCache = CacheBuilder.newBuilder()
            .maximumSize(MAX_CACHE_SIZE)
            .build(new CacheLoader<Integer, List<CbioClinicalEvent>>() {
                @Override
                public List<CbioClinicalEvent> load(Integer internalPatientId) throws Exception {
                    cbioClinicalEventExample.clear();
                    cbioClinicalEventExample.createCriteria().andPATIENT_IDEqualTo(internalPatientId);
                    return cbioClinicalEventMapper.selectByExample(cbioClinicalEventExample);

                }
            });

    public Optional<List<CbioClinicalAttribute>> resolveClinicalAttributeListByCvrPatientId(String cvrPatientId) {
        if (!Strings.isNullOrEmpty(cvrPatientId)){
            List<CbioClinicalPatient> cbioClinicalPatientList = CbioDataService.INSTANCE
                    .resolveClinicalPatientListByCvrPatientId(cvrPatientId);
            List<CbioClinicalAttribute> clinicalAttributeList = FluentIterable.from(cbioClinicalPatientList)
                    .transform(new Function<CbioClinicalPatient, CbioClinicalAttribute>(){
                        @Nullable
                        @Override
                        public CbioClinicalAttribute apply(CbioClinicalPatient patient) {
                            try {
                                return cbioClinicalAttributeLoadingCache.get(patient.getATTR_ID());
                            } catch (ExecutionException e) {
                                e.printStackTrace();
                            }
                            return null;
                        }

                    }).filter( new Predicate<CbioClinicalAttribute>() {
                        @Override
                        public boolean apply(@Nullable CbioClinicalAttribute input) {
                            return input !=null ;
                        }
                    }).toList();
                if(clinicalAttributeList.size()>0) { return Optional.of(clinicalAttributeList);}
        }

        return Optional.absent();
    }

    public static void main (String...args) {
        String testCvrPatientId = "P-0002738";

        // test clinical patient select
        List<CbioClinicalPatient> cbioClinicalPatientList = CbioDataService.INSTANCE
                .resolveClinicalPatientListByCvrPatientId(testCvrPatientId);
        logger.info("Found " +cbioClinicalPatientList.size() +" clinical patient entries for " +testCvrPatientId);
        for (CbioClinicalPatient cp : cbioClinicalPatientList){
            Optional<CbioClinicalAttribute> caOpt  = CbioDataService.INSTANCE
                    .resolveClinicalAttributeByAttributeId(cp.getATTR_ID());
              String displayName = (caOpt.isPresent())?caOpt.get().getDISPLAY_NAME():" ";
            String description = (caOpt.isPresent())? caOpt.get().getDESCRIPTION():" ";
            logger.info("Clinical attribute: " +cp.getATTR_ID() +" value = " +cp.getATTR_VALUE()
             +" display name: " +displayName +" description: " +description +" internal id " +cp.getINTERNAL_ID());
        }
        Optional<List<PatientCbioClinicalDataAttribute>> clinAttrListOpt = CbioDataService.INSTANCE
                .resolvePatientClinicalDataAttributeListByCvrPatientId(testCvrPatientId);
        if (clinAttrListOpt.isPresent()){
            for(PatientCbioClinicalDataAttribute ca : clinAttrListOpt.get()){
                logger.info(ca);
            }
        }
        CbioDataService.INSTANCE.createServer().startAndWait();


    }



}
