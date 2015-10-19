package org.mskcc.cbio.clinicaldata.darwin.model.dvcbio;

import java.util.Date;

public class PatientAppointment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.PT_ID_APPT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer PT_ID_APPT;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.DMP_ID_APPT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String DMP_ID_APPT;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.ENCOUNTER_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer ENCOUNTER_YEAR;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.AGE_AT_ENCOUNTER_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer AGE_AT_ENCOUNTER_DATE_IN_DAYS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_DEPT_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String PRIMARY_RESOURCE_DEPT_NAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String PRIMARY_RESOURCE_NAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_TYPE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String PRIMARY_RESOURCE_TYPE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.ENCOUNTER_STATUS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ENCOUNTER_STATUS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.IP_OP_INDICATOR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String IP_OP_INDICATOR;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.DEPARTMENT_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String DEPARTMENT_NAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_ABBREV
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String VISIT_TYPE_ABBREV;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String VISIT_TYPE_NAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_EXTERNAL_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String VISIT_TYPE_EXTERNAL_NAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DEPT_DESC_GROUP_6
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String CLINICAL_DEPT_DESC_GROUP_6;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DEPARTMENT_GROUP_6
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String CLINICAL_DEPARTMENT_GROUP_6;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_GROUP_7
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String CLINICAL_DIVISION_GROUP_7;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_DESC_GROUP_7
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String CLINICAL_DIVISION_DESC_GROUP_7;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_GROUP_8
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String CLINICAL_SERVICE_GROUP_8;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_DESC_GROUP_8
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String CLINICAL_SERVICE_DESC_GROUP_8;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.CHECK_IN_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Date CHECK_IN_TIME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.CHECK_OUT_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Date CHECK_OUT_TIME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.ROOM_IN_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Date ROOM_IN_TIME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.APPOINTMENTS_V.ROOM_OUT_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Date ROOM_OUT_TIME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.PT_ID_APPT
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.PT_ID_APPT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getPT_ID_APPT() {
        return PT_ID_APPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.PT_ID_APPT
     *
     * @param PT_ID_APPT the value for DVCBIO.APPOINTMENTS_V.PT_ID_APPT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setPT_ID_APPT(Integer PT_ID_APPT) {
        this.PT_ID_APPT = PT_ID_APPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.DMP_ID_APPT
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.DMP_ID_APPT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getDMP_ID_APPT() {
        return DMP_ID_APPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.DMP_ID_APPT
     *
     * @param DMP_ID_APPT the value for DVCBIO.APPOINTMENTS_V.DMP_ID_APPT
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDMP_ID_APPT(String DMP_ID_APPT) {
        this.DMP_ID_APPT = DMP_ID_APPT == null ? null : DMP_ID_APPT.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.ENCOUNTER_YEAR
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.ENCOUNTER_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getENCOUNTER_YEAR() {
        return ENCOUNTER_YEAR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.ENCOUNTER_YEAR
     *
     * @param ENCOUNTER_YEAR the value for DVCBIO.APPOINTMENTS_V.ENCOUNTER_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setENCOUNTER_YEAR(Integer ENCOUNTER_YEAR) {
        this.ENCOUNTER_YEAR = ENCOUNTER_YEAR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.AGE_AT_ENCOUNTER_DATE_IN_DAYS
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.AGE_AT_ENCOUNTER_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getAGE_AT_ENCOUNTER_DATE_IN_DAYS() {
        return AGE_AT_ENCOUNTER_DATE_IN_DAYS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.AGE_AT_ENCOUNTER_DATE_IN_DAYS
     *
     * @param AGE_AT_ENCOUNTER_DATE_IN_DAYS the value for DVCBIO.APPOINTMENTS_V.AGE_AT_ENCOUNTER_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setAGE_AT_ENCOUNTER_DATE_IN_DAYS(Integer AGE_AT_ENCOUNTER_DATE_IN_DAYS) {
        this.AGE_AT_ENCOUNTER_DATE_IN_DAYS = AGE_AT_ENCOUNTER_DATE_IN_DAYS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_DEPT_NAME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_DEPT_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getPRIMARY_RESOURCE_DEPT_NAME() {
        return PRIMARY_RESOURCE_DEPT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_DEPT_NAME
     *
     * @param PRIMARY_RESOURCE_DEPT_NAME the value for DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_DEPT_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setPRIMARY_RESOURCE_DEPT_NAME(String PRIMARY_RESOURCE_DEPT_NAME) {
        this.PRIMARY_RESOURCE_DEPT_NAME = PRIMARY_RESOURCE_DEPT_NAME == null ? null : PRIMARY_RESOURCE_DEPT_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_NAME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getPRIMARY_RESOURCE_NAME() {
        return PRIMARY_RESOURCE_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_NAME
     *
     * @param PRIMARY_RESOURCE_NAME the value for DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setPRIMARY_RESOURCE_NAME(String PRIMARY_RESOURCE_NAME) {
        this.PRIMARY_RESOURCE_NAME = PRIMARY_RESOURCE_NAME == null ? null : PRIMARY_RESOURCE_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_TYPE
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_TYPE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getPRIMARY_RESOURCE_TYPE() {
        return PRIMARY_RESOURCE_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_TYPE
     *
     * @param PRIMARY_RESOURCE_TYPE the value for DVCBIO.APPOINTMENTS_V.PRIMARY_RESOURCE_TYPE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setPRIMARY_RESOURCE_TYPE(String PRIMARY_RESOURCE_TYPE) {
        this.PRIMARY_RESOURCE_TYPE = PRIMARY_RESOURCE_TYPE == null ? null : PRIMARY_RESOURCE_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.ENCOUNTER_STATUS
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.ENCOUNTER_STATUS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getENCOUNTER_STATUS() {
        return ENCOUNTER_STATUS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.ENCOUNTER_STATUS
     *
     * @param ENCOUNTER_STATUS the value for DVCBIO.APPOINTMENTS_V.ENCOUNTER_STATUS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setENCOUNTER_STATUS(String ENCOUNTER_STATUS) {
        this.ENCOUNTER_STATUS = ENCOUNTER_STATUS == null ? null : ENCOUNTER_STATUS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.IP_OP_INDICATOR
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.IP_OP_INDICATOR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getIP_OP_INDICATOR() {
        return IP_OP_INDICATOR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.IP_OP_INDICATOR
     *
     * @param IP_OP_INDICATOR the value for DVCBIO.APPOINTMENTS_V.IP_OP_INDICATOR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setIP_OP_INDICATOR(String IP_OP_INDICATOR) {
        this.IP_OP_INDICATOR = IP_OP_INDICATOR == null ? null : IP_OP_INDICATOR.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.DEPARTMENT_NAME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.DEPARTMENT_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getDEPARTMENT_NAME() {
        return DEPARTMENT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.DEPARTMENT_NAME
     *
     * @param DEPARTMENT_NAME the value for DVCBIO.APPOINTMENTS_V.DEPARTMENT_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDEPARTMENT_NAME(String DEPARTMENT_NAME) {
        this.DEPARTMENT_NAME = DEPARTMENT_NAME == null ? null : DEPARTMENT_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_ABBREV
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.VISIT_TYPE_ABBREV
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getVISIT_TYPE_ABBREV() {
        return VISIT_TYPE_ABBREV;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_ABBREV
     *
     * @param VISIT_TYPE_ABBREV the value for DVCBIO.APPOINTMENTS_V.VISIT_TYPE_ABBREV
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setVISIT_TYPE_ABBREV(String VISIT_TYPE_ABBREV) {
        this.VISIT_TYPE_ABBREV = VISIT_TYPE_ABBREV == null ? null : VISIT_TYPE_ABBREV.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_NAME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.VISIT_TYPE_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getVISIT_TYPE_NAME() {
        return VISIT_TYPE_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_NAME
     *
     * @param VISIT_TYPE_NAME the value for DVCBIO.APPOINTMENTS_V.VISIT_TYPE_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setVISIT_TYPE_NAME(String VISIT_TYPE_NAME) {
        this.VISIT_TYPE_NAME = VISIT_TYPE_NAME == null ? null : VISIT_TYPE_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_EXTERNAL_NAME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.VISIT_TYPE_EXTERNAL_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getVISIT_TYPE_EXTERNAL_NAME() {
        return VISIT_TYPE_EXTERNAL_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.VISIT_TYPE_EXTERNAL_NAME
     *
     * @param VISIT_TYPE_EXTERNAL_NAME the value for DVCBIO.APPOINTMENTS_V.VISIT_TYPE_EXTERNAL_NAME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setVISIT_TYPE_EXTERNAL_NAME(String VISIT_TYPE_EXTERNAL_NAME) {
        this.VISIT_TYPE_EXTERNAL_NAME = VISIT_TYPE_EXTERNAL_NAME == null ? null : VISIT_TYPE_EXTERNAL_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DEPT_DESC_GROUP_6
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.CLINICAL_DEPT_DESC_GROUP_6
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getCLINICAL_DEPT_DESC_GROUP_6() {
        return CLINICAL_DEPT_DESC_GROUP_6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DEPT_DESC_GROUP_6
     *
     * @param CLINICAL_DEPT_DESC_GROUP_6 the value for DVCBIO.APPOINTMENTS_V.CLINICAL_DEPT_DESC_GROUP_6
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCLINICAL_DEPT_DESC_GROUP_6(String CLINICAL_DEPT_DESC_GROUP_6) {
        this.CLINICAL_DEPT_DESC_GROUP_6 = CLINICAL_DEPT_DESC_GROUP_6 == null ? null : CLINICAL_DEPT_DESC_GROUP_6.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DEPARTMENT_GROUP_6
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.CLINICAL_DEPARTMENT_GROUP_6
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getCLINICAL_DEPARTMENT_GROUP_6() {
        return CLINICAL_DEPARTMENT_GROUP_6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DEPARTMENT_GROUP_6
     *
     * @param CLINICAL_DEPARTMENT_GROUP_6 the value for DVCBIO.APPOINTMENTS_V.CLINICAL_DEPARTMENT_GROUP_6
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCLINICAL_DEPARTMENT_GROUP_6(String CLINICAL_DEPARTMENT_GROUP_6) {
        this.CLINICAL_DEPARTMENT_GROUP_6 = CLINICAL_DEPARTMENT_GROUP_6 == null ? null : CLINICAL_DEPARTMENT_GROUP_6.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_GROUP_7
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_GROUP_7
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getCLINICAL_DIVISION_GROUP_7() {
        return CLINICAL_DIVISION_GROUP_7;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_GROUP_7
     *
     * @param CLINICAL_DIVISION_GROUP_7 the value for DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_GROUP_7
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCLINICAL_DIVISION_GROUP_7(String CLINICAL_DIVISION_GROUP_7) {
        this.CLINICAL_DIVISION_GROUP_7 = CLINICAL_DIVISION_GROUP_7 == null ? null : CLINICAL_DIVISION_GROUP_7.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_DESC_GROUP_7
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_DESC_GROUP_7
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getCLINICAL_DIVISION_DESC_GROUP_7() {
        return CLINICAL_DIVISION_DESC_GROUP_7;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_DESC_GROUP_7
     *
     * @param CLINICAL_DIVISION_DESC_GROUP_7 the value for DVCBIO.APPOINTMENTS_V.CLINICAL_DIVISION_DESC_GROUP_7
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCLINICAL_DIVISION_DESC_GROUP_7(String CLINICAL_DIVISION_DESC_GROUP_7) {
        this.CLINICAL_DIVISION_DESC_GROUP_7 = CLINICAL_DIVISION_DESC_GROUP_7 == null ? null : CLINICAL_DIVISION_DESC_GROUP_7.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_GROUP_8
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_GROUP_8
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getCLINICAL_SERVICE_GROUP_8() {
        return CLINICAL_SERVICE_GROUP_8;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_GROUP_8
     *
     * @param CLINICAL_SERVICE_GROUP_8 the value for DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_GROUP_8
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCLINICAL_SERVICE_GROUP_8(String CLINICAL_SERVICE_GROUP_8) {
        this.CLINICAL_SERVICE_GROUP_8 = CLINICAL_SERVICE_GROUP_8 == null ? null : CLINICAL_SERVICE_GROUP_8.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_DESC_GROUP_8
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_DESC_GROUP_8
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getCLINICAL_SERVICE_DESC_GROUP_8() {
        return CLINICAL_SERVICE_DESC_GROUP_8;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_DESC_GROUP_8
     *
     * @param CLINICAL_SERVICE_DESC_GROUP_8 the value for DVCBIO.APPOINTMENTS_V.CLINICAL_SERVICE_DESC_GROUP_8
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCLINICAL_SERVICE_DESC_GROUP_8(String CLINICAL_SERVICE_DESC_GROUP_8) {
        this.CLINICAL_SERVICE_DESC_GROUP_8 = CLINICAL_SERVICE_DESC_GROUP_8 == null ? null : CLINICAL_SERVICE_DESC_GROUP_8.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.CHECK_IN_TIME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.CHECK_IN_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Date getCHECK_IN_TIME() {
        return CHECK_IN_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.CHECK_IN_TIME
     *
     * @param CHECK_IN_TIME the value for DVCBIO.APPOINTMENTS_V.CHECK_IN_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCHECK_IN_TIME(Date CHECK_IN_TIME) {
        this.CHECK_IN_TIME = CHECK_IN_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.CHECK_OUT_TIME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.CHECK_OUT_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Date getCHECK_OUT_TIME() {
        return CHECK_OUT_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.CHECK_OUT_TIME
     *
     * @param CHECK_OUT_TIME the value for DVCBIO.APPOINTMENTS_V.CHECK_OUT_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setCHECK_OUT_TIME(Date CHECK_OUT_TIME) {
        this.CHECK_OUT_TIME = CHECK_OUT_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.ROOM_IN_TIME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.ROOM_IN_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Date getROOM_IN_TIME() {
        return ROOM_IN_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.ROOM_IN_TIME
     *
     * @param ROOM_IN_TIME the value for DVCBIO.APPOINTMENTS_V.ROOM_IN_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setROOM_IN_TIME(Date ROOM_IN_TIME) {
        this.ROOM_IN_TIME = ROOM_IN_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.APPOINTMENTS_V.ROOM_OUT_TIME
     *
     * @return the value of DVCBIO.APPOINTMENTS_V.ROOM_OUT_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Date getROOM_OUT_TIME() {
        return ROOM_OUT_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.APPOINTMENTS_V.ROOM_OUT_TIME
     *
     * @param ROOM_OUT_TIME the value for DVCBIO.APPOINTMENTS_V.ROOM_OUT_TIME
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setROOM_OUT_TIME(Date ROOM_OUT_TIME) {
        this.ROOM_OUT_TIME = ROOM_OUT_TIME;
    }
}