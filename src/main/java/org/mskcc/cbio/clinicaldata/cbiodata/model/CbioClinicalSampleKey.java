package org.mskcc.cbio.clinicaldata.cbiodata.model;

public class CbioClinicalSampleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clinical_sample.INTERNAL_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Integer INTERNAL_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clinical_sample.ATTR_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String ATTR_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clinical_sample.INTERNAL_ID
     *
     * @return the value of clinical_sample.INTERNAL_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Integer getINTERNAL_ID() {
        return INTERNAL_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clinical_sample.INTERNAL_ID
     *
     * @param INTERNAL_ID the value for clinical_sample.INTERNAL_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setINTERNAL_ID(Integer INTERNAL_ID) {
        this.INTERNAL_ID = INTERNAL_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clinical_sample.ATTR_ID
     *
     * @return the value of clinical_sample.ATTR_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getATTR_ID() {
        return ATTR_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clinical_sample.ATTR_ID
     *
     * @param ATTR_ID the value for clinical_sample.ATTR_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setATTR_ID(String ATTR_ID) {
        this.ATTR_ID = ATTR_ID == null ? null : ATTR_ID.trim();
    }
}