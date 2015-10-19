package org.mskcc.cbio.clinicaldata.model;

import com.google.api.client.repackaged.com.google.common.base.Preconditions;
import com.google.api.client.repackaged.com.google.common.base.Strings;
import com.google.common.base.Optional;
import org.apache.log4j.Logger;

import org.mskcc.cbio.clinicaldata.crdb.cache.CrdbDataService;
import org.mskcc.cbio.clinicaldata.crdb.rdbms.model.cbioint.CrdbDataset;
import org.mskcc.cbio.clinicaldata.darwin.cache.DarwinDataService;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientClinicalTrial;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientDemographics;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientIcdORecord;

import java.util.ArrayList;
import java.util.List;

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
 * Created by Fred Criscuolo on 4/19/15.
 * criscuof@mskcc.org
 */
/*
represents a POJO of clinical data summary attributes for a MSKCC patient
 */
public class PatientClinicalDataSummaryModel {
    private static final Logger logger = Logger.getLogger(PatientClinicalDataSummaryModel.class);
    private final String cvrPatientId;
    private CrdbDataset crdbDataset;
    private List<String> cvrSampleList;
    private Integer darwinPatientId;
    private PatientDemographics patientDemographics;
    private List<PatientClinicalTrial> patientClinicalTrialList;
    private List<PatientIcdORecord> patientIcdORecordList;

    public String getCvrPatientId() { return this.cvrPatientId;}

    public PatientClinicalDataSummaryModel(String anId){
        Preconditions.checkArgument(!Strings.isNullOrEmpty(anId),"A CVR patient id is required");
        this.cvrPatientId = anId;
        this.patientDemographics = this.resolveDemographics();
        this.patientClinicalTrialList = this.resolvePatientClinicalTrials();
        this.patientIcdORecordList = this.resolvePatientIcdORecords();
        this.crdbDataset = this.resolveCrdbDatasetRecord();
    }

    private CrdbDataset resolveCrdbDatasetRecord() {
        Optional<CrdbDataset> crdbDatasetOptional = CrdbDataService.INSTANCE.resolveCrdbDatasetRecord(this.cvrPatientId);
        if(crdbDatasetOptional.isPresent()){
            return crdbDatasetOptional.get();
        }
        logger.info("Unable to find CRDB Dataset record for CVR patient id " +this.cvrPatientId);
        return null;
    }
    private List<PatientIcdORecord> resolvePatientIcdORecords() {
        Optional<List<PatientIcdORecord>> icdoOpt = DarwinDataService.INSTANCE
                .resolveIcdORecords(this.cvrPatientId);
        if(icdoOpt.isPresent()){
            return icdoOpt.get();
        }
        logger.info("Unable to find ICDO records for CVR patient id " +this.cvrPatientId);
        return new ArrayList<PatientIcdORecord>();
    }

    private List<PatientClinicalTrial> resolvePatientClinicalTrials() {
        Optional<List<PatientClinicalTrial>> pctOpt =
                DarwinDataService.INSTANCE.resolvePatientClinicalTrials(this.cvrPatientId);
        if (pctOpt.isPresent()){
            return pctOpt.get();
        }
        logger.info("Unable to find any clinical trials for patient id: " +this.cvrPatientId);
        return new ArrayList<PatientClinicalTrial>(); // empty list by default
    }

    private PatientDemographics resolveDemographics() {
        Optional<PatientDemographics> demoOpt = DarwinDataService.INSTANCE.resolvePatientDemographics(this.cvrPatientId);
        if(demoOpt.isPresent()){
            return demoOpt.get();
        }
        logger.error("Unable to find demographics for patient id: " + this.cvrPatientId);
        return null;
    }

    public PatientDemographics patientDemographics() { return this.patientDemographics;}
    public List<PatientClinicalTrial> patientClinicalTrials() { return this.patientClinicalTrialList;}
    public List<PatientIcdORecord> patientIcdORecords() { return this.patientIcdORecordList;}
    public CrdbDataset patientCrdbDataset(){return this.crdbDataset;}

    // main method for stand alone testing
    public static void main(String...args) {
        String cvrPatientId = "P-0002738";
        PatientClinicalDataSummaryModel model = new PatientClinicalDataSummaryModel(cvrPatientId);
        if(null != model){
            logger.info(">>Clinical Summary for patient id " +cvrPatientId);
            logger.info("++ Demographics:");
            logger.info("Gender: " +model.patientDemographics().getGENDER()
                    +" Marital status: " +model.patientDemographics().getPT_MARITAL_STS_DESC()
                    +" Vital status: " +model.patientDemographics().getPT_VITAL_STATUS());
            if(!model.patientClinicalTrials().isEmpty()){
                logger.info("++ Clinical Trial Records:");
                for(PatientClinicalTrial pct : model.patientClinicalTrials()){
                    logger.info("IRB No: " +pct.getCLIN_TRIAL_IRB_NO() +" IRB Title "
                    +pct.getCLIN_TRIAL_IRB_TITLE());
                }
            }
            if (!model.patientIcdORecords().isEmpty()){
                logger.info("++ ICD0 Records");
                for (PatientIcdORecord icdo : model.patientIcdORecords()){
                    logger.info("site code: " +icdo.getTM_SITE_CD() +" site description: "
                            +icdo.getTM_SITE_DESC() +" histology description: " +icdo.getTM_HIST_DESC());
                }
            }
            if(null != model.patientCrdbDataset()){
                logger.info("++ CRDB Dataset Record");
                logger.info(" primary disease: "+model.patientCrdbDataset().getPRIM_DISEASE_12245()
                        +" survival status " +model.patientCrdbDataset().getSURVIVAL_STATUS());

            }
        }
    }
}
