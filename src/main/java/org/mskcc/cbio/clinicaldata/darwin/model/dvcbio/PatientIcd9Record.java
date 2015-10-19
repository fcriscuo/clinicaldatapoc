package org.mskcc.cbio.clinicaldata.darwin.model.dvcbio;

public class PatientIcd9Record {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.PT_ID_ICD9
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer PT_ID_ICD9;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.DMP_ID_ICD9
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String DMP_ID_ICD9;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.ICD_9_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ICD_9_CODE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.ICD_9_MSK_CODE_DESCRIPTION
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ICD_9_MSK_CODE_DESCRIPTION;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Short ICD_9_DIAGNOSIS_YEAR;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private Integer AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_TYPE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ICD_9_DIAGNOSIS_TYPE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.ICD_9_DX_IP_OP
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ICD_9_DX_IP_OP;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.ICD_9_CIC_CODED_INDICATOR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ICD_9_CIC_CODED_INDICATOR;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.ICD9_V.ICD9_METS_IND
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    private String ICD9_METS_IND;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.PT_ID_ICD9
     *
     * @return the value of DVCBIO.ICD9_V.PT_ID_ICD9
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getPT_ID_ICD9() {
        return PT_ID_ICD9;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.PT_ID_ICD9
     *
     * @param PT_ID_ICD9 the value for DVCBIO.ICD9_V.PT_ID_ICD9
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setPT_ID_ICD9(Integer PT_ID_ICD9) {
        this.PT_ID_ICD9 = PT_ID_ICD9;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.DMP_ID_ICD9
     *
     * @return the value of DVCBIO.ICD9_V.DMP_ID_ICD9
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getDMP_ID_ICD9() {
        return DMP_ID_ICD9;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.DMP_ID_ICD9
     *
     * @param DMP_ID_ICD9 the value for DVCBIO.ICD9_V.DMP_ID_ICD9
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDMP_ID_ICD9(String DMP_ID_ICD9) {
        this.DMP_ID_ICD9 = DMP_ID_ICD9 == null ? null : DMP_ID_ICD9.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.ICD_9_CODE
     *
     * @return the value of DVCBIO.ICD9_V.ICD_9_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getICD_9_CODE() {
        return ICD_9_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.ICD_9_CODE
     *
     * @param ICD_9_CODE the value for DVCBIO.ICD9_V.ICD_9_CODE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setICD_9_CODE(String ICD_9_CODE) {
        this.ICD_9_CODE = ICD_9_CODE == null ? null : ICD_9_CODE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.ICD_9_MSK_CODE_DESCRIPTION
     *
     * @return the value of DVCBIO.ICD9_V.ICD_9_MSK_CODE_DESCRIPTION
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getICD_9_MSK_CODE_DESCRIPTION() {
        return ICD_9_MSK_CODE_DESCRIPTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.ICD_9_MSK_CODE_DESCRIPTION
     *
     * @param ICD_9_MSK_CODE_DESCRIPTION the value for DVCBIO.ICD9_V.ICD_9_MSK_CODE_DESCRIPTION
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setICD_9_MSK_CODE_DESCRIPTION(String ICD_9_MSK_CODE_DESCRIPTION) {
        this.ICD_9_MSK_CODE_DESCRIPTION = ICD_9_MSK_CODE_DESCRIPTION == null ? null : ICD_9_MSK_CODE_DESCRIPTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_YEAR
     *
     * @return the value of DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Short getICD_9_DIAGNOSIS_YEAR() {
        return ICD_9_DIAGNOSIS_YEAR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_YEAR
     *
     * @param ICD_9_DIAGNOSIS_YEAR the value for DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_YEAR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setICD_9_DIAGNOSIS_YEAR(Short ICD_9_DIAGNOSIS_YEAR) {
        this.ICD_9_DIAGNOSIS_YEAR = ICD_9_DIAGNOSIS_YEAR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS
     *
     * @return the value of DVCBIO.ICD9_V.AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Integer getAGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS() {
        return AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS
     *
     * @param AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS the value for DVCBIO.ICD9_V.AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setAGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS(Integer AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS) {
        this.AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS = AGE_AT_ICD_9_DIAGNOSIS_DATE_IN_DAYS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_TYPE
     *
     * @return the value of DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_TYPE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getICD_9_DIAGNOSIS_TYPE() {
        return ICD_9_DIAGNOSIS_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_TYPE
     *
     * @param ICD_9_DIAGNOSIS_TYPE the value for DVCBIO.ICD9_V.ICD_9_DIAGNOSIS_TYPE
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setICD_9_DIAGNOSIS_TYPE(String ICD_9_DIAGNOSIS_TYPE) {
        this.ICD_9_DIAGNOSIS_TYPE = ICD_9_DIAGNOSIS_TYPE == null ? null : ICD_9_DIAGNOSIS_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.ICD_9_DX_IP_OP
     *
     * @return the value of DVCBIO.ICD9_V.ICD_9_DX_IP_OP
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getICD_9_DX_IP_OP() {
        return ICD_9_DX_IP_OP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.ICD_9_DX_IP_OP
     *
     * @param ICD_9_DX_IP_OP the value for DVCBIO.ICD9_V.ICD_9_DX_IP_OP
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setICD_9_DX_IP_OP(String ICD_9_DX_IP_OP) {
        this.ICD_9_DX_IP_OP = ICD_9_DX_IP_OP == null ? null : ICD_9_DX_IP_OP.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.ICD_9_CIC_CODED_INDICATOR
     *
     * @return the value of DVCBIO.ICD9_V.ICD_9_CIC_CODED_INDICATOR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getICD_9_CIC_CODED_INDICATOR() {
        return ICD_9_CIC_CODED_INDICATOR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.ICD_9_CIC_CODED_INDICATOR
     *
     * @param ICD_9_CIC_CODED_INDICATOR the value for DVCBIO.ICD9_V.ICD_9_CIC_CODED_INDICATOR
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setICD_9_CIC_CODED_INDICATOR(String ICD_9_CIC_CODED_INDICATOR) {
        this.ICD_9_CIC_CODED_INDICATOR = ICD_9_CIC_CODED_INDICATOR == null ? null : ICD_9_CIC_CODED_INDICATOR.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.ICD9_V.ICD9_METS_IND
     *
     * @return the value of DVCBIO.ICD9_V.ICD9_METS_IND
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getICD9_METS_IND() {
        return ICD9_METS_IND;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.ICD9_V.ICD9_METS_IND
     *
     * @param ICD9_METS_IND the value for DVCBIO.ICD9_V.ICD9_METS_IND
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setICD9_METS_IND(String ICD9_METS_IND) {
        this.ICD9_METS_IND = ICD9_METS_IND == null ? null : ICD9_METS_IND.trim();
    }
}