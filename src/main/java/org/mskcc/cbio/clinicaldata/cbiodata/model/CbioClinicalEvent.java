package org.mskcc.cbio.clinicaldata.cbiodata.model;

public class CbioClinicalEvent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clinical_event.CLINICAL_EVENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Integer CLINICAL_EVENT_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clinical_event.PATIENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Integer PATIENT_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clinical_event.START_DATE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Integer START_DATE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clinical_event.STOP_DATE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Integer STOP_DATE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clinical_event.EVENT_TYPE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String EVENT_TYPE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clinical_event.CLINICAL_EVENT_ID
     *
     * @return the value of clinical_event.CLINICAL_EVENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Integer getCLINICAL_EVENT_ID() {
        return CLINICAL_EVENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clinical_event.CLINICAL_EVENT_ID
     *
     * @param CLINICAL_EVENT_ID the value for clinical_event.CLINICAL_EVENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setCLINICAL_EVENT_ID(Integer CLINICAL_EVENT_ID) {
        this.CLINICAL_EVENT_ID = CLINICAL_EVENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clinical_event.PATIENT_ID
     *
     * @return the value of clinical_event.PATIENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Integer getPATIENT_ID() {
        return PATIENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clinical_event.PATIENT_ID
     *
     * @param PATIENT_ID the value for clinical_event.PATIENT_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setPATIENT_ID(Integer PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clinical_event.START_DATE
     *
     * @return the value of clinical_event.START_DATE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Integer getSTART_DATE() {
        return START_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clinical_event.START_DATE
     *
     * @param START_DATE the value for clinical_event.START_DATE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setSTART_DATE(Integer START_DATE) {
        this.START_DATE = START_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clinical_event.STOP_DATE
     *
     * @return the value of clinical_event.STOP_DATE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Integer getSTOP_DATE() {
        return STOP_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clinical_event.STOP_DATE
     *
     * @param STOP_DATE the value for clinical_event.STOP_DATE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setSTOP_DATE(Integer STOP_DATE) {
        this.STOP_DATE = STOP_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clinical_event.EVENT_TYPE
     *
     * @return the value of clinical_event.EVENT_TYPE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getEVENT_TYPE() {
        return EVENT_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clinical_event.EVENT_TYPE
     *
     * @param EVENT_TYPE the value for clinical_event.EVENT_TYPE
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setEVENT_TYPE(String EVENT_TYPE) {
        this.EVENT_TYPE = EVENT_TYPE == null ? null : EVENT_TYPE.trim();
    }
}