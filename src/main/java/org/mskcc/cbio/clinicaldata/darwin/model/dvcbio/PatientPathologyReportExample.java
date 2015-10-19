package org.mskcc.cbio.clinicaldata.darwin.model.dvcbio;

import java.util.ArrayList;
import java.util.List;

public class PatientPathologyReportExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public PatientPathologyReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
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
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
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
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
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
     * This class corresponds to the database table DVCBIO.PATHOLOGY_V
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

        public Criteria andPT_ID_PATHOLOGYIsNull() {
            addCriterion("PT_ID_PATHOLOGY is null");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYIsNotNull() {
            addCriterion("PT_ID_PATHOLOGY is not null");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYEqualTo(Integer value) {
            addCriterion("PT_ID_PATHOLOGY =", value, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYNotEqualTo(Integer value) {
            addCriterion("PT_ID_PATHOLOGY <>", value, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYGreaterThan(Integer value) {
            addCriterion("PT_ID_PATHOLOGY >", value, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYGreaterThanOrEqualTo(Integer value) {
            addCriterion("PT_ID_PATHOLOGY >=", value, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYLessThan(Integer value) {
            addCriterion("PT_ID_PATHOLOGY <", value, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYLessThanOrEqualTo(Integer value) {
            addCriterion("PT_ID_PATHOLOGY <=", value, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYIn(List<Integer> values) {
            addCriterion("PT_ID_PATHOLOGY in", values, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYNotIn(List<Integer> values) {
            addCriterion("PT_ID_PATHOLOGY not in", values, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYBetween(Integer value1, Integer value2) {
            addCriterion("PT_ID_PATHOLOGY between", value1, value2, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andPT_ID_PATHOLOGYNotBetween(Integer value1, Integer value2) {
            addCriterion("PT_ID_PATHOLOGY not between", value1, value2, "PT_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYIsNull() {
            addCriterion("DMP_ID_PATHOLOGY is null");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYIsNotNull() {
            addCriterion("DMP_ID_PATHOLOGY is not null");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYEqualTo(String value) {
            addCriterion("DMP_ID_PATHOLOGY =", value, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYNotEqualTo(String value) {
            addCriterion("DMP_ID_PATHOLOGY <>", value, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYGreaterThan(String value) {
            addCriterion("DMP_ID_PATHOLOGY >", value, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYGreaterThanOrEqualTo(String value) {
            addCriterion("DMP_ID_PATHOLOGY >=", value, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYLessThan(String value) {
            addCriterion("DMP_ID_PATHOLOGY <", value, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYLessThanOrEqualTo(String value) {
            addCriterion("DMP_ID_PATHOLOGY <=", value, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYLike(String value) {
            addCriterion("DMP_ID_PATHOLOGY like", value, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYNotLike(String value) {
            addCriterion("DMP_ID_PATHOLOGY not like", value, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYIn(List<String> values) {
            addCriterion("DMP_ID_PATHOLOGY in", values, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYNotIn(List<String> values) {
            addCriterion("DMP_ID_PATHOLOGY not in", values, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYBetween(String value1, String value2) {
            addCriterion("DMP_ID_PATHOLOGY between", value1, value2, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andDMP_ID_PATHOLOGYNotBetween(String value1, String value2) {
            addCriterion("DMP_ID_PATHOLOGY not between", value1, value2, "DMP_ID_PATHOLOGY");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSIsNull() {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSIsNotNull() {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSEqualTo(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS =", value, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSNotEqualTo(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS <>", value, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSGreaterThan(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS >", value, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS >=", value, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSLessThan(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS <", value, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSLessThanOrEqualTo(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS <=", value, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSIn(List<Integer> values) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS in", values, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSNotIn(List<Integer> values) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS not in", values, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSBetween(Integer value1, Integer value2) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS between", value1, value2, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYSNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS not between", value1, value2, "AGE_AT_PATHOLOGY_REPORT_PROCEDURE_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARIsNull() {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARIsNotNull() {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEAREqualTo(Integer value) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR =", value, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARNotEqualTo(Integer value) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR <>", value, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARGreaterThan(Integer value) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR >", value, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARGreaterThanOrEqualTo(Integer value) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR >=", value, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARLessThan(Integer value) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR <", value, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARLessThanOrEqualTo(Integer value) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR <=", value, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARIn(List<Integer> values) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR in", values, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARNotIn(List<Integer> values) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR not in", values, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARBetween(Integer value1, Integer value2) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR between", value1, value2, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_PROCEDURE_YEARNotBetween(Integer value1, Integer value2) {
            addCriterion("PATHOLOGY_REPORT_PROCEDURE_YEAR not between", value1, value2, "PATHOLOGY_REPORT_PROCEDURE_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPEIsNull() {
            addCriterion("PATHOLOGY_REPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPEIsNotNull() {
            addCriterion("PATHOLOGY_REPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPEEqualTo(String value) {
            addCriterion("PATHOLOGY_REPORT_TYPE =", value, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPENotEqualTo(String value) {
            addCriterion("PATHOLOGY_REPORT_TYPE <>", value, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPEGreaterThan(String value) {
            addCriterion("PATHOLOGY_REPORT_TYPE >", value, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("PATHOLOGY_REPORT_TYPE >=", value, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPELessThan(String value) {
            addCriterion("PATHOLOGY_REPORT_TYPE <", value, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPELessThanOrEqualTo(String value) {
            addCriterion("PATHOLOGY_REPORT_TYPE <=", value, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPELike(String value) {
            addCriterion("PATHOLOGY_REPORT_TYPE like", value, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPENotLike(String value) {
            addCriterion("PATHOLOGY_REPORT_TYPE not like", value, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPEIn(List<String> values) {
            addCriterion("PATHOLOGY_REPORT_TYPE in", values, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPENotIn(List<String> values) {
            addCriterion("PATHOLOGY_REPORT_TYPE not in", values, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPEBetween(String value1, String value2) {
            addCriterion("PATHOLOGY_REPORT_TYPE between", value1, value2, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TYPENotBetween(String value1, String value2) {
            addCriterion("PATHOLOGY_REPORT_TYPE not between", value1, value2, "PATHOLOGY_REPORT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARIsNull() {
            addCriterion("PATHOLOGY_REPORT_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARIsNotNull() {
            addCriterion("PATHOLOGY_REPORT_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEAREqualTo(Integer value) {
            addCriterion("PATHOLOGY_REPORT_YEAR =", value, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARNotEqualTo(Integer value) {
            addCriterion("PATHOLOGY_REPORT_YEAR <>", value, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARGreaterThan(Integer value) {
            addCriterion("PATHOLOGY_REPORT_YEAR >", value, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARGreaterThanOrEqualTo(Integer value) {
            addCriterion("PATHOLOGY_REPORT_YEAR >=", value, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARLessThan(Integer value) {
            addCriterion("PATHOLOGY_REPORT_YEAR <", value, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARLessThanOrEqualTo(Integer value) {
            addCriterion("PATHOLOGY_REPORT_YEAR <=", value, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARIn(List<Integer> values) {
            addCriterion("PATHOLOGY_REPORT_YEAR in", values, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARNotIn(List<Integer> values) {
            addCriterion("PATHOLOGY_REPORT_YEAR not in", values, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARBetween(Integer value1, Integer value2) {
            addCriterion("PATHOLOGY_REPORT_YEAR between", value1, value2, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_YEARNotBetween(Integer value1, Integer value2) {
            addCriterion("PATHOLOGY_REPORT_YEAR not between", value1, value2, "PATHOLOGY_REPORT_YEAR");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSIsNull() {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSIsNotNull() {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSEqualTo(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS =", value, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSNotEqualTo(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS <>", value, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSGreaterThan(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS >", value, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS >=", value, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSLessThan(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS <", value, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSLessThanOrEqualTo(Integer value) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS <=", value, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSIn(List<Integer> values) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS in", values, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSNotIn(List<Integer> values) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS not in", values, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSBetween(Integer value1, Integer value2) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS between", value1, value2, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andAGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYSNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS not between", value1, value2, "AGE_AT_PATHOLOGY_REPORT_DATE_IN_DAYS");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTIsNull() {
            addCriterion("PATHOLOGY_REPORT_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTIsNotNull() {
            addCriterion("PATHOLOGY_REPORT_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTEqualTo(String value) {
            addCriterion("PATHOLOGY_REPORT_TEXT =", value, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTNotEqualTo(String value) {
            addCriterion("PATHOLOGY_REPORT_TEXT <>", value, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTGreaterThan(String value) {
            addCriterion("PATHOLOGY_REPORT_TEXT >", value, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTGreaterThanOrEqualTo(String value) {
            addCriterion("PATHOLOGY_REPORT_TEXT >=", value, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTLessThan(String value) {
            addCriterion("PATHOLOGY_REPORT_TEXT <", value, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTLessThanOrEqualTo(String value) {
            addCriterion("PATHOLOGY_REPORT_TEXT <=", value, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTLike(String value) {
            addCriterion("PATHOLOGY_REPORT_TEXT like", value, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTNotLike(String value) {
            addCriterion("PATHOLOGY_REPORT_TEXT not like", value, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTIn(List<String> values) {
            addCriterion("PATHOLOGY_REPORT_TEXT in", values, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTNotIn(List<String> values) {
            addCriterion("PATHOLOGY_REPORT_TEXT not in", values, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTBetween(String value1, String value2) {
            addCriterion("PATHOLOGY_REPORT_TEXT between", value1, value2, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }

        public Criteria andPATHOLOGY_REPORT_TEXTNotBetween(String value1, String value2) {
            addCriterion("PATHOLOGY_REPORT_TEXT not between", value1, value2, "PATHOLOGY_REPORT_TEXT");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DVCBIO.PATHOLOGY_V
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
     * This class corresponds to the database table DVCBIO.PATHOLOGY_V
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