package org.mskcc.cbio.clinicaldata.cbiodata.model;

import java.util.ArrayList;
import java.util.List;

public class CbioClinicalEventExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public CbioClinicalEventExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
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
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
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

        public Criteria andCLINICAL_EVENT_IDIsNull() {
            addCriterion("CLINICAL_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDIsNotNull() {
            addCriterion("CLINICAL_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDEqualTo(Integer value) {
            addCriterion("CLINICAL_EVENT_ID =", value, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDNotEqualTo(Integer value) {
            addCriterion("CLINICAL_EVENT_ID <>", value, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDGreaterThan(Integer value) {
            addCriterion("CLINICAL_EVENT_ID >", value, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLINICAL_EVENT_ID >=", value, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDLessThan(Integer value) {
            addCriterion("CLINICAL_EVENT_ID <", value, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDLessThanOrEqualTo(Integer value) {
            addCriterion("CLINICAL_EVENT_ID <=", value, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDIn(List<Integer> values) {
            addCriterion("CLINICAL_EVENT_ID in", values, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDNotIn(List<Integer> values) {
            addCriterion("CLINICAL_EVENT_ID not in", values, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDBetween(Integer value1, Integer value2) {
            addCriterion("CLINICAL_EVENT_ID between", value1, value2, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_EVENT_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("CLINICAL_EVENT_ID not between", value1, value2, "CLINICAL_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDIsNull() {
            addCriterion("PATIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDIsNotNull() {
            addCriterion("PATIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDEqualTo(Integer value) {
            addCriterion("PATIENT_ID =", value, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDNotEqualTo(Integer value) {
            addCriterion("PATIENT_ID <>", value, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDGreaterThan(Integer value) {
            addCriterion("PATIENT_ID >", value, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PATIENT_ID >=", value, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDLessThan(Integer value) {
            addCriterion("PATIENT_ID <", value, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDLessThanOrEqualTo(Integer value) {
            addCriterion("PATIENT_ID <=", value, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDIn(List<Integer> values) {
            addCriterion("PATIENT_ID in", values, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDNotIn(List<Integer> values) {
            addCriterion("PATIENT_ID not in", values, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDBetween(Integer value1, Integer value2) {
            addCriterion("PATIENT_ID between", value1, value2, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andPATIENT_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("PATIENT_ID not between", value1, value2, "PATIENT_ID");
            return (Criteria) this;
        }

        public Criteria andSTART_DATEIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSTART_DATEIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSTART_DATEEqualTo(Integer value) {
            addCriterion("START_DATE =", value, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATENotEqualTo(Integer value) {
            addCriterion("START_DATE <>", value, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATEGreaterThan(Integer value) {
            addCriterion("START_DATE >", value, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("START_DATE >=", value, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATELessThan(Integer value) {
            addCriterion("START_DATE <", value, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATELessThanOrEqualTo(Integer value) {
            addCriterion("START_DATE <=", value, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATEIn(List<Integer> values) {
            addCriterion("START_DATE in", values, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATENotIn(List<Integer> values) {
            addCriterion("START_DATE not in", values, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATEBetween(Integer value1, Integer value2) {
            addCriterion("START_DATE between", value1, value2, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTART_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("START_DATE not between", value1, value2, "START_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATEIsNull() {
            addCriterion("STOP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATEIsNotNull() {
            addCriterion("STOP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATEEqualTo(Integer value) {
            addCriterion("STOP_DATE =", value, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATENotEqualTo(Integer value) {
            addCriterion("STOP_DATE <>", value, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATEGreaterThan(Integer value) {
            addCriterion("STOP_DATE >", value, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOP_DATE >=", value, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATELessThan(Integer value) {
            addCriterion("STOP_DATE <", value, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATELessThanOrEqualTo(Integer value) {
            addCriterion("STOP_DATE <=", value, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATEIn(List<Integer> values) {
            addCriterion("STOP_DATE in", values, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATENotIn(List<Integer> values) {
            addCriterion("STOP_DATE not in", values, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATEBetween(Integer value1, Integer value2) {
            addCriterion("STOP_DATE between", value1, value2, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("STOP_DATE not between", value1, value2, "STOP_DATE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPEIsNull() {
            addCriterion("EVENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPEIsNotNull() {
            addCriterion("EVENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPEEqualTo(String value) {
            addCriterion("EVENT_TYPE =", value, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPENotEqualTo(String value) {
            addCriterion("EVENT_TYPE <>", value, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPEGreaterThan(String value) {
            addCriterion("EVENT_TYPE >", value, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_TYPE >=", value, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPELessThan(String value) {
            addCriterion("EVENT_TYPE <", value, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPELessThanOrEqualTo(String value) {
            addCriterion("EVENT_TYPE <=", value, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPELike(String value) {
            addCriterion("EVENT_TYPE like", value, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPENotLike(String value) {
            addCriterion("EVENT_TYPE not like", value, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPEIn(List<String> values) {
            addCriterion("EVENT_TYPE in", values, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPENotIn(List<String> values) {
            addCriterion("EVENT_TYPE not in", values, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPEBetween(String value1, String value2) {
            addCriterion("EVENT_TYPE between", value1, value2, "EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andEVENT_TYPENotBetween(String value1, String value2) {
            addCriterion("EVENT_TYPE not between", value1, value2, "EVENT_TYPE");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clinical_event
     *
     * @mbggenerated do_not_delete_during_merge Mon Apr 20 14:27:25 EDT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clinical_event
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
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