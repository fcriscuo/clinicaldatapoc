package org.mskcc.cbio.clinicaldata.cbiodata.model;

import java.util.ArrayList;
import java.util.List;

public class CbioCancerStudyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public CbioCancerStudyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
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
     * This method corresponds to the database table cancer_study
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
     * This method corresponds to the database table cancer_study
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cancer_study
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
     * This class corresponds to the database table cancer_study
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

        public Criteria andCANCER_STUDY_IDIsNull() {
            addCriterion("CANCER_STUDY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDIsNotNull() {
            addCriterion("CANCER_STUDY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDEqualTo(Integer value) {
            addCriterion("CANCER_STUDY_ID =", value, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDNotEqualTo(Integer value) {
            addCriterion("CANCER_STUDY_ID <>", value, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDGreaterThan(Integer value) {
            addCriterion("CANCER_STUDY_ID >", value, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CANCER_STUDY_ID >=", value, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDLessThan(Integer value) {
            addCriterion("CANCER_STUDY_ID <", value, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDLessThanOrEqualTo(Integer value) {
            addCriterion("CANCER_STUDY_ID <=", value, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDIn(List<Integer> values) {
            addCriterion("CANCER_STUDY_ID in", values, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDNotIn(List<Integer> values) {
            addCriterion("CANCER_STUDY_ID not in", values, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDBetween(Integer value1, Integer value2) {
            addCriterion("CANCER_STUDY_ID between", value1, value2, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("CANCER_STUDY_ID not between", value1, value2, "CANCER_STUDY_ID");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERIsNull() {
            addCriterion("CANCER_STUDY_IDENTIFIER is null");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERIsNotNull() {
            addCriterion("CANCER_STUDY_IDENTIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIEREqualTo(String value) {
            addCriterion("CANCER_STUDY_IDENTIFIER =", value, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERNotEqualTo(String value) {
            addCriterion("CANCER_STUDY_IDENTIFIER <>", value, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERGreaterThan(String value) {
            addCriterion("CANCER_STUDY_IDENTIFIER >", value, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERGreaterThanOrEqualTo(String value) {
            addCriterion("CANCER_STUDY_IDENTIFIER >=", value, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERLessThan(String value) {
            addCriterion("CANCER_STUDY_IDENTIFIER <", value, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERLessThanOrEqualTo(String value) {
            addCriterion("CANCER_STUDY_IDENTIFIER <=", value, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERLike(String value) {
            addCriterion("CANCER_STUDY_IDENTIFIER like", value, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERNotLike(String value) {
            addCriterion("CANCER_STUDY_IDENTIFIER not like", value, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERIn(List<String> values) {
            addCriterion("CANCER_STUDY_IDENTIFIER in", values, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERNotIn(List<String> values) {
            addCriterion("CANCER_STUDY_IDENTIFIER not in", values, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERBetween(String value1, String value2) {
            addCriterion("CANCER_STUDY_IDENTIFIER between", value1, value2, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
        }

        public Criteria andCANCER_STUDY_IDENTIFIERNotBetween(String value1, String value2) {
            addCriterion("CANCER_STUDY_IDENTIFIER not between", value1, value2, "CANCER_STUDY_IDENTIFIER");
            return (Criteria) this;
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

        public Criteria andDESCRIPTIONIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLike(String value) {
            addCriterion("DESCRIPTION like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPUBLICIsNull() {
            addCriterion("PUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andPUBLICIsNotNull() {
            addCriterion("PUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andPUBLICEqualTo(Boolean value) {
            addCriterion("PUBLIC =", value, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICNotEqualTo(Boolean value) {
            addCriterion("PUBLIC <>", value, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICGreaterThan(Boolean value) {
            addCriterion("PUBLIC >", value, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PUBLIC >=", value, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICLessThan(Boolean value) {
            addCriterion("PUBLIC <", value, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICLessThanOrEqualTo(Boolean value) {
            addCriterion("PUBLIC <=", value, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICIn(List<Boolean> values) {
            addCriterion("PUBLIC in", values, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICNotIn(List<Boolean> values) {
            addCriterion("PUBLIC not in", values, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICBetween(Boolean value1, Boolean value2) {
            addCriterion("PUBLIC between", value1, value2, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPUBLICNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PUBLIC not between", value1, value2, "PUBLIC");
            return (Criteria) this;
        }

        public Criteria andPMIDIsNull() {
            addCriterion("PMID is null");
            return (Criteria) this;
        }

        public Criteria andPMIDIsNotNull() {
            addCriterion("PMID is not null");
            return (Criteria) this;
        }

        public Criteria andPMIDEqualTo(String value) {
            addCriterion("PMID =", value, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDNotEqualTo(String value) {
            addCriterion("PMID <>", value, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDGreaterThan(String value) {
            addCriterion("PMID >", value, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDGreaterThanOrEqualTo(String value) {
            addCriterion("PMID >=", value, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDLessThan(String value) {
            addCriterion("PMID <", value, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDLessThanOrEqualTo(String value) {
            addCriterion("PMID <=", value, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDLike(String value) {
            addCriterion("PMID like", value, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDNotLike(String value) {
            addCriterion("PMID not like", value, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDIn(List<String> values) {
            addCriterion("PMID in", values, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDNotIn(List<String> values) {
            addCriterion("PMID not in", values, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDBetween(String value1, String value2) {
            addCriterion("PMID between", value1, value2, "PMID");
            return (Criteria) this;
        }

        public Criteria andPMIDNotBetween(String value1, String value2) {
            addCriterion("PMID not between", value1, value2, "PMID");
            return (Criteria) this;
        }

        public Criteria andCITATIONIsNull() {
            addCriterion("CITATION is null");
            return (Criteria) this;
        }

        public Criteria andCITATIONIsNotNull() {
            addCriterion("CITATION is not null");
            return (Criteria) this;
        }

        public Criteria andCITATIONEqualTo(String value) {
            addCriterion("CITATION =", value, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONNotEqualTo(String value) {
            addCriterion("CITATION <>", value, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONGreaterThan(String value) {
            addCriterion("CITATION >", value, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONGreaterThanOrEqualTo(String value) {
            addCriterion("CITATION >=", value, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONLessThan(String value) {
            addCriterion("CITATION <", value, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONLessThanOrEqualTo(String value) {
            addCriterion("CITATION <=", value, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONLike(String value) {
            addCriterion("CITATION like", value, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONNotLike(String value) {
            addCriterion("CITATION not like", value, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONIn(List<String> values) {
            addCriterion("CITATION in", values, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONNotIn(List<String> values) {
            addCriterion("CITATION not in", values, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONBetween(String value1, String value2) {
            addCriterion("CITATION between", value1, value2, "CITATION");
            return (Criteria) this;
        }

        public Criteria andCITATIONNotBetween(String value1, String value2) {
            addCriterion("CITATION not between", value1, value2, "CITATION");
            return (Criteria) this;
        }

        public Criteria andGROUPSIsNull() {
            addCriterion("GROUPS is null");
            return (Criteria) this;
        }

        public Criteria andGROUPSIsNotNull() {
            addCriterion("GROUPS is not null");
            return (Criteria) this;
        }

        public Criteria andGROUPSEqualTo(String value) {
            addCriterion("GROUPS =", value, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSNotEqualTo(String value) {
            addCriterion("GROUPS <>", value, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSGreaterThan(String value) {
            addCriterion("GROUPS >", value, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPS >=", value, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSLessThan(String value) {
            addCriterion("GROUPS <", value, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSLessThanOrEqualTo(String value) {
            addCriterion("GROUPS <=", value, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSLike(String value) {
            addCriterion("GROUPS like", value, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSNotLike(String value) {
            addCriterion("GROUPS not like", value, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSIn(List<String> values) {
            addCriterion("GROUPS in", values, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSNotIn(List<String> values) {
            addCriterion("GROUPS not in", values, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSBetween(String value1, String value2) {
            addCriterion("GROUPS between", value1, value2, "GROUPS");
            return (Criteria) this;
        }

        public Criteria andGROUPSNotBetween(String value1, String value2) {
            addCriterion("GROUPS not between", value1, value2, "GROUPS");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cancer_study
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
     * This class corresponds to the database table cancer_study
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