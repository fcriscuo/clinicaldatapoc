package org.mskcc.cbio.clinicaldata.darwin.model.dvcbio;

public class PatientInpatientRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.PT_ID_INPATIENT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer PT_ID_INPATIENT;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.DMP_ID_INPATIENT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String DMP_ID_INPATIENT;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.ADMISSION_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer ADMISSION_YEAR;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.AGE_AT_ADMISSION_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer AGE_AT_ADMISSION_DATE_IN_DAYS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.DISCHARGE_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer DISCHARGE_YEAR;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.AGE_AT_DISCHARGE_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer AGE_AT_DISCHARGE_DATE_IN_DAYS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.LENGTH_OF_STAY
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer LENGTH_OF_STAY;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String DISCHARGE_DISPOSITION_CODE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String DISCHARGE_DISPOSITION;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.ADMISSION_REASON_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ADMISSION_REASON_CODE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.ADMISSION_REASON
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ADMISSION_REASON;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.CASE_STATUS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String CASE_STATUS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.HOSP_SVC_CD_AT_DISCHARGE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String HOSP_SVC_CD_AT_DISCHARGE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.INPATIENT_V.HOSP_SVC_DESC_AT_DISCHARGE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String HOSP_SVC_DESC_AT_DISCHARGE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.PT_ID_INPATIENT
     *
     * @return the value of DVCBIO.INPATIENT_V.PT_ID_INPATIENT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getPT_ID_INPATIENT() {
        return PT_ID_INPATIENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.PT_ID_INPATIENT
     *
     * @param PT_ID_INPATIENT the value for DVCBIO.INPATIENT_V.PT_ID_INPATIENT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setPT_ID_INPATIENT(Integer PT_ID_INPATIENT) {
        this.PT_ID_INPATIENT = PT_ID_INPATIENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.DMP_ID_INPATIENT
     *
     * @return the value of DVCBIO.INPATIENT_V.DMP_ID_INPATIENT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getDMP_ID_INPATIENT() {
        return DMP_ID_INPATIENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.DMP_ID_INPATIENT
     *
     * @param DMP_ID_INPATIENT the value for DVCBIO.INPATIENT_V.DMP_ID_INPATIENT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDMP_ID_INPATIENT(String DMP_ID_INPATIENT) {
        this.DMP_ID_INPATIENT = DMP_ID_INPATIENT == null ? null : DMP_ID_INPATIENT.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.ADMISSION_YEAR
     *
     * @return the value of DVCBIO.INPATIENT_V.ADMISSION_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getADMISSION_YEAR() {
        return ADMISSION_YEAR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.ADMISSION_YEAR
     *
     * @param ADMISSION_YEAR the value for DVCBIO.INPATIENT_V.ADMISSION_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setADMISSION_YEAR(Integer ADMISSION_YEAR) {
        this.ADMISSION_YEAR = ADMISSION_YEAR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.AGE_AT_ADMISSION_DATE_IN_DAYS
     *
     * @return the value of DVCBIO.INPATIENT_V.AGE_AT_ADMISSION_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getAGE_AT_ADMISSION_DATE_IN_DAYS() {
        return AGE_AT_ADMISSION_DATE_IN_DAYS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.AGE_AT_ADMISSION_DATE_IN_DAYS
     *
     * @param AGE_AT_ADMISSION_DATE_IN_DAYS the value for DVCBIO.INPATIENT_V.AGE_AT_ADMISSION_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setAGE_AT_ADMISSION_DATE_IN_DAYS(Integer AGE_AT_ADMISSION_DATE_IN_DAYS) {
        this.AGE_AT_ADMISSION_DATE_IN_DAYS = AGE_AT_ADMISSION_DATE_IN_DAYS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.DISCHARGE_YEAR
     *
     * @return the value of DVCBIO.INPATIENT_V.DISCHARGE_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getDISCHARGE_YEAR() {
        return DISCHARGE_YEAR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.DISCHARGE_YEAR
     *
     * @param DISCHARGE_YEAR the value for DVCBIO.INPATIENT_V.DISCHARGE_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDISCHARGE_YEAR(Integer DISCHARGE_YEAR) {
        this.DISCHARGE_YEAR = DISCHARGE_YEAR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.AGE_AT_DISCHARGE_DATE_IN_DAYS
     *
     * @return the value of DVCBIO.INPATIENT_V.AGE_AT_DISCHARGE_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getAGE_AT_DISCHARGE_DATE_IN_DAYS() {
        return AGE_AT_DISCHARGE_DATE_IN_DAYS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.AGE_AT_DISCHARGE_DATE_IN_DAYS
     *
     * @param AGE_AT_DISCHARGE_DATE_IN_DAYS the value for DVCBIO.INPATIENT_V.AGE_AT_DISCHARGE_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setAGE_AT_DISCHARGE_DATE_IN_DAYS(Integer AGE_AT_DISCHARGE_DATE_IN_DAYS) {
        this.AGE_AT_DISCHARGE_DATE_IN_DAYS = AGE_AT_DISCHARGE_DATE_IN_DAYS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.LENGTH_OF_STAY
     *
     * @return the value of DVCBIO.INPATIENT_V.LENGTH_OF_STAY
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getLENGTH_OF_STAY() {
        return LENGTH_OF_STAY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.LENGTH_OF_STAY
     *
     * @param LENGTH_OF_STAY the value for DVCBIO.INPATIENT_V.LENGTH_OF_STAY
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setLENGTH_OF_STAY(Integer LENGTH_OF_STAY) {
        this.LENGTH_OF_STAY = LENGTH_OF_STAY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION_CODE
     *
     * @return the value of DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getDISCHARGE_DISPOSITION_CODE() {
        return DISCHARGE_DISPOSITION_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION_CODE
     *
     * @param DISCHARGE_DISPOSITION_CODE the value for DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDISCHARGE_DISPOSITION_CODE(String DISCHARGE_DISPOSITION_CODE) {
        this.DISCHARGE_DISPOSITION_CODE = DISCHARGE_DISPOSITION_CODE == null ? null : DISCHARGE_DISPOSITION_CODE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION
     *
     * @return the value of DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getDISCHARGE_DISPOSITION() {
        return DISCHARGE_DISPOSITION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION
     *
     * @param DISCHARGE_DISPOSITION the value for DVCBIO.INPATIENT_V.DISCHARGE_DISPOSITION
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDISCHARGE_DISPOSITION(String DISCHARGE_DISPOSITION) {
        this.DISCHARGE_DISPOSITION = DISCHARGE_DISPOSITION == null ? null : DISCHARGE_DISPOSITION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.ADMISSION_REASON_CODE
     *
     * @return the value of DVCBIO.INPATIENT_V.ADMISSION_REASON_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getADMISSION_REASON_CODE() {
        return ADMISSION_REASON_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.ADMISSION_REASON_CODE
     *
     * @param ADMISSION_REASON_CODE the value for DVCBIO.INPATIENT_V.ADMISSION_REASON_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setADMISSION_REASON_CODE(String ADMISSION_REASON_CODE) {
        this.ADMISSION_REASON_CODE = ADMISSION_REASON_CODE == null ? null : ADMISSION_REASON_CODE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.ADMISSION_REASON
     *
     * @return the value of DVCBIO.INPATIENT_V.ADMISSION_REASON
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getADMISSION_REASON() {
        return ADMISSION_REASON;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.ADMISSION_REASON
     *
     * @param ADMISSION_REASON the value for DVCBIO.INPATIENT_V.ADMISSION_REASON
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setADMISSION_REASON(String ADMISSION_REASON) {
        this.ADMISSION_REASON = ADMISSION_REASON == null ? null : ADMISSION_REASON.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.CASE_STATUS
     *
     * @return the value of DVCBIO.INPATIENT_V.CASE_STATUS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getCASE_STATUS() {
        return CASE_STATUS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.CASE_STATUS
     *
     * @param CASE_STATUS the value for DVCBIO.INPATIENT_V.CASE_STATUS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCASE_STATUS(String CASE_STATUS) {
        this.CASE_STATUS = CASE_STATUS == null ? null : CASE_STATUS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.HOSP_SVC_CD_AT_DISCHARGE
     *
     * @return the value of DVCBIO.INPATIENT_V.HOSP_SVC_CD_AT_DISCHARGE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getHOSP_SVC_CD_AT_DISCHARGE() {
        return HOSP_SVC_CD_AT_DISCHARGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.HOSP_SVC_CD_AT_DISCHARGE
     *
     * @param HOSP_SVC_CD_AT_DISCHARGE the value for DVCBIO.INPATIENT_V.HOSP_SVC_CD_AT_DISCHARGE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setHOSP_SVC_CD_AT_DISCHARGE(String HOSP_SVC_CD_AT_DISCHARGE) {
        this.HOSP_SVC_CD_AT_DISCHARGE = HOSP_SVC_CD_AT_DISCHARGE == null ? null : HOSP_SVC_CD_AT_DISCHARGE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.INPATIENT_V.HOSP_SVC_DESC_AT_DISCHARGE
     *
     * @return the value of DVCBIO.INPATIENT_V.HOSP_SVC_DESC_AT_DISCHARGE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getHOSP_SVC_DESC_AT_DISCHARGE() {
        return HOSP_SVC_DESC_AT_DISCHARGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.INPATIENT_V.HOSP_SVC_DESC_AT_DISCHARGE
     *
     * @param HOSP_SVC_DESC_AT_DISCHARGE the value for DVCBIO.INPATIENT_V.HOSP_SVC_DESC_AT_DISCHARGE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setHOSP_SVC_DESC_AT_DISCHARGE(String HOSP_SVC_DESC_AT_DISCHARGE) {
        this.HOSP_SVC_DESC_AT_DISCHARGE = HOSP_SVC_DESC_AT_DISCHARGE == null ? null : HOSP_SVC_DESC_AT_DISCHARGE.trim();
    }
}