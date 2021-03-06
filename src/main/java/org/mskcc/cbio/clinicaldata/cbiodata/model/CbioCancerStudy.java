package org.mskcc.cbio.clinicaldata.cbiodata.model;

public class CbioCancerStudy {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.CANCER_STUDY_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Integer CANCER_STUDY_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.CANCER_STUDY_IDENTIFIER
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String CANCER_STUDY_IDENTIFIER;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.TYPE_OF_CANCER_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String TYPE_OF_CANCER_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.NAME
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String NAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.SHORT_NAME
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String SHORT_NAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.DESCRIPTION
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String DESCRIPTION;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.PUBLIC
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private Boolean PUBLIC;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.PMID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String PMID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.CITATION
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String CITATION;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cancer_study.GROUPS
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    private String GROUPS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.CANCER_STUDY_ID
     *
     * @return the value of cancer_study.CANCER_STUDY_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Integer getCANCER_STUDY_ID() {
        return CANCER_STUDY_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.CANCER_STUDY_ID
     *
     * @param CANCER_STUDY_ID the value for cancer_study.CANCER_STUDY_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setCANCER_STUDY_ID(Integer CANCER_STUDY_ID) {
        this.CANCER_STUDY_ID = CANCER_STUDY_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.CANCER_STUDY_IDENTIFIER
     *
     * @return the value of cancer_study.CANCER_STUDY_IDENTIFIER
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getCANCER_STUDY_IDENTIFIER() {
        return CANCER_STUDY_IDENTIFIER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.CANCER_STUDY_IDENTIFIER
     *
     * @param CANCER_STUDY_IDENTIFIER the value for cancer_study.CANCER_STUDY_IDENTIFIER
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setCANCER_STUDY_IDENTIFIER(String CANCER_STUDY_IDENTIFIER) {
        this.CANCER_STUDY_IDENTIFIER = CANCER_STUDY_IDENTIFIER == null ? null : CANCER_STUDY_IDENTIFIER.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.TYPE_OF_CANCER_ID
     *
     * @return the value of cancer_study.TYPE_OF_CANCER_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getTYPE_OF_CANCER_ID() {
        return TYPE_OF_CANCER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.TYPE_OF_CANCER_ID
     *
     * @param TYPE_OF_CANCER_ID the value for cancer_study.TYPE_OF_CANCER_ID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setTYPE_OF_CANCER_ID(String TYPE_OF_CANCER_ID) {
        this.TYPE_OF_CANCER_ID = TYPE_OF_CANCER_ID == null ? null : TYPE_OF_CANCER_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.NAME
     *
     * @return the value of cancer_study.NAME
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getNAME() {
        return NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.NAME
     *
     * @param NAME the value for cancer_study.NAME
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.SHORT_NAME
     *
     * @return the value of cancer_study.SHORT_NAME
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getSHORT_NAME() {
        return SHORT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.SHORT_NAME
     *
     * @param SHORT_NAME the value for cancer_study.SHORT_NAME
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setSHORT_NAME(String SHORT_NAME) {
        this.SHORT_NAME = SHORT_NAME == null ? null : SHORT_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.DESCRIPTION
     *
     * @return the value of cancer_study.DESCRIPTION
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.DESCRIPTION
     *
     * @param DESCRIPTION the value for cancer_study.DESCRIPTION
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.PUBLIC
     *
     * @return the value of cancer_study.PUBLIC
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Boolean getPUBLIC() {
        return PUBLIC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.PUBLIC
     *
     * @param PUBLIC the value for cancer_study.PUBLIC
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setPUBLIC(Boolean PUBLIC) {
        this.PUBLIC = PUBLIC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.PMID
     *
     * @return the value of cancer_study.PMID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getPMID() {
        return PMID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.PMID
     *
     * @param PMID the value for cancer_study.PMID
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setPMID(String PMID) {
        this.PMID = PMID == null ? null : PMID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.CITATION
     *
     * @return the value of cancer_study.CITATION
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getCITATION() {
        return CITATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.CITATION
     *
     * @param CITATION the value for cancer_study.CITATION
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setCITATION(String CITATION) {
        this.CITATION = CITATION == null ? null : CITATION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cancer_study.GROUPS
     *
     * @return the value of cancer_study.GROUPS
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getGROUPS() {
        return GROUPS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cancer_study.GROUPS
     *
     * @param GROUPS the value for cancer_study.GROUPS
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setGROUPS(String GROUPS) {
        this.GROUPS = GROUPS == null ? null : GROUPS.trim();
    }
}