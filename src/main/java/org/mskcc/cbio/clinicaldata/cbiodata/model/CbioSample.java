package org.mskcc.cbio.clinicaldata.cbiodata.model;

public class CbioSample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.INTERNAL_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Integer INTERNAL_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.STABLE_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String STABLE_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.SAMPLE_TYPE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String SAMPLE_TYPE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.PATIENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Integer PATIENT_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.TYPE_OF_CANCER_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String TYPE_OF_CANCER_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.INTERNAL_ID
     *
     * @return the value of sample.INTERNAL_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Integer getINTERNAL_ID() {
        return INTERNAL_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.INTERNAL_ID
     *
     * @param INTERNAL_ID the value for sample.INTERNAL_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setINTERNAL_ID(Integer INTERNAL_ID) {
        this.INTERNAL_ID = INTERNAL_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.STABLE_ID
     *
     * @return the value of sample.STABLE_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getSTABLE_ID() {
        return STABLE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.STABLE_ID
     *
     * @param STABLE_ID the value for sample.STABLE_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setSTABLE_ID(String STABLE_ID) {
        this.STABLE_ID = STABLE_ID == null ? null : STABLE_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.SAMPLE_TYPE
     *
     * @return the value of sample.SAMPLE_TYPE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getSAMPLE_TYPE() {
        return SAMPLE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.SAMPLE_TYPE
     *
     * @param SAMPLE_TYPE the value for sample.SAMPLE_TYPE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setSAMPLE_TYPE(String SAMPLE_TYPE) {
        this.SAMPLE_TYPE = SAMPLE_TYPE == null ? null : SAMPLE_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.PATIENT_ID
     *
     * @return the value of sample.PATIENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Integer getPATIENT_ID() {
        return PATIENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.PATIENT_ID
     *
     * @param PATIENT_ID the value for sample.PATIENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setPATIENT_ID(Integer PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.TYPE_OF_CANCER_ID
     *
     * @return the value of sample.TYPE_OF_CANCER_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getTYPE_OF_CANCER_ID() {
        return TYPE_OF_CANCER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.TYPE_OF_CANCER_ID
     *
     * @param TYPE_OF_CANCER_ID the value for sample.TYPE_OF_CANCER_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setTYPE_OF_CANCER_ID(String TYPE_OF_CANCER_ID) {
        this.TYPE_OF_CANCER_ID = TYPE_OF_CANCER_ID == null ? null : TYPE_OF_CANCER_ID.trim();
    }
}