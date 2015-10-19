package org.mskcc.cbio.clinicaldata.darwin.util;

import com.google.api.client.repackaged.com.google.common.base.Strings;
import com.google.api.client.util.Lists;
import com.google.common.base.*;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio.PatientDmpPathologyReportMapper;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientDmpPathologyReport;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientDmpPathologyReportExample;
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
 * Created by Fred Criscuolo on 4/21/15.
 * criscuof@mskcc.org
 *
 * Represents a utility service that maintains an in-memory Map of
 * CVR patient ids (keys) to Darwin patient ids (values)
 */
public enum DarwinPatientIdentifierService {
    INSTANCE;
    private static final Logger logger = Logger.getLogger(DarwinPatientIdentifierService.class);
    private  final Map<String,Integer> patientIdMap =
            Suppliers.memoize(new PatientIdentifierMapSupplier()).get();

    public Optional<Integer> resolveDarwinPatientId( String cvrPatientId){
        if(!Strings.isNullOrEmpty(cvrPatientId) && patientIdMap.containsKey(cvrPatientId)){
            return Optional.of(patientIdMap.get(cvrPatientId));
        }
        return Optional.absent();
    }

    public static void main (String...args) {
        List<String> testCvrPatientId = Lists.newArrayList();
        testCvrPatientId.add("P-0003764");
        testCvrPatientId.add("XXXXXXX");
        for(String s : testCvrPatientId){
            Optional<Integer> idOpt = DarwinPatientIdentifierService.INSTANCE.resolveDarwinPatientId(s);
            if(idOpt.isPresent()){
                logger.info("CVR patient id: "+ s +" maps to Darwin id " + idOpt.get());
            } else {
                logger.info("Unable to resolve CVR patient id " +s);
            }
        }
    }

    /*
     private inner class that provides a complete Map of CVR patient id (key) to Darwin patient id value
     n.b. the Darwin view that serves as the source for these id attributes is sparsely populated for
     CVR patient ids. As a result, the CVR sample id is parsed to obtain the patient identifier.
     The CVR patient id is expected to be fully populated in the future and this code should be
     refactored to use it directly
     */
    private class PatientIdentifierMapSupplier implements Supplier<Map<String,Integer> > {
        private final Splitter tabSplitter = Splitter.on('-');
        private final Joiner tabJoiner = Joiner.on('-');
        @Override
        public Map<String, Integer> get() {
            final Map<String, Integer> idMap = Maps.newConcurrentMap();
            // cache for patient id mappings
            PatientDmpPathologyReportExample dmpIdExample = new PatientDmpPathologyReportExample();
            PatientDmpPathologyReportMapper dmpidMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
                    .getMapper(PatientDmpPathologyReportMapper.class);
            dmpIdExample.clear();
            dmpIdExample.createCriteria().andDMP_ID_PATH_DMPIsNotNull();
            Observable<PatientDmpPathologyReport> idObservable = Observable.from(dmpidMapper.selectByExample(dmpIdExample));
            idObservable.subscribe(new Subscriber<PatientDmpPathologyReport>() {
                @Override
                public void onCompleted() {
                }
                @Override
                public void onError(Throwable throwable) {
                    logger.error(throwable.getMessage());
                    throwable.printStackTrace();
                }
                @Override
                public void onNext(PatientDmpPathologyReport patientDmpPathologyReport) {
                    List<String> sampleParts = tabSplitter.splitToList(patientDmpPathologyReport.getSAMPLE_ID_PATH_DMP());
                    String cvrPatientId = tabJoiner.join(sampleParts.get(0), sampleParts.get(1));
                    idMap.put(cvrPatientId, patientDmpPathologyReport.getPT_ID_PATH_DMP());
                }
            });
            return idMap;
        }

    }
}
