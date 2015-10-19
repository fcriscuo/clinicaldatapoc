package org.mskcc.cbio.clinicaldata.cbiodata.model;

import java.util.ArrayList;
import java.util.List;

public class CbioTypeOfCancerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public CbioTypeOfCancerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
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
     * This method corresponds to the database table type_of_cancer
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
     * This method corresponds to the database table type_of_cancer
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_of_cancer
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
     * This class corresponds to the database table type_of_cancer
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

        public Criteria andTYPE_OF_CANCER_IDIsNull() {
            addCriterion("TYPE_OF_CANCER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDIsNotNull() {
            addCriterion("TYPE_OF_CANCER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDEqualTo(String value) {
            addCriterion("TYPE_OF_CANCER_ID =", value, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDNotEqualTo(String value) {
            addCriterion("TYPE_OF_CANCER_ID <>", value, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDGreaterThan(String value) {
            addCriterion("TYPE_OF_CANCER_ID >", value, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_OF_CANCER_ID >=", value, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDLessThan(String value) {
            addCriterion("TYPE_OF_CANCER_ID <", value, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDLessThanOrEqualTo(String value) {
            addCriterion("TYPE_OF_CANCER_ID <=", value, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDLike(String value) {
            addCriterion("TYPE_OF_CANCER_ID like", value, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDNotLike(String value) {
            addCriterion("TYPE_OF_CANCER_ID not like", value, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDIn(List<String> values) {
            addCriterion("TYPE_OF_CANCER_ID in", values, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDNotIn(List<String> values) {
            addCriterion("TYPE_OF_CANCER_ID not in", values, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDBetween(String value1, String value2) {
            addCriterion("TYPE_OF_CANCER_ID between", value1, value2, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_OF_CANCER_IDNotBetween(String value1, String value2) {
            addCriterion("TYPE_OF_CANCER_ID not between", value1, value2, "TYPE_OF_CANCER_ID");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSIsNull() {
            addCriterion("CLINICAL_TRIAL_KEYWORDS is null");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSIsNotNull() {
            addCriterion("CLINICAL_TRIAL_KEYWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSEqualTo(String value) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS =", value, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSNotEqualTo(String value) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS <>", value, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSGreaterThan(String value) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS >", value, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSGreaterThanOrEqualTo(String value) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS >=", value, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSLessThan(String value) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS <", value, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSLessThanOrEqualTo(String value) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS <=", value, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSLike(String value) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS like", value, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSNotLike(String value) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS not like", value, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSIn(List<String> values) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS in", values, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSNotIn(List<String> values) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS not in", values, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSBetween(String value1, String value2) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS between", value1, value2, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andCLINICAL_TRIAL_KEYWORDSNotBetween(String value1, String value2) {
            addCriterion("CLINICAL_TRIAL_KEYWORDS not between", value1, value2, "CLINICAL_TRIAL_KEYWORDS");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORIsNull() {
            addCriterion("DEDICATED_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORIsNotNull() {
            addCriterion("DEDICATED_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLOREqualTo(String value) {
            addCriterion("DEDICATED_COLOR =", value, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORNotEqualTo(String value) {
            addCriterion("DEDICATED_COLOR <>", value, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORGreaterThan(String value) {
            addCriterion("DEDICATED_COLOR >", value, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORGreaterThanOrEqualTo(String value) {
            addCriterion("DEDICATED_COLOR >=", value, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORLessThan(String value) {
            addCriterion("DEDICATED_COLOR <", value, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORLessThanOrEqualTo(String value) {
            addCriterion("DEDICATED_COLOR <=", value, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORLike(String value) {
            addCriterion("DEDICATED_COLOR like", value, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORNotLike(String value) {
            addCriterion("DEDICATED_COLOR not like", value, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORIn(List<String> values) {
            addCriterion("DEDICATED_COLOR in", values, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORNotIn(List<String> values) {
            addCriterion("DEDICATED_COLOR not in", values, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORBetween(String value1, String value2) {
            addCriterion("DEDICATED_COLOR between", value1, value2, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andDEDICATED_COLORNotBetween(String value1, String value2) {
            addCriterion("DEDICATED_COLOR not between", value1, value2, "DEDICATED_COLOR");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEIsNull() {
            addCriterion("SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEIsNotNull() {
            addCriterion("SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEEqualTo(String value) {
            addCriterion("SHORT_NAME =", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMENotEqualTo(String value) {
            addCriterion("SHORT_NAME <>", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEGreaterThan(String value) {
            addCriterion("SHORT_NAME >", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME >=", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMELessThan(String value) {
            addCriterion("SHORT_NAME <", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMELessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME <=", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMELike(String value) {
            addCriterion("SHORT_NAME like", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMENotLike(String value) {
            addCriterion("SHORT_NAME not like", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEIn(List<String> values) {
            addCriterion("SHORT_NAME in", values, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMENotIn(List<String> values) {
            addCriterion("SHORT_NAME not in", values, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEBetween(String value1, String value2) {
            addCriterion("SHORT_NAME between", value1, value2, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMENotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME not between", value1, value2, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andPARENTIsNull() {
            addCriterion("PARENT is null");
            return (Criteria) this;
        }

        public Criteria andPARENTIsNotNull() {
            addCriterion("PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andPARENTEqualTo(String value) {
            addCriterion("PARENT =", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTNotEqualTo(String value) {
            addCriterion("PARENT <>", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTGreaterThan(String value) {
            addCriterion("PARENT >", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT >=", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTLessThan(String value) {
            addCriterion("PARENT <", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTLessThanOrEqualTo(String value) {
            addCriterion("PARENT <=", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTLike(String value) {
            addCriterion("PARENT like", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTNotLike(String value) {
            addCriterion("PARENT not like", value, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTIn(List<String> values) {
            addCriterion("PARENT in", values, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTNotIn(List<String> values) {
            addCriterion("PARENT not in", values, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTBetween(String value1, String value2) {
            addCriterion("PARENT between", value1, value2, "PARENT");
            return (Criteria) this;
        }

        public Criteria andPARENTNotBetween(String value1, String value2) {
            addCriterion("PARENT not between", value1, value2, "PARENT");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table type_of_cancer
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
     * This class corresponds to the database table type_of_cancer
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