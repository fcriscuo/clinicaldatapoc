package org.mskcc.cbio.clinicaldata.cbiodata.util;

import com.google.api.client.repackaged.com.google.common.base.Strings;
import com.google.api.client.util.Lists;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.mskcc.cbio.clinicaldata.cbiodata.dao.CbioCancerStudyMapper;
import org.mskcc.cbio.clinicaldata.cbiodata.dao.CbioPatientMapper;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioCancerStudy;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioCancerStudyExample;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioPatient;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioPatientExample;
import rx.Observable;
import rx.Subscriber;

import java.util.List;
import java.util.Map;

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
 * Created by Fred Criscuolo on 4/22/15.
 * criscuof@mskcc.org
 */
/*
A Singleton implemented as a enum that is responsible for mapping CVR patient ids to
cbio internal ids
 */
public enum CbioInternalIdentifierService {
    INSTANCE;
    private static final Logger logger = Logger.getLogger(CbioInternalIdentifierService.class);
    private Map<String,Integer> cbioInternalIdMap = Suppliers.memoize(new CbioIdentifierMapSupplier())
            .get();
    /*
    public method to look up the CBIO internal id for an external identifier
     */
    public Optional<Integer> resolveCbioInternalIdByExternalId(String externalId) {
        if (!Strings.isNullOrEmpty(externalId) && cbioInternalIdMap.containsKey(externalId)){
            return Optional.of(cbioInternalIdMap.get(externalId));
        }
        return Optional.absent();
    }

    public static void main (String...args){
        List<String> idList = Lists.newArrayList();
        idList.add("P-0002738");
        idList.add("BAD_ID");
        for (String id : idList) {
            Optional<Integer> idOpt = CbioInternalIdentifierService.INSTANCE
                    .resolveCbioInternalIdByExternalId(id);
            if (idOpt.isPresent()){
                logger.info("External id: " +id +" cbio internal id: " +idOpt.get());
            } else {
                logger.info("Unable to resolve external id:  " + id);
            }
        }
    }

    /*
    inner class responsible for instantiating a CVR patient id (key) to cbio internal id (value)
    map
     */
    private class CbioIdentifierMapSupplier implements Supplier<Map<String,Integer> > {

        private final Map<String,Integer> idMap = Maps.newConcurrentMap();
        private  final String mskimpactCancerStudy = "mskimpact";
        private CbioPatientExample cbioPatientExample = new CbioPatientExample();
        private CbioPatientMapper cbioPatientMapper = CbioSessionManager.INSTANCE.getCbioSession()
                .getMapper(CbioPatientMapper.class);

        /*
        private method to determine the cancer study id for the mskimpact study in this database
         */
        private Integer determineMskImpactCancerStudyId(){
            CbioCancerStudyExample cbioCancerStudyExample = new CbioCancerStudyExample();
            CbioCancerStudyMapper cbioCancerStudyMapper= CbioSessionManager.INSTANCE.getCbioSession()
                    .getMapper(CbioCancerStudyMapper.class);
            cbioCancerStudyExample.clear();
            cbioCancerStudyExample.createCriteria().andCANCER_STUDY_IDENTIFIEREqualTo(mskimpactCancerStudy);
           List<CbioCancerStudy> cancerStudyList = cbioCancerStudyMapper.selectByExample(cbioCancerStudyExample);
            if(cancerStudyList.size() == 1){
                return cancerStudyList.get(0).getCANCER_STUDY_ID();
            }
            logger.error("Invalid number of cancer study entries for study " +mskimpactCancerStudy);
            return 0;

        }
        @Override
        public Map<String, Integer> get() {
            cbioPatientExample.clear();
            cbioPatientExample.createCriteria().andINTERNAL_IDIsNotNull()
                    .andSTABLE_IDIsNotNull()
                    .andCANCER_STUDY_IDEqualTo(this.determineMskImpactCancerStudyId());
            Observable<CbioPatient> cbioPatientObservable =
                    Observable.from(cbioPatientMapper.selectByExample(cbioPatientExample));
            cbioPatientObservable.subscribe(new Subscriber<CbioPatient>() {
                @Override
                public void onCompleted() {

                }

                @Override
                public void onError(Throwable throwable) {
                    logger.error(throwable.getMessage());
                    throwable.getMessage();
                }

                @Override
                public void onNext(CbioPatient cbioPatient) {
                    idMap.put(cbioPatient.getSTABLE_ID(),cbioPatient.getINTERNAL_ID());
                }
            });

            return idMap;
        }


    }

}
