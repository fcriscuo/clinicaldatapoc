package org.mskcc.cbio.clinicaldata.cbiodata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.api.client.repackaged.com.google.common.base.Preconditions;
import com.google.api.client.repackaged.com.google.common.base.Strings;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import org.apache.log4j.Logger;
import org.mskcc.cbio.clinicaldata.cbiodata.cache.CbioDataService;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioClinicalAttribute;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioClinicalPatient;

import javax.annotation.Nullable;

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
 * Created by Fred Criscuolo on 5/4/15.
 * criscuof@mskcc.org
 */
/*
represents a combination of columns from the clinical_attribute and clinical_patient tables for a
specific CVR patient id and clinical attribute id
 */
public class PatientCbioClinicalDataAttribute {
    private static final Logger logger = Logger.getLogger(PatientCbioClinicalDataAttribute.class);

    private final String cvrPatientId;
    private final String attributeId;
    private String attributeValue;
    private String displayName;
    private String description;
    private String dataType;

    public PatientCbioClinicalDataAttribute(String anId, String attrId){
        Preconditions.checkArgument(!Strings.isNullOrEmpty(anId),
                "A CVR patient id is required");
        Preconditions.checkArgument(!Strings.isNullOrEmpty(attrId),
                "A clinical attribute id is required");
        this.cvrPatientId = anId;
        this.attributeId = attrId;
        this.resolveClinicalAttributeData();
        this.resolveClinicalPatientData();

    }
    @Override
    public String toString() {
        return new StringBuilder()
                .append("Patient_id: " +this.getCvrPatientId())
                .append(" *attribute_id: " +this.getAttributeId())
                .append(" *attribute_value: " +this.getAttributeValue())
                .append(" *display_name: " +this.getDisplayName())
                .append(" *description: " +this.getDescription())
                .append(" *data_type: " +this.getDataType()).toString();
    }

    private void resolveClinicalPatientData() {

       this.attributeValue = FluentIterable.from( CbioDataService.INSTANCE.resolveClinicalPatientListByCvrPatientId(this.cvrPatientId))
               .filter(new Predicate<CbioClinicalPatient>() {
                   @Override
                   public boolean apply(CbioClinicalPatient clinPatient) {
                       return clinPatient.getATTR_ID().equals(attributeId);
                   }
               })
               .transform(new Function<CbioClinicalPatient, String>() {
                   @Nullable
                   @Override
                   public String apply(CbioClinicalPatient clinPatient) {
                       return clinPatient.getATTR_VALUE();
                   }
               }).first().get();
    }
    /*
    private method to extract column values from the cbio clinical_attribute table
     */
    private void resolveClinicalAttributeData(){
       Optional<CbioClinicalAttribute> caOpt =  CbioDataService.INSTANCE.resolveClinicalAttributeByAttributeId(this.attributeId);
        if(caOpt.isPresent()){
            this.displayName = caOpt.get().getDISPLAY_NAME();
            this.description = caOpt.get().getDESCRIPTION();
             this.dataType = caOpt.get().getDATATYPE();
        } else {
            logger.error("Unable to resolve cbio clinical attribute id " +this.attributeId +" for patient id " +this.cvrPatientId);
        }
    }

    @JsonProperty
    public String getCvrPatientId() {
        return cvrPatientId;
    }
    @JsonProperty
    public String getAttributeId() {
        return attributeId;
    }
    @JsonProperty
    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
    @JsonProperty
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    @JsonProperty
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    // main method for stand alone testing
    public static void main(String...args){
        String testCvrPatientId = "P-0002738";
        String attributeId = "PRIMARY_SITE";
        PatientCbioClinicalDataAttribute pcda = new PatientCbioClinicalDataAttribute(testCvrPatientId, attributeId);
        logger.info(pcda);

    }
}
