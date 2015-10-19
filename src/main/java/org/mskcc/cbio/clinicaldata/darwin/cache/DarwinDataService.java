package org.mskcc.cbio.clinicaldata.darwin.cache;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.apache.log4j.Logger;
import org.mskcc.cbio.clinicaldata.common.CacheCommon;
import org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio.*;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.*;
import org.mskcc.cbio.clinicaldata.darwin.util.DarwinSessionManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

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
 * Created by Fred Criscuolo on 4/24/15.
 * criscuof@mskcc.org
 */
public enum DarwinDataService {
    INSTANCE;
    private static final Logger logger = Logger.getLogger(DarwinDataService.class);

    // cache for patient med order
    private PatientMedOrderExample patientMedOrderExample = new PatientMedOrderExample();
    private PatientMedOrderMapper patientMedOrderMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientMedOrderMapper.class);
    private LoadingCache<String,Optional<List<PatientMedOrder>>> patientMedOrderCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, Optional<List<PatientMedOrder>>>() {
                @Override
                public Optional<List<PatientMedOrder>> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if (darwinIdOpt.isPresent()){
                        patientMedOrderExample.clear();
                        patientMedOrderExample.createCriteria()
                                .andORD_PT_DEIDENTIFICATION_IDEqualTo(darwinIdOpt.get());
                        List<PatientMedOrder> medOrderList =  patientMedOrderMapper.selectByExample(patientMedOrderExample);
                        if( null != medOrderList && medOrderList.size()>0){
                            return Optional.of(medOrderList);
                        }
                    }
                    return Optional.absent();
                }
            });

    public Optional<List<PatientMedOrder>> resolvePatientMedOrderListByCvrPatientId(String cvrPatientId) {
        if( !Strings.isNullOrEmpty(cvrPatientId)){
            try {
                return patientMedOrderCache.get(cvrPatientId);
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    // cache for patient procedure records
    private PatientProcedureRecordExample patientProcedureRecordExample = new PatientProcedureRecordExample();
    private PatientProcedureRecordMapper patientProcedureRecordMapper = DarwinSessionManager.INSTANCE
            .getDarwinSession().getMapper(PatientProcedureRecordMapper.class);
    private LoadingCache<String,Optional<List<PatientProcedureRecord>>> patientProcedureRecordListCache =
            CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, Optional<List<PatientProcedureRecord>>>() {
                @Override
                public Optional<List<PatientProcedureRecord>> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if (darwinIdOpt.isPresent()){
                        patientProcedureRecordExample.clear();
                        patientProcedureRecordExample.createCriteria().andPT_ID_PROCEDUREEqualTo(darwinIdOpt.get());
                        List<PatientProcedureRecord> patientProcedureRecordList =
                                patientProcedureRecordMapper.selectByExample(patientProcedureRecordExample);
                        if(null != patientProcedureRecordList && patientProcedureRecordList.size()>0){
                            return Optional.of(patientProcedureRecordList);
                        }
                    }
                    return Optional.absent();
                }
            });

    public Optional<List<PatientProcedureRecord>> resolvePatientProcedureRecordListByCvrPatientId(String cvrPatientId){
        if(!Strings.isNullOrEmpty(cvrPatientId)) {
            try {
                return patientProcedureRecordListCache.get(cvrPatientId);
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    // cache for patient pharmacy records
    private PatientPhramacyRecordExample patientPhramacyRecordExample = new PatientPhramacyRecordExample();
    private PatientPhramacyRecordMapper patientPhramacyRecordMapper = DarwinSessionManager.INSTANCE
            .getDarwinSession().getMapper(PatientPhramacyRecordMapper.class);

    private  LoadingCache<String,Optional<List<PatientPhramacyRecord>>> patientPharmacyRecordListCache =
            CacheBuilder.newBuilder()
            .maximumSize((CacheCommon.MAX_CACHE_SIZE))
            .build(new CacheLoader<String, Optional<List<PatientPhramacyRecord>>>() {
                @Override
                public Optional<List<PatientPhramacyRecord>> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if (darwinIdOpt.isPresent()){
                        patientPhramacyRecordExample.clear();
                        patientPhramacyRecordExample.createCriteria().andPT_ID_PHARMACYEqualTo(darwinIdOpt.get());
                        List<PatientPhramacyRecord> pharmacyRecordList =
                                patientPhramacyRecordMapper.selectByExample(patientPhramacyRecordExample);
                        if(null != pharmacyRecordList && pharmacyRecordList.size()>1){
                            return Optional.of(pharmacyRecordList);
                        }
                    }
                    return Optional.absent();
                }
            });
    public Optional<List<PatientPhramacyRecord>> resolvePatientPharamacyRecordListByCvrPatientId( String cvrPatientId) {
        if (!Strings.isNullOrEmpty(cvrPatientId)){
            try {
                return patientPharmacyRecordListCache.get(cvrPatientId);
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    // cache for patient pathology reports
    private PatientPathologyReportExample patientPathologyReportExample = new PatientPathologyReportExample();
    private PatientPathologyReportMapper patientPathologyReportMapper = DarwinSessionManager.INSTANCE
            .getDarwinSession().getMapper(PatientPathologyReportMapper.class);
    private LoadingCache<String,List<PatientPathologyReport>> patientPathologyReportCache =
            CacheBuilder.newBuilder().maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, List<PatientPathologyReport>>() {
                @Override
                public List<PatientPathologyReport> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if (darwinIdOpt.isPresent()){
                        patientPathologyReportExample.clear();
                        patientPathologyReportExample.createCriteria().andPT_ID_PATHOLOGYEqualTo(darwinIdOpt.get());
                        return patientPathologyReportMapper.selectByExample(patientPathologyReportExample);
                    }
                    return null;
                }
            });
    public Optional<List<PatientPathologyReport>> resolvePatientPathologyReportsByCvrPatientId(String cvrPatientId){
        if(!Strings.isNullOrEmpty(cvrPatientId)){
            try {
                List<PatientPathologyReport> patPathList = patientPathologyReportCache.get(cvrPatientId);
                if( null != patPathList  && patPathList.size()>0){
                    return Optional.of(patPathList);
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    // cache for patient's latest activity
    private PatientLatestActivityExample patientLatestActivityExample = new PatientLatestActivityExample();
    private PatientLatestActivityMapper patientLatestActivityMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientLatestActivityMapper.class);
    private LoadingCache<String, PatientLatestActivity> patientLatestActivityCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, PatientLatestActivity>() {
                @Override
                public PatientLatestActivity load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if(darwinIdOpt.isPresent()) {
                        patientLatestActivityExample.clear();
                        patientLatestActivityExample.createCriteria().andPT_ID_PLAEqualTo(darwinIdOpt.get());
                        if(patientLatestActivityMapper.countByExample(patientLatestActivityExample)> 0) {
                            return patientLatestActivityMapper
                                    .selectByExample(patientLatestActivityExample).get(0);
                        }
                    }
                    return null;
                }
            });
    public Optional<PatientLatestActivity> resolvePatientLatestActivityByCvrPatientId(String cvrPatientId){
        if( !Strings.isNullOrEmpty(cvrPatientId)){
            try {
                PatientLatestActivity pla = patientLatestActivityCache.get(cvrPatientId);
                if (null != pla) {
                    return Optional.of(pla);
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }
    // cache for patient's lab result records
    private PatientLabResultExample labResultExample = new PatientLabResultExample();
    private PatientLabResultMapper labResultMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientLabResultMapper.class);
    private LoadingCache<String,List<PatientLabResult>> patientLabResultCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, List<PatientLabResult>>() {
                @Override
                public List<PatientLabResult> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if(darwinIdOpt.isPresent()){
                        labResultExample.clear();
                        labResultExample.createCriteria().andPT_ID_LABEqualTo(darwinIdOpt.get());
                        return labResultMapper.selectByExample(labResultExample);
                    }
                    return null;
                }
            });

    public Optional<List<PatientLabResult>> resolvePatientLabResultRecordsByCVRPatientId(String cvrPatientId){
        if(!Strings.isNullOrEmpty(cvrPatientId)){
            try {
                List<PatientLabResult>  patientLabResultList = patientLabResultCache.get(cvrPatientId);
                if(null != patientLabResultList && patientLabResultList.size()>0){
                    return Optional.of(patientLabResultList);
                }
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    // cache for patient's in patient records
    private PatientInpatientRecordExample patientInpatientRecordExample = new PatientInpatientRecordExample();
    private PatientInpatientRecordMapper patientInpatientRecordMapper = DarwinSessionManager.INSTANCE
            .getDarwinSession().getMapper(PatientInpatientRecordMapper.class);
    private LoadingCache<String,List<PatientInpatientRecord>> patientInpatientCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, List<PatientInpatientRecord>>() {
                @Override
                public List<PatientInpatientRecord> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if(darwinIdOpt.isPresent()) {
                        patientInpatientRecordExample.clear();
                        patientInpatientRecordExample.createCriteria().andPT_ID_INPATIENTEqualTo(darwinIdOpt.get());
                        return patientInpatientRecordMapper.selectByExample(patientInpatientRecordExample);
                    }
                    return null;
                }
            });


    public Optional<List<PatientInpatientRecord>> resolveInpatientRecordsByCVRPatientId(String cvrPatientId){
        if(!Strings.isNullOrEmpty(cvrPatientId)){
            try {
                List<PatientInpatientRecord>inpatientRecordList = patientInpatientCache.get(cvrPatientId);
                if( null != inpatientRecordList && inpatientRecordList.size()>0){
                    return Optional.of(inpatientRecordList);
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    // cache for first activity
    private PatientFirstActivityExample patientFirstActivityExample = new PatientFirstActivityExample();
    private PatientFirstActivityMapper patientFirstActivityMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientFirstActivityMapper.class);

    private LoadingCache<String,PatientFirstActivity> patientFirstActivityCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, PatientFirstActivity>() {
                @Override
                public PatientFirstActivity load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if(darwinIdOpt.isPresent()){
                        patientFirstActivityExample.clear();
                        patientFirstActivityExample.createCriteria().andPT_ID_PFAEqualTo(darwinIdOpt.get());
                        List<PatientFirstActivity> pfaList = patientFirstActivityMapper.selectByExample(patientFirstActivityExample);
                        if(pfaList.size() > 0){
                            return pfaList.get(0);
                        }
                    }
                    return null;
                }
            });

    public Optional<PatientFirstActivity> resolvePatientFirstActivity (String patientId){
        if (!Strings.isNullOrEmpty(patientId)){
            try {
                PatientFirstActivity pfa = patientFirstActivityCache.get(patientId);
                if(null != pfa){
                    return Optional.of(pfa);
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    // cache for patient clinical notes
    private PatientClinicalNoteExample patientClinicalNoteExample = new PatientClinicalNoteExample();
    private PatientClinicalNoteMapper clinicalNoteMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientClinicalNoteMapper.class);

    private LoadingCache<String,List<PatientClinicalNote>> patientClinicalNoteCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, List<PatientClinicalNote>>() {
                @Override
                public List<PatientClinicalNote> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if(darwinIdOpt.isPresent()) {
                        patientClinicalNoteExample.clear();
                        patientClinicalNoteExample.createCriteria()
                                .andCLNT_PT_DEIDENTIFICATION_IDEqualTo(darwinIdOpt.get());
                        return clinicalNoteMapper.selectByExampleWithBLOBs(patientClinicalNoteExample);
                    }
                    return null;
                }
            });

    public Optional<List<PatientClinicalNote>> resolvePatientClinicalNotesByCvrPatientId
            (String patientId)
    {
        if(!Strings.isNullOrEmpty(patientId)){
            try {
                List<PatientClinicalNote> clinicalNoteList = patientClinicalNoteCache.get(patientId);
                if(null != clinicalNoteList && !clinicalNoteList.isEmpty()){
                    return Optional.of(clinicalNoteList);
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    // cache for patient ICDO data
    private PatientIcdORecordExample patientIcdORecordExample = new PatientIcdORecordExample();
    private PatientIcdORecordMapper icdoMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientIcdORecordMapper.class);

    public Optional<List<PatientIcdORecord>> resolveIcdORecords (String cvrPatientId) {
        if (!Strings.isNullOrEmpty(cvrPatientId)) {
            try {
                List<PatientIcdORecord> icdoRecordList = patientIcdORecordCache.get(cvrPatientId);
                if (null != icdoRecordList && icdoRecordList.size() > 0) {
                    return Optional.of(icdoRecordList);
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    private LoadingCache<String,List<PatientIcdORecord>> patientIcdORecordCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, List<PatientIcdORecord>>() {
                @Override
                public List<PatientIcdORecord> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if (darwinIdOpt.isPresent()) {
                        patientIcdORecordExample.clear();
                        patientIcdORecordExample.createCriteria().andPT_ID_ICDOEqualTo(darwinIdOpt.get());
                        return icdoMapper.selectByExample(patientIcdORecordExample);
                    }
                    return null;
                }
            });


    // cache for patient demographics
    private PatientDemographicsExample patientDemographicsExample = new PatientDemographicsExample();
    private PatientDemographicsMapper demographicsMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientDemographicsMapper.class);


    public Optional<PatientDemographics> resolvePatientDemographics(String cvrPatientId){
        if(Strings.isNullOrEmpty(cvrPatientId)) { return Optional.absent();}
        try {
            PatientDemographics demo = patientDemographicsCache.get(cvrPatientId);
            if( null != demo){
                return  Optional.of(demo);
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return Optional.absent();
    }
    private LoadingCache<String,PatientDemographics> patientDemographicsCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, PatientDemographics>() {
                @Override
                public PatientDemographics load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if (darwinIdOpt.isPresent()) {
                        patientDemographicsExample.clear();
                        patientDemographicsExample.createCriteria().andPT_ID_DEMOEqualTo(darwinIdOpt.get());

                        List<PatientDemographics> demoList = demographicsMapper.selectByExample(patientDemographicsExample);
                        if (demoList.size() > 0) {
                            return demoList.get(0);
                        }
                    }
                    logger.info("Unable to find demographics data for CVR identifier " + key);
                    return null;
                }
            }) ;

    // cache for patient of clinical trials list
    public Optional<List<PatientClinicalTrial>> resolvePatientClinicalTrials (String cvrPatientId){
        if(Strings.isNullOrEmpty(cvrPatientId)) { return Optional.absent();}
        try {
            List<PatientClinicalTrial> clinicalTrialList = patientClinicalTrialListCache.get(cvrPatientId);
            if(null != clinicalTrialList && clinicalTrialList.size() > 0){
                return Optional.of(clinicalTrialList);
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return Optional.absent();
    }


    private PatientClinicalTrialExample clinicalTrialExample = new PatientClinicalTrialExample();
    private PatientClinicalTrialMapper clinicalTrialMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientClinicalTrialMapper.class);
    private LoadingCache<String, List<PatientClinicalTrial>> patientClinicalTrialListCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, List<PatientClinicalTrial>>() {
                @Override
                public List<PatientClinicalTrial> load(String key) throws Exception {
                    Optional<Integer> darwinIdOpt = resolveDarwinPatientId(key);
                    if (darwinIdOpt.isPresent()) {
                        clinicalTrialExample.clear();
                        clinicalTrialExample.createCriteria().andCLIN_TRIAL_PT_DEIDENTIFICATION_IDEqualTo(darwinIdOpt.get());
                        return clinicalTrialMapper.selectByExample(clinicalTrialExample);
                    }
                    return null;
                }
            });

    /*
    public method to resolve a Darwin patient id from a CVR id
    the CVR id can either be a patient or sample id
     */
    public Optional<Integer> resolveDarwinPatientId(String dmpId){
        try {
            if(Strings.isNullOrEmpty(dmpId) || patientIdMapCache.get(dmpId).isEmpty()) {
                return Optional.absent();
            }
            return Optional.of(patientIdMapCache.get(dmpId).get(0).getPT_ID_PATH_DMP());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return Optional.absent();
    }
    // cache for patient id mappings
    private PatientDmpPathologyReportExample dmpIdExample = new PatientDmpPathologyReportExample();
    private PatientDmpPathologyReportMapper dmpidMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
            .getMapper(PatientDmpPathologyReportMapper.class);
    private LoadingCache<String,List<PatientDmpPathologyReport>> patientIdMapCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.ID_CACHE_SIZE)
            .build(new CacheLoader<String, List<PatientDmpPathologyReport>>() {
                @Override
                public List<PatientDmpPathologyReport> load(String key) throws Exception {
                    dmpIdExample.clear();
                    dmpIdExample.createCriteria().andDMP_ID_PATH_DMPLike(key + "%");
                    return new ArrayList<PatientDmpPathologyReport>(dmpidMapper.selectByExample(dmpIdExample));
                }
            });

    //main method for stand alone testing
    public static void main(String...args){
        String testPatientId = "P-0002738";
        try {
            List<PatientDmpPathologyReport> idList = DarwinDataService.INSTANCE.patientIdMapCache.get(testPatientId);
            for (PatientDmpPathologyReport r : idList){
                logger.info( "Darwin id= " +r.getPT_ID_PATH_DMP() +" CVR patient id = " +r.getPT_ID_PATH_DMP()
                        +" CVR sample id = " + r.getSAMPLE_ID_PATH_DMP());
            }
            // demographics
            Optional<PatientDemographics> demoOpt = DarwinDataService.INSTANCE.resolvePatientDemographics(testPatientId);
            if (demoOpt.isPresent()){
                PatientDemographics demo = demoOpt.get();
                logger.info(">>> Demographics for CVR patient id: " +testPatientId);
                logger.info("gender " + demo.getGENDER() + " vital status " + demo.getVITAL_STATUS());
            }
            // clinical trials
            Optional<List<PatientClinicalTrial>> clinTrialListOpt = DarwinDataService.INSTANCE.resolvePatientClinicalTrials(testPatientId);
            if( clinTrialListOpt.isPresent()){
                logger.info(">>> Clinical Trials for CVR patient id: " +testPatientId);
                List<PatientClinicalTrial> clinTrialList = clinTrialListOpt.get();
                for(PatientClinicalTrial pct : clinTrialList){
                    logger.info(" CT IRB No: " +pct.getCLIN_TRIAL_IRB_NO() +" IRB title: " +pct.getCLIN_TRIAL_IRB_TITLE());
                }
            } else {
                logger.info("No clinical trial data for patient " +testPatientId);
            }

            // clinical notes
            Optional<List<PatientClinicalNote>> clinNoteListOpt = DarwinDataService.INSTANCE
                    .resolvePatientClinicalNotesByCvrPatientId(testPatientId);
            if(clinNoteListOpt.isPresent()){
                logger.info(">>> Clinical Notes for CVR patient id: " +testPatientId);
                for(PatientClinicalNote clinNote : clinNoteListOpt.get()){
                    logger.info("Patient id: " +clinNote.getCLNT_PT_DEIDENTIFICATION_ID() +"    Category: " +clinNote.getCLNT_CATEGORY() +"  Age in days: " +clinNote.getAGE_AT_CLINICAL_NOTE_IN_DAYS());
                    logger.info("Clinical report: " +clinNote.getCLNT_DEID_MEDICAL_DOCUMENT_TXT());
                    logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                }
            } else {
                logger.info("There are no clinical notes for patient " +testPatientId);
            }

            // patient first activity
            Optional<PatientFirstActivity> pfaOpt = DarwinDataService.INSTANCE
                    .resolvePatientFirstActivity(testPatientId);
            if(pfaOpt.isPresent()){
                logger.info(">>> Patient First Activity " +testPatientId);
                logger.info("Date of first activity:" +pfaOpt.get().getAGE_AT_FIRST_ACTIVITY_DATE_IN_DAYS());
                logger.info("First Activity Year: " +pfaOpt.get().getFIRST_ACTIVITY_YEAR());
            }  else {
                logger.info("There isn't a first activity record for patient: " +testPatientId);
            }
            // patient inpatient records
            Optional<List<PatientInpatientRecord>> inPatOpt = DarwinDataService.INSTANCE
                    .resolveInpatientRecordsByCVRPatientId(testPatientId);
            if (inPatOpt.isPresent()){
                logger.info(">>> Patient Inpatient Records " +testPatientId);
                for (PatientInpatientRecord inpatientRecord : inPatOpt.get()){
                    logger.info("  reason: " +inpatientRecord.getADMISSION_REASON());
                    logger.info("   year: " +inpatientRecord.getADMISSION_YEAR());
                    logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                }
            } else {
                logger.info("There are no inpatient records for patient: " +testPatientId);
            }

            // patient lab result records
            Optional<List<PatientLabResult>> labResOpt = DarwinDataService.INSTANCE
                    .resolvePatientLabResultRecordsByCVRPatientId(testPatientId);
            if(labResOpt.isPresent()){
                logger.info(">>> Patient Lab Results for " +testPatientId);
                for( PatientLabResult result : labResOpt.get()){
                    logger.info("Test name:  " +result.getLAB_TEST_NAME()  +" **value " + result.getLAB_TEST_RESULT_VALUE()
                    + "**abnormal flag: " +result.getLAB_ABNORMAL_FLAG());
                }
            }
            // patient latest activity record
            Optional<PatientLatestActivity> plaOpt = DarwinDataService.INSTANCE
                    .resolvePatientLatestActivityByCvrPatientId(testPatientId);
            if( plaOpt.isPresent()){
                logger.info(">>> Patient Latest Activity Record for " +testPatientId);
                logger.info( "Last Contact Year:    " +plaOpt.get().getLAST_CONTACT_YEAR());
            } else {
                logger.info("There is no latest patient activity record for patient " +testPatientId);
            }

            // patient pathology reports
            Optional<List<PatientPathologyReport>> pathRepListOpt = DarwinDataService.INSTANCE
                    .resolvePatientPathologyReportsByCvrPatientId(testPatientId);
            if(pathRepListOpt.isPresent()){
                logger.info(">>>> Patient Pathology Reports for patient " +testPatientId);
                for(PatientPathologyReport report : pathRepListOpt.get()){
                    logger.info("++++++++ pathology report type  "
                            +report.getPATHOLOGY_REPORT_TYPE() +"   year "
                            + report.getPATHOLOGY_REPORT_YEAR());
                    logger.info(report.getPATHOLOGY_REPORT_TEXT());
                }
            } else {
                logger.info("There are no pathology reports for patient " +testPatientId);
            }
            // patient pharmacy records
            Optional<List<PatientPhramacyRecord>> pharmListOpt =
                    DarwinDataService.INSTANCE.resolvePatientPharamacyRecordListByCvrPatientId(testPatientId);
            if(pharmListOpt.isPresent()){
                logger.info(">>>> Patinet Pharamacy Records for patient " +testPatientId);
                for (PatientPhramacyRecord pr : pharmListOpt.get()){
                    logger.info("Dispense year " +pr.getDISPENSE_YEAR()
                            +" **drug name: " +pr.getDRUG_NAME()
                           +" **drug NDC " +pr.getDRUG_NDC()
                  +" **chemo indicator "  +pr.getCHEMO_INDICATOR());
                }
            } else {
                logger.info("There are no pharmacy records for patient " +testPatientId);
            }
            // patient procedure records
            Optional<List<PatientProcedureRecord>> procListOpt = DarwinDataService.INSTANCE
                    .resolvePatientProcedureRecordListByCvrPatientId(testPatientId);
            if( procListOpt.isPresent()){
                logger.info(">>>> Patinet Procedure Records for patient " +testPatientId);
                for (PatientProcedureRecord pr : procListOpt.get()){
                    logger.info ( "procedure year " +pr.getPROCEDURE_YEAR()
                                    +" *procedure code " +pr.getPBD_PCC_CODE()
                            +" *code description " +pr.getPROCEDURE_CODE_DESCRIPTION()
                            +" *age in days " +pr.getAGE_AT_PROCEDURE_DATE_IN_DAYS()
                    );
                }
            }else {
                logger.info("There are no procedure  records for patient " +testPatientId);
            }




        } catch (ExecutionException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }

    }


}
