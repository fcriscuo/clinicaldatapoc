package org.mskcc.cbio.clinicaldata.service;

import org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio.PatientIcdORecordMapper;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientIcdORecord;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientIcdORecordExample;
import org.mskcc.cbio.clinicaldata.darwin.util.DarwinSessionManager;

import java.util.List;

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
 * Created by Fred Criscuolo on 9/6/15.
 * criscuof@mskcc.org
 */
public class DarwinIcdoService {

    public static void main (String...args){

        PatientIcdORecordExample icdORecordExample = new PatientIcdORecordExample();
        PatientIcdORecordMapper icdORecordMapper = DarwinSessionManager.INSTANCE.getDarwinSession()
                .getMapper(PatientIcdORecordMapper.class);

        icdORecordExample.clear();
        icdORecordExample.createCriteria().andDMP_ID_ICDOIsNotNull();
        List<PatientIcdORecord> recordList = icdORecordMapper.selectByExample(icdORecordExample);
        for ( PatientIcdORecord record : recordList){

            System.out.println("DMP ID " +record.getDMP_ID_ICDO() +" TM site code: " +record.getTM_SITE_CD()
            +" Laterality code: " +record.getTM_LATERALITY_CD()
                    +" Histology code: " +record.getTM_HIST_CD() +" TM resid code: " + record.getTM_RESID_TUMOR_CD());
        }
    }
}
