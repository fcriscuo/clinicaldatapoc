package org.mskcc.cbio.clinicaldata.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.util.Lists;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.common.util.concurrent.*;
import org.apache.log4j.Logger;
import org.mskcc.cbio.clinicaldata.cbiodata.PatientCbioClinicalDataAttribute;
import org.mskcc.cbio.clinicaldata.cbiodata.cache.CbioDataService;
import org.mskcc.cbio.clinicaldata.darwin.cache.DarwinDataService;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientClinicalNote;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientClinicalTrial;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientInpatientRecord;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.json.PatientClinicalNotes;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.json.PatientClinicalTrials;
import org.mskcc.cbio.clinicaldata.model.PatientClinicalDataSummaryModel;
import rx.Observable;
import rx.functions.Action1;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

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
 * Created by Fred Criscuolo on 5/3/15.
 * criscuof@mskcc.org
 */
public enum PatientClinicalDataService {
    INSTANCE;
    private static final Logger logger = Logger.getLogger(PatientClinicalDataService.class);
    final ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(4));

    public void shutdown() {
        this.service.shutdown();
        logger.info("Executor service shutdown");
    }

    public Optional<List<PatientClinicalDataSummaryModel>> resolveClinicalDataSummaryListByCvrPatientIdList (List<String> patientIdList){
       if( null == patientIdList || patientIdList.isEmpty()){
           logger.error("A list of CVR patient ids is required");
           return Optional.absent();
       }
        List<PatientClinicalDataSummaryModel> patientSummaryList =FluentIterable.from(patientIdList)
                .transform(new Function<String,PatientClinicalDataSummaryModel>() {
                    @Nullable
                    @Override
                    public PatientClinicalDataSummaryModel apply(String cvrPatientId) {
                        return new PatientClinicalDataSummaryModel(cvrPatientId);
                    }
                }).toList();
        if(patientSummaryList.size() >0){
            prefetchClinicalData(patientIdList);
            return Optional.of(patientSummaryList);
        }
        return Optional.absent();
    }

    private void prefetchClinicalData(List<String> patientIdList){
        ListenableFuture<String> lf = service.submit(new ClinicalDataFetcher(patientIdList));
        Futures.addCallback(lf, new FutureCallback<String>() {
            @Override
            public void onSuccess(@Nullable String result) {
                logger.info("clinical data prefetch completed at " +System.currentTimeMillis());
                logger.info(result);
            }

            @Override
            public void onFailure(Throwable t) {
                logger.error(t.getMessage());
                t.printStackTrace();
            }
        });

    }

    public List<PatientInpatientRecord> resolvePatientAppointmentsByCvrPatientId(String cvrPatientId){
        Optional<List<PatientInpatientRecord>> inPatListOpt =DarwinDataService.INSTANCE.resolveInpatientRecordsByCVRPatientId(cvrPatientId);
        if (inPatListOpt.isPresent()){
            return inPatListOpt.get();
        }
        return new ArrayList<PatientInpatientRecord>();
    }
    private class ClinicalDataFetcher implements Callable<String> {
        private final List<String > cvrPatientIdList;
        private final Joiner newLineJoiner = Joiner.on("\n");
        ClinicalDataFetcher(List<String> aPatientIdList){
            this.cvrPatientIdList = aPatientIdList;
        }

        @Override
        public String call() throws Exception {

            List<String> resultList = FluentIterable.from(this.cvrPatientIdList)
                    .transform(new Function<String, String>() {
                        @Nullable
                        @Override
                        public String apply(@Nullable String cvrPatientId) {
                            DarwinDataService.INSTANCE.resolveInpatientRecordsByCVRPatientId(cvrPatientId);
                            DarwinDataService.INSTANCE.resolvePatientClinicalNotesByCvrPatientId(cvrPatientId);
                            DarwinDataService.INSTANCE.resolvePatientFirstActivity(cvrPatientId);
                            DarwinDataService.INSTANCE.resolvePatientLabResultRecordsByCVRPatientId(cvrPatientId);
                            DarwinDataService.INSTANCE.resolvePatientLatestActivityByCvrPatientId(cvrPatientId);
                            DarwinDataService.INSTANCE.resolvePatientPathologyReportsByCvrPatientId(cvrPatientId);
                            DarwinDataService.INSTANCE.resolvePatientPharamacyRecordListByCvrPatientId(cvrPatientId);
                            DarwinDataService.INSTANCE.resolvePatientPharamacyRecordListByCvrPatientId(cvrPatientId);
                            CbioDataService.INSTANCE.resolvePatientClinicalDataAttributeListByCvrPatientId(cvrPatientId);

                            return "Clinical data for patient " +cvrPatientId +" prefetched\n";
                        }
                    }).toList();
            return newLineJoiner.join(resultList);
        }
    }

    public static void main(String...args){

        List<String> patientIdList = Lists.newArrayList();
        patientIdList.add("P-0002738");
        patientIdList.add("P-0002603");
        patientIdList.add("P-0003014");
        final ObjectMapper mapper = new ObjectMapper();
        Optional<List<PatientClinicalDataSummaryModel>> modelListOpt =
                PatientClinicalDataService.INSTANCE.resolveClinicalDataSummaryListByCvrPatientIdList(patientIdList);
        if(modelListOpt.isPresent()){
            logger.info("Patient clinical data  summary records obtained at " + System.currentTimeMillis());
            Observable<PatientClinicalDataSummaryModel> summaryModelObs = Observable.from(modelListOpt.get());
            summaryModelObs.subscribe(new Action1<PatientClinicalDataSummaryModel>() {
                @Override
                public void call(PatientClinicalDataSummaryModel model) {
                    logger.info("+++Patient Clinical Data Summary for patient " + model.getCvrPatientId());
                    if (null != model.patientDemographics()) {
                        logger.info("Demographics: " + model.patientDemographics().getPT_SEX_DESC() + " " + model.patientDemographics().getPT_VITAL_STATUS());
                        File demographicsFile = new File("/tmp/" + model.getCvrPatientId() + "_demo.txt");
                        List<String> lineList = Lists.newArrayList();
                        try {
                            lineList.add(mapper.writeValueAsString(model.patientDemographics()));
                            PatientClinicalTrials clinicalTrials = new PatientClinicalTrials(model.getCvrPatientId());
                            for (PatientClinicalTrial pct : model.patientClinicalTrials()) {

                                clinicalTrials.getClinicalTrials().add(pct);
                            }

                            lineList.add(clinicalTrials.generateJson());
                            // get this patient's clinical notes
                            PatientClinicalNotes clinicalNotes = new PatientClinicalNotes(model.getCvrPatientId());
                            Optional<List<PatientClinicalNote>> patClinNoteOpt = DarwinDataService.INSTANCE.resolvePatientClinicalNotesByCvrPatientId(model.getCvrPatientId());
                            if (patClinNoteOpt.isPresent()) {
                                for (PatientClinicalNote clinNote : patClinNoteOpt.get()){
                                    clinicalNotes.getPatientClinicalNotes().add(clinNote);
                                }
                                lineList.add(clinicalNotes.generateJson());
                            }
                            Files.write(Paths.get("/tmp/" + model.getCvrPatientId() + "_demo.json"), lineList, Charset.defaultCharset());
                        } catch (IOException e) {
                            logger.error(e.getMessage());
                            e.printStackTrace();
                        }
                    } else {
                        logger.info("Patient " + model.getCvrPatientId() + " does not have a demographics record");
                    }
                    if (null != model.patientCrdbDataset()) {
                        logger.info("CRDB data: " + model.patientCrdbDataset().getPRIM_DISEASE_12245());
                    } else {
                        logger.info("CRDB data unavailable for patient " + model.getCvrPatientId());
                    }
                }
            });

        }
        // shutdown the executor
        try {
            logger.info("Pause to allow data prefetches to complete asynchronously");
            Thread.sleep(10000L); // give the prefetches time to complete
            logger.info("Fetch cbio clinical attributes for a patient");
            Optional<List<PatientCbioClinicalDataAttribute>> clinAttrListOpt =
                    CbioDataService.INSTANCE.resolvePatientClinicalDataAttributeListByCvrPatientId("P-0002738");
            if(clinAttrListOpt.isPresent()){
                logger.info(">> CBIO Clinical Attributes for patient p-0002738");
                for (PatientCbioClinicalDataAttribute attr : clinAttrListOpt.get()){
                    logger.info(attr);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PatientClinicalDataService.INSTANCE.shutdown();
    }
}
