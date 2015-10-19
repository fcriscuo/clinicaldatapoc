package org.mskcc.cbio.clinicaldata.cbiodata.util;

import com.google.common.base.Optional;
import io.netty.buffer.ByteBuf;
import io.reactivex.netty.protocol.http.server.HttpServer;
import org.apache.log4j.Logger;
import org.mskcc.cbio.clinicaldata.cbiodata.cache.CbioDataService;
import org.mskcc.cbio.clinicaldata.cbiodata.dao.CbioCancerStudyMapper;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioCancerStudy;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioCancerStudyExample;

/**
 * Copyright (c) 2015 Memorial Sloan-Kettering Cancer Center.
 * <p>
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
 * <p>
 * Created by Fred Criscuolo on 7/15/15.
 * criscuof@mskcc.org
 */
public class CancerStudyCacheApp {
    private static final Logger logger = Logger.getLogger(CancerStudyCacheApp.class);
    private HttpServer<ByteBuf,ByteBuf> nettyServer;

    public CancerStudyCacheApp() {}

    private void loadCancerStudyCache() {
        // start Netty server
        new Thread() {
            public void run() {
                logger.info("====> Statring NETTY Server on separate thread");
                nettyServer =  CbioDataService.INSTANCE.createServer();
                nettyServer.startAndWait();
                //CbioDataService.INSTANCE.createServer().startAndWait();
            }
        }.start();

        logger.info("====> Preloading cancer study cache with all cancer studies in the database");
        CbioCancerStudyExample cbioCancerStudyExample = new CbioCancerStudyExample();
        CbioCancerStudyMapper cbioCancerStudyMapper = CbioSessionManager.INSTANCE.getCbioSession()
                .getMapper(CbioCancerStudyMapper.class);
        cbioCancerStudyExample.clear();
        cbioCancerStudyExample.createCriteria().andCANCER_STUDY_IDENTIFIERIsNotNull();
        for (CbioCancerStudy study : cbioCancerStudyMapper.selectByExample(cbioCancerStudyExample)){
            CbioDataService.INSTANCE.resolveCancerStudyByCancerStudyIdentifier(study.getCANCER_STUDY_IDENTIFIER());
            logger.info("   Cancer study " +study.getCANCER_STUDY_IDENTIFIER() +" added to cancer study cache");
        }
    }

    private void perfromTests() {
        //step 1: get the last BRCA cancer study in the database
        CbioCancerStudy lastBrcaStudy = this.selectBrcaCancerStudiesFromDatabase();
        //step 2: update the name of this study directly in the database
        // reverse the current contents;
        String newName = new StringBuilder(lastBrcaStudy.getNAME()).reverse().toString();
        String originalName = this.updatetBrcaCancerStudy(lastBrcaStudy.getCANCER_STUDY_ID(),newName);
        // step 3: fetch this study from the cache
        Optional<CbioCancerStudy> cacheStudyOpt =
                this.selectBrcaStudyFromCache(lastBrcaStudy.getCANCER_STUDY_IDENTIFIER());
        if(cacheStudyOpt.isPresent()){
            while(!this.selectBrcaStudyFromCache(lastBrcaStudy.getCANCER_STUDY_IDENTIFIER()).get().getNAME()
                    .equals(newName)) {
                logger.info("FAIL: Cancer study identifier " + lastBrcaStudy.getCANCER_STUDY_IDENTIFIER()
                    +" name in cache = "
                        +this.selectBrcaStudyFromCache(lastBrcaStudy.getCANCER_STUDY_IDENTIFIER()).get().getNAME()
                    +"  name in database = " +newName);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // step 4: use external program in different JVM to signal cahce refresh
            logger.info("PASS: Cancer study identifier " + lastBrcaStudy.getCANCER_STUDY_IDENTIFIER()
                    +" name in cache = "
                    +this.selectBrcaStudyFromCache(lastBrcaStudy.getCANCER_STUDY_IDENTIFIER()).get().getNAME()
                    +"  name in database = " +newName);
        } else {
            logger.info("cache does not contain cancer study " +lastBrcaStudy.getCANCER_STUDY_IDENTIFIER());
        }
        // step 6: study's original name
        this.updatetBrcaCancerStudy(lastBrcaStudy.getCANCER_STUDY_ID(),originalName);
        //  step 7: shutdown Netty server
        try {
            Thread.sleep(4000L); // give time for client to get response
            logger.info("===> Tests concluded - shutting down Netty server");
            this.nettyServer.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /*
    Private method to select the last registered brca cancer study
     */
    private CbioCancerStudy selectBrcaCancerStudiesFromDatabase() {
        CbioCancerStudy lastStudy = null;
        CbioCancerStudyExample cbioCancerStudyExample = new CbioCancerStudyExample();
        CbioCancerStudyMapper cbioCancerStudyMapper = CbioSessionManager.INSTANCE.getCbioSession()
                .getMapper(CbioCancerStudyMapper.class);
        cbioCancerStudyExample.clear();
        cbioCancerStudyExample.createCriteria().andTYPE_OF_CANCER_IDEqualTo("brca");
        logger.info("====> Selecting brca studies from database");
        for (CbioCancerStudy study : cbioCancerStudyMapper.selectByExample(cbioCancerStudyExample)){
            logger.info("    BRCA study (database): " +study.getNAME());
            lastStudy = study;
        }
        logger.info("   last brca study: " +lastStudy.getNAME());
        return lastStudy;

    }

    /*
    update a cancer study identifier using database operations
    this makes the cached entry for the updated study invalid
     */
    private String  updatetBrcaCancerStudy(Integer lastStudyId, String newStudyName) {
        CbioCancerStudyExample cbioCancerStudyExample = new CbioCancerStudyExample();
        CbioCancerStudyMapper cbioCancerStudyMapper = CbioSessionManager.INSTANCE.getCbioSession()
                .getMapper(CbioCancerStudyMapper.class);

        CbioCancerStudy study62 = cbioCancerStudyMapper.selectByPrimaryKey(lastStudyId);
        String originalName = study62.getNAME();
        study62.setNAME(newStudyName);
        cbioCancerStudyMapper.updateByPrimaryKey(study62);
        logger.info("=====> Updating Cancer study id=  " +lastStudyId);
        logger.info("    Cancer study id " +lastStudyId +" updated by direct SQL update");
        logger.info("     Existing cancer study cache entry may be invalid");
        return originalName;
    }

    /*
    Private method to select a cancer study from the cache using a cancer study identifier (key)
     */
    private Optional<CbioCancerStudy> selectBrcaStudyFromCache(String studyIdentifier) {
        logger.info("=====> Selecting cancer study " +studyIdentifier +" from cache");
        Optional<CbioCancerStudy> studyOpt = CbioDataService.INSTANCE.resolveCancerStudyByCancerStudyIdentifier(studyIdentifier);
        if (studyOpt.isPresent()){
            logger.info("   HIT: Cancer study " +studyIdentifier +" was found in cache " +studyOpt.get().getNAME());
        } else {
            logger.info("   MISS: Cancer study " +studyIdentifier +" was not found in cache");
        }
        return studyOpt;
    }

    public static void main (String...args){
        CancerStudyCacheApp loader = new CancerStudyCacheApp();
        loader.loadCancerStudyCache();
        loader.perfromTests();


    }

}
