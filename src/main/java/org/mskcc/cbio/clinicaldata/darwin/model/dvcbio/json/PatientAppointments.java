package org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.api.client.util.Lists;
import org.mskcc.cbio.clinicaldata.common.JsonModelObject;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientAppointment;

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
 * Created by Fred Criscuolo on 5/11/15.
 * criscuof@mskcc.org
 */
public class PatientAppointments extends JsonModelObject {

    private List<PatientAppointment> patientAppointments;

    public PatientAppointments(String anId){
        super(anId);
        this.patientAppointments = Lists.newArrayList();
    }

    @JsonProperty
    List <PatientAppointment> getPatientAppointments() { return this.patientAppointments;}
}
