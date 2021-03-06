package org.mskcc.cbio.clinicaldata.crdb.rdbms.model.cbioint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrdbImpactSurveyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public CrdbImpactSurveyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
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
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
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

        public Criteria andDMP_IDIsNull() {
            addCriterion("DMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDMP_IDIsNotNull() {
            addCriterion("DMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDMP_IDEqualTo(String value) {
            addCriterion("DMP_ID =", value, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDNotEqualTo(String value) {
            addCriterion("DMP_ID <>", value, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDGreaterThan(String value) {
            addCriterion("DMP_ID >", value, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDGreaterThanOrEqualTo(String value) {
            addCriterion("DMP_ID >=", value, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDLessThan(String value) {
            addCriterion("DMP_ID <", value, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDLessThanOrEqualTo(String value) {
            addCriterion("DMP_ID <=", value, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDLike(String value) {
            addCriterion("DMP_ID like", value, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDNotLike(String value) {
            addCriterion("DMP_ID not like", value, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDIn(List<String> values) {
            addCriterion("DMP_ID in", values, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDNotIn(List<String> values) {
            addCriterion("DMP_ID not in", values, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDBetween(String value1, String value2) {
            addCriterion("DMP_ID between", value1, value2, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andDMP_IDNotBetween(String value1, String value2) {
            addCriterion("DMP_ID not between", value1, value2, "DMP_ID");
            return (Criteria) this;
        }

        public Criteria andQS_DATEIsNull() {
            addCriterion("QS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andQS_DATEIsNotNull() {
            addCriterion("QS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andQS_DATEEqualTo(Date value) {
            addCriterion("QS_DATE =", value, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATENotEqualTo(Date value) {
            addCriterion("QS_DATE <>", value, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATEGreaterThan(Date value) {
            addCriterion("QS_DATE >", value, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATEGreaterThanOrEqualTo(Date value) {
            addCriterion("QS_DATE >=", value, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATELessThan(Date value) {
            addCriterion("QS_DATE <", value, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATELessThanOrEqualTo(Date value) {
            addCriterion("QS_DATE <=", value, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATEIn(List<Date> values) {
            addCriterion("QS_DATE in", values, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATENotIn(List<Date> values) {
            addCriterion("QS_DATE not in", values, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATEBetween(Date value1, Date value2) {
            addCriterion("QS_DATE between", value1, value2, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andQS_DATENotBetween(Date value1, Date value2) {
            addCriterion("QS_DATE not between", value1, value2, "QS_DATE");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTIsNull() {
            addCriterion("ADJ_TXT is null");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTIsNotNull() {
            addCriterion("ADJ_TXT is not null");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTEqualTo(String value) {
            addCriterion("ADJ_TXT =", value, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTNotEqualTo(String value) {
            addCriterion("ADJ_TXT <>", value, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTGreaterThan(String value) {
            addCriterion("ADJ_TXT >", value, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTGreaterThanOrEqualTo(String value) {
            addCriterion("ADJ_TXT >=", value, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTLessThan(String value) {
            addCriterion("ADJ_TXT <", value, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTLessThanOrEqualTo(String value) {
            addCriterion("ADJ_TXT <=", value, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTLike(String value) {
            addCriterion("ADJ_TXT like", value, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTNotLike(String value) {
            addCriterion("ADJ_TXT not like", value, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTIn(List<String> values) {
            addCriterion("ADJ_TXT in", values, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTNotIn(List<String> values) {
            addCriterion("ADJ_TXT not in", values, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTBetween(String value1, String value2) {
            addCriterion("ADJ_TXT between", value1, value2, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andADJ_TXTNotBetween(String value1, String value2) {
            addCriterion("ADJ_TXT not between", value1, value2, "ADJ_TXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTIsNull() {
            addCriterion("NOSYSTXT is null");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTIsNotNull() {
            addCriterion("NOSYSTXT is not null");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTEqualTo(String value) {
            addCriterion("NOSYSTXT =", value, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTNotEqualTo(String value) {
            addCriterion("NOSYSTXT <>", value, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTGreaterThan(String value) {
            addCriterion("NOSYSTXT >", value, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTGreaterThanOrEqualTo(String value) {
            addCriterion("NOSYSTXT >=", value, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTLessThan(String value) {
            addCriterion("NOSYSTXT <", value, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTLessThanOrEqualTo(String value) {
            addCriterion("NOSYSTXT <=", value, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTLike(String value) {
            addCriterion("NOSYSTXT like", value, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTNotLike(String value) {
            addCriterion("NOSYSTXT not like", value, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTIn(List<String> values) {
            addCriterion("NOSYSTXT in", values, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTNotIn(List<String> values) {
            addCriterion("NOSYSTXT not in", values, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTBetween(String value1, String value2) {
            addCriterion("NOSYSTXT between", value1, value2, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andNOSYSTXTNotBetween(String value1, String value2) {
            addCriterion("NOSYSTXT not between", value1, value2, "NOSYSTXT");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXIsNull() {
            addCriterion("PRIOR_RX is null");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXIsNotNull() {
            addCriterion("PRIOR_RX is not null");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXEqualTo(String value) {
            addCriterion("PRIOR_RX =", value, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXNotEqualTo(String value) {
            addCriterion("PRIOR_RX <>", value, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXGreaterThan(String value) {
            addCriterion("PRIOR_RX >", value, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXGreaterThanOrEqualTo(String value) {
            addCriterion("PRIOR_RX >=", value, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXLessThan(String value) {
            addCriterion("PRIOR_RX <", value, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXLessThanOrEqualTo(String value) {
            addCriterion("PRIOR_RX <=", value, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXLike(String value) {
            addCriterion("PRIOR_RX like", value, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXNotLike(String value) {
            addCriterion("PRIOR_RX not like", value, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXIn(List<String> values) {
            addCriterion("PRIOR_RX in", values, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXNotIn(List<String> values) {
            addCriterion("PRIOR_RX not in", values, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXBetween(String value1, String value2) {
            addCriterion("PRIOR_RX between", value1, value2, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andPRIOR_RXNotBetween(String value1, String value2) {
            addCriterion("PRIOR_RX not between", value1, value2, "PRIOR_RX");
            return (Criteria) this;
        }

        public Criteria andBRAINMETIsNull() {
            addCriterion("BRAINMET is null");
            return (Criteria) this;
        }

        public Criteria andBRAINMETIsNotNull() {
            addCriterion("BRAINMET is not null");
            return (Criteria) this;
        }

        public Criteria andBRAINMETEqualTo(String value) {
            addCriterion("BRAINMET =", value, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETNotEqualTo(String value) {
            addCriterion("BRAINMET <>", value, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETGreaterThan(String value) {
            addCriterion("BRAINMET >", value, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETGreaterThanOrEqualTo(String value) {
            addCriterion("BRAINMET >=", value, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETLessThan(String value) {
            addCriterion("BRAINMET <", value, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETLessThanOrEqualTo(String value) {
            addCriterion("BRAINMET <=", value, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETLike(String value) {
            addCriterion("BRAINMET like", value, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETNotLike(String value) {
            addCriterion("BRAINMET not like", value, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETIn(List<String> values) {
            addCriterion("BRAINMET in", values, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETNotIn(List<String> values) {
            addCriterion("BRAINMET not in", values, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETBetween(String value1, String value2) {
            addCriterion("BRAINMET between", value1, value2, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andBRAINMETNotBetween(String value1, String value2) {
            addCriterion("BRAINMET not between", value1, value2, "BRAINMET");
            return (Criteria) this;
        }

        public Criteria andECOGIsNull() {
            addCriterion("ECOG is null");
            return (Criteria) this;
        }

        public Criteria andECOGIsNotNull() {
            addCriterion("ECOG is not null");
            return (Criteria) this;
        }

        public Criteria andECOGEqualTo(String value) {
            addCriterion("ECOG =", value, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGNotEqualTo(String value) {
            addCriterion("ECOG <>", value, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGGreaterThan(String value) {
            addCriterion("ECOG >", value, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGGreaterThanOrEqualTo(String value) {
            addCriterion("ECOG >=", value, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGLessThan(String value) {
            addCriterion("ECOG <", value, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGLessThanOrEqualTo(String value) {
            addCriterion("ECOG <=", value, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGLike(String value) {
            addCriterion("ECOG like", value, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGNotLike(String value) {
            addCriterion("ECOG not like", value, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGIn(List<String> values) {
            addCriterion("ECOG in", values, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGNotIn(List<String> values) {
            addCriterion("ECOG not in", values, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGBetween(String value1, String value2) {
            addCriterion("ECOG between", value1, value2, "ECOG");
            return (Criteria) this;
        }

        public Criteria andECOGNotBetween(String value1, String value2) {
            addCriterion("ECOG not between", value1, value2, "ECOG");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSEqualTo(String value) {
            addCriterion("COMMENTS =", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLessThan(String value) {
            addCriterion("COMMENTS <", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLike(String value) {
            addCriterion("COMMENTS like", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotLike(String value) {
            addCriterion("COMMENTS not like", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIn(List<String> values) {
            addCriterion("COMMENTS in", values, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "COMMENTS");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 27 11:05:53 EDT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CBIOINT.V_IMPACT_SURVEY_12_245
     *
     * @mbggenerated Fri Mar 27 11:05:53 EDT 2015
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