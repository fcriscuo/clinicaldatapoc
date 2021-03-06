package org.mskcc.cbio.clinicaldata.darwin.model.dvcbio;

import java.util.ArrayList;
import java.util.List;

public class PatientClinicalTrialExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public PatientClinicalTrialExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDIsNull() {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDIsNotNull() {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDEqualTo(Integer value) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID =", value, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDNotEqualTo(Integer value) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID <>", value, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDGreaterThan(Integer value) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID >", value, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID >=", value, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDLessThan(Integer value) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID <", value, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDLessThanOrEqualTo(Integer value) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID <=", value, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDIn(List<Integer> values) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID in", values, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDNotIn(List<Integer> values) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID not in", values, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDBetween(Integer value1, Integer value2) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID between", value1, value2, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_PT_DEIDENTIFICATION_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("CLIN_TRIAL_PT_DEIDENTIFICATION_ID not between", value1, value2, "CLIN_TRIAL_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDIsNull() {
            addCriterion("CLIN_TRIAL_DMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDIsNotNull() {
            addCriterion("CLIN_TRIAL_DMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDEqualTo(String value) {
            addCriterion("CLIN_TRIAL_DMP_ID =", value, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDNotEqualTo(String value) {
            addCriterion("CLIN_TRIAL_DMP_ID <>", value, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDGreaterThan(String value) {
            addCriterion("CLIN_TRIAL_DMP_ID >", value, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDGreaterThanOrEqualTo(String value) {
            addCriterion("CLIN_TRIAL_DMP_ID >=", value, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDLessThan(String value) {
            addCriterion("CLIN_TRIAL_DMP_ID <", value, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDLessThanOrEqualTo(String value) {
            addCriterion("CLIN_TRIAL_DMP_ID <=", value, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDLike(String value) {
            addCriterion("CLIN_TRIAL_DMP_ID like", value, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDNotLike(String value) {
            addCriterion("CLIN_TRIAL_DMP_ID not like", value, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDIn(List<String> values) {
            addCriterion("CLIN_TRIAL_DMP_ID in", values, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDNotIn(List<String> values) {
            addCriterion("CLIN_TRIAL_DMP_ID not in", values, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDBetween(String value1, String value2) {
            addCriterion("CLIN_TRIAL_DMP_ID between", value1, value2, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_DMP_IDNotBetween(String value1, String value2) {
            addCriterion("CLIN_TRIAL_DMP_ID not between", value1, value2, "CLIN_TRIAL_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOIsNull() {
            addCriterion("CLIN_TRIAL_IRB_NO is null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOIsNotNull() {
            addCriterion("CLIN_TRIAL_IRB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOEqualTo(String value) {
            addCriterion("CLIN_TRIAL_IRB_NO =", value, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NONotEqualTo(String value) {
            addCriterion("CLIN_TRIAL_IRB_NO <>", value, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOGreaterThan(String value) {
            addCriterion("CLIN_TRIAL_IRB_NO >", value, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOGreaterThanOrEqualTo(String value) {
            addCriterion("CLIN_TRIAL_IRB_NO >=", value, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOLessThan(String value) {
            addCriterion("CLIN_TRIAL_IRB_NO <", value, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOLessThanOrEqualTo(String value) {
            addCriterion("CLIN_TRIAL_IRB_NO <=", value, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOLike(String value) {
            addCriterion("CLIN_TRIAL_IRB_NO like", value, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NONotLike(String value) {
            addCriterion("CLIN_TRIAL_IRB_NO not like", value, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOIn(List<String> values) {
            addCriterion("CLIN_TRIAL_IRB_NO in", values, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NONotIn(List<String> values) {
            addCriterion("CLIN_TRIAL_IRB_NO not in", values, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NOBetween(String value1, String value2) {
            addCriterion("CLIN_TRIAL_IRB_NO between", value1, value2, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_NONotBetween(String value1, String value2) {
            addCriterion("CLIN_TRIAL_IRB_NO not between", value1, value2, "CLIN_TRIAL_IRB_NO");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLEIsNull() {
            addCriterion("CLIN_TRIAL_IRB_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLEIsNotNull() {
            addCriterion("CLIN_TRIAL_IRB_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLEEqualTo(String value) {
            addCriterion("CLIN_TRIAL_IRB_TITLE =", value, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLENotEqualTo(String value) {
            addCriterion("CLIN_TRIAL_IRB_TITLE <>", value, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLEGreaterThan(String value) {
            addCriterion("CLIN_TRIAL_IRB_TITLE >", value, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLEGreaterThanOrEqualTo(String value) {
            addCriterion("CLIN_TRIAL_IRB_TITLE >=", value, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLELessThan(String value) {
            addCriterion("CLIN_TRIAL_IRB_TITLE <", value, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLELessThanOrEqualTo(String value) {
            addCriterion("CLIN_TRIAL_IRB_TITLE <=", value, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLELike(String value) {
            addCriterion("CLIN_TRIAL_IRB_TITLE like", value, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLENotLike(String value) {
            addCriterion("CLIN_TRIAL_IRB_TITLE not like", value, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLEIn(List<String> values) {
            addCriterion("CLIN_TRIAL_IRB_TITLE in", values, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLENotIn(List<String> values) {
            addCriterion("CLIN_TRIAL_IRB_TITLE not in", values, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLEBetween(String value1, String value2) {
            addCriterion("CLIN_TRIAL_IRB_TITLE between", value1, value2, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_IRB_TITLENotBetween(String value1, String value2) {
            addCriterion("CLIN_TRIAL_IRB_TITLE not between", value1, value2, "CLIN_TRIAL_IRB_TITLE");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSIsNull() {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSIsNotNull() {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSEqualTo(Integer value) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS =", value, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSNotEqualTo(Integer value) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS <>", value, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSGreaterThan(Integer value) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS >", value, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS >=", value, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSLessThan(Integer value) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS <", value, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSLessThanOrEqualTo(Integer value) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS <=", value, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSIn(List<Integer> values) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS in", values, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSNotIn(List<Integer> values) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS not in", values, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSBetween(Integer value1, Integer value2) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS between", value1, value2, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYSNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS not between", value1, value2, "AGE_AT_CLINICAL_TRIAL_CONSENT_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARIsNull() {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARIsNotNull() {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEAREqualTo(Integer value) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR =", value, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARNotEqualTo(Integer value) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR <>", value, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARGreaterThan(Integer value) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR >", value, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR >=", value, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARLessThan(Integer value) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR <", value, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARLessThanOrEqualTo(Integer value) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR <=", value, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARIn(List<Integer> values) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR in", values, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARNotIn(List<Integer> values) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR not in", values, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARBetween(Integer value1, Integer value2) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR between", value1, value2, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLIN_TRIAL_CONSENT_YEARNotBetween(Integer value1, Integer value2) {
            addCriterion("CLIN_TRIAL_CONSENT_YEAR not between", value1, value2, "CLIN_TRIAL_CONSENT_YEAR");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated do_not_delete_during_merge Fri Sep 04 16:58:24 EDT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}