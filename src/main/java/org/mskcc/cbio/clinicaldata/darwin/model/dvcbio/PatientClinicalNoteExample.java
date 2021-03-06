package org.mskcc.cbio.clinicaldata.darwin.model.dvcbio;

import java.util.ArrayList;
import java.util.List;

public class PatientClinicalNoteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public PatientClinicalNoteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
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
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
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
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLINICAL_NOTE_V
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
     * This class corresponds to the database table DVCBIO.CLINICAL_NOTE_V
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

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDIsNull() {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDIsNotNull() {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDEqualTo(Integer value) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID =", value, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDNotEqualTo(Integer value) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID <>", value, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDGreaterThan(Integer value) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID >", value, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID >=", value, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDLessThan(Integer value) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID <", value, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDLessThanOrEqualTo(Integer value) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID <=", value, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDIn(List<Integer> values) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID in", values, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDNotIn(List<Integer> values) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID not in", values, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDBetween(Integer value1, Integer value2) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID between", value1, value2, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_PT_DEIDENTIFICATION_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("CLNT_PT_DEIDENTIFICATION_ID not between", value1, value2, "CLNT_PT_DEIDENTIFICATION_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDIsNull() {
            addCriterion("CLNT_DMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDIsNotNull() {
            addCriterion("CLNT_DMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDEqualTo(String value) {
            addCriterion("CLNT_DMP_ID =", value, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDNotEqualTo(String value) {
            addCriterion("CLNT_DMP_ID <>", value, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDGreaterThan(String value) {
            addCriterion("CLNT_DMP_ID >", value, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDGreaterThanOrEqualTo(String value) {
            addCriterion("CLNT_DMP_ID >=", value, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDLessThan(String value) {
            addCriterion("CLNT_DMP_ID <", value, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDLessThanOrEqualTo(String value) {
            addCriterion("CLNT_DMP_ID <=", value, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDLike(String value) {
            addCriterion("CLNT_DMP_ID like", value, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDNotLike(String value) {
            addCriterion("CLNT_DMP_ID not like", value, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDIn(List<String> values) {
            addCriterion("CLNT_DMP_ID in", values, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDNotIn(List<String> values) {
            addCriterion("CLNT_DMP_ID not in", values, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDBetween(String value1, String value2) {
            addCriterion("CLNT_DMP_ID between", value1, value2, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andCLNT_DMP_IDNotBetween(String value1, String value2) {
            addCriterion("CLNT_DMP_ID not between", value1, value2, "CLNT_DMP_ID");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSIsNull() {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSIsNotNull() {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSEqualTo(Integer value) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS =", value, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSNotEqualTo(Integer value) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS <>", value, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSGreaterThan(Integer value) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS >", value, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS >=", value, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSLessThan(Integer value) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS <", value, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSLessThanOrEqualTo(Integer value) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS <=", value, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSIn(List<Integer> values) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS in", values, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSNotIn(List<Integer> values) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS not in", values, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSBetween(Integer value1, Integer value2) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS between", value1, value2, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_CLINICAL_NOTE_IN_DAYSNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE_AT_CLINICAL_NOTE_IN_DAYS not between", value1, value2, "AGE_AT_CLINICAL_NOTE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARIsNull() {
            addCriterion("CLNT_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARIsNotNull() {
            addCriterion("CLNT_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEAREqualTo(Short value) {
            addCriterion("CLNT_YEAR =", value, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARNotEqualTo(Short value) {
            addCriterion("CLNT_YEAR <>", value, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARGreaterThan(Short value) {
            addCriterion("CLNT_YEAR >", value, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARGreaterThanOrEqualTo(Short value) {
            addCriterion("CLNT_YEAR >=", value, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARLessThan(Short value) {
            addCriterion("CLNT_YEAR <", value, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARLessThanOrEqualTo(Short value) {
            addCriterion("CLNT_YEAR <=", value, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARIn(List<Short> values) {
            addCriterion("CLNT_YEAR in", values, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARNotIn(List<Short> values) {
            addCriterion("CLNT_YEAR not in", values, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARBetween(Short value1, Short value2) {
            addCriterion("CLNT_YEAR between", value1, value2, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_YEARNotBetween(Short value1, Short value2) {
            addCriterion("CLNT_YEAR not between", value1, value2, "CLNT_YEAR");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYIsNull() {
            addCriterion("CLNT_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYIsNotNull() {
            addCriterion("CLNT_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYEqualTo(String value) {
            addCriterion("CLNT_CATEGORY =", value, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYNotEqualTo(String value) {
            addCriterion("CLNT_CATEGORY <>", value, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYGreaterThan(String value) {
            addCriterion("CLNT_CATEGORY >", value, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYGreaterThanOrEqualTo(String value) {
            addCriterion("CLNT_CATEGORY >=", value, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYLessThan(String value) {
            addCriterion("CLNT_CATEGORY <", value, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYLessThanOrEqualTo(String value) {
            addCriterion("CLNT_CATEGORY <=", value, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYLike(String value) {
            addCriterion("CLNT_CATEGORY like", value, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYNotLike(String value) {
            addCriterion("CLNT_CATEGORY not like", value, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYIn(List<String> values) {
            addCriterion("CLNT_CATEGORY in", values, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYNotIn(List<String> values) {
            addCriterion("CLNT_CATEGORY not in", values, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYBetween(String value1, String value2) {
            addCriterion("CLNT_CATEGORY between", value1, value2, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_CATEGORYNotBetween(String value1, String value2) {
            addCriterion("CLNT_CATEGORY not between", value1, value2, "CLNT_CATEGORY");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPEIsNull() {
            addCriterion("CLNT_DOCTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPEIsNotNull() {
            addCriterion("CLNT_DOCTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPEEqualTo(String value) {
            addCriterion("CLNT_DOCTYPE =", value, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPENotEqualTo(String value) {
            addCriterion("CLNT_DOCTYPE <>", value, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPEGreaterThan(String value) {
            addCriterion("CLNT_DOCTYPE >", value, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CLNT_DOCTYPE >=", value, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPELessThan(String value) {
            addCriterion("CLNT_DOCTYPE <", value, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPELessThanOrEqualTo(String value) {
            addCriterion("CLNT_DOCTYPE <=", value, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPELike(String value) {
            addCriterion("CLNT_DOCTYPE like", value, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPENotLike(String value) {
            addCriterion("CLNT_DOCTYPE not like", value, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPEIn(List<String> values) {
            addCriterion("CLNT_DOCTYPE in", values, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPENotIn(List<String> values) {
            addCriterion("CLNT_DOCTYPE not in", values, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPEBetween(String value1, String value2) {
            addCriterion("CLNT_DOCTYPE between", value1, value2, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOCTYPENotBetween(String value1, String value2) {
            addCriterion("CLNT_DOCTYPE not between", value1, value2, "CLNT_DOCTYPE");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCIsNull() {
            addCriterion("CLNT_EMR_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCIsNotNull() {
            addCriterion("CLNT_EMR_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCEqualTo(String value) {
            addCriterion("CLNT_EMR_DESC =", value, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCNotEqualTo(String value) {
            addCriterion("CLNT_EMR_DESC <>", value, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCGreaterThan(String value) {
            addCriterion("CLNT_EMR_DESC >", value, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCGreaterThanOrEqualTo(String value) {
            addCriterion("CLNT_EMR_DESC >=", value, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCLessThan(String value) {
            addCriterion("CLNT_EMR_DESC <", value, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCLessThanOrEqualTo(String value) {
            addCriterion("CLNT_EMR_DESC <=", value, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCLike(String value) {
            addCriterion("CLNT_EMR_DESC like", value, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCNotLike(String value) {
            addCriterion("CLNT_EMR_DESC not like", value, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCIn(List<String> values) {
            addCriterion("CLNT_EMR_DESC in", values, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCNotIn(List<String> values) {
            addCriterion("CLNT_EMR_DESC not in", values, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCBetween(String value1, String value2) {
            addCriterion("CLNT_EMR_DESC between", value1, value2, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_EMR_DESCNotBetween(String value1, String value2) {
            addCriterion("CLNT_EMR_DESC not between", value1, value2, "CLNT_EMR_DESC");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATIsNull() {
            addCriterion("CLNT_DOC_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATIsNotNull() {
            addCriterion("CLNT_DOC_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATEqualTo(String value) {
            addCriterion("CLNT_DOC_FORMAT =", value, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATNotEqualTo(String value) {
            addCriterion("CLNT_DOC_FORMAT <>", value, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATGreaterThan(String value) {
            addCriterion("CLNT_DOC_FORMAT >", value, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATGreaterThanOrEqualTo(String value) {
            addCriterion("CLNT_DOC_FORMAT >=", value, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATLessThan(String value) {
            addCriterion("CLNT_DOC_FORMAT <", value, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATLessThanOrEqualTo(String value) {
            addCriterion("CLNT_DOC_FORMAT <=", value, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATLike(String value) {
            addCriterion("CLNT_DOC_FORMAT like", value, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATNotLike(String value) {
            addCriterion("CLNT_DOC_FORMAT not like", value, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATIn(List<String> values) {
            addCriterion("CLNT_DOC_FORMAT in", values, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATNotIn(List<String> values) {
            addCriterion("CLNT_DOC_FORMAT not in", values, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATBetween(String value1, String value2) {
            addCriterion("CLNT_DOC_FORMAT between", value1, value2, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }

        public Criteria andCLNT_DOC_FORMATNotBetween(String value1, String value2) {
            addCriterion("CLNT_DOC_FORMAT not between", value1, value2, "CLNT_DOC_FORMAT");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DVCBIO.CLINICAL_NOTE_V
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
     * This class corresponds to the database table DVCBIO.CLINICAL_NOTE_V
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