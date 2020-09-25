package com.sinosoft.lis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LxtbxmlstoreCondition {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public LxtbxmlstoreCondition() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("SerialNo is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("SerialNo is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(Long value) {
            addCriterion("SerialNo =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(Long value) {
            addCriterion("SerialNo <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(Long value) {
            addCriterion("SerialNo >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SerialNo >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(Long value) {
            addCriterion("SerialNo <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(Long value) {
            addCriterion("SerialNo <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<Long> values) {
            addCriterion("SerialNo in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<Long> values) {
            addCriterion("SerialNo not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(Long value1, Long value2) {
            addCriterion("SerialNo between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(Long value1, Long value2) {
            addCriterion("SerialNo not between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNull() {
            addCriterion("TransType is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("TransType is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("TransType =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("TransType <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("TransType >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("TransType >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("TransType <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("TransType <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("TransType like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("TransType not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("TransType in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("TransType not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("TransType between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("TransType not between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeIsNull() {
            addCriterion("PolicyType is null");
            return (Criteria) this;
        }

        public Criteria andPolicytypeIsNotNull() {
            addCriterion("PolicyType is not null");
            return (Criteria) this;
        }

        public Criteria andPolicytypeEqualTo(String value) {
            addCriterion("PolicyType =", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeNotEqualTo(String value) {
            addCriterion("PolicyType <>", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeGreaterThan(String value) {
            addCriterion("PolicyType >", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PolicyType >=", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeLessThan(String value) {
            addCriterion("PolicyType <", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeLessThanOrEqualTo(String value) {
            addCriterion("PolicyType <=", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeLike(String value) {
            addCriterion("PolicyType like", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeNotLike(String value) {
            addCriterion("PolicyType not like", value, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeIn(List<String> values) {
            addCriterion("PolicyType in", values, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeNotIn(List<String> values) {
            addCriterion("PolicyType not in", values, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeBetween(String value1, String value2) {
            addCriterion("PolicyType between", value1, value2, "policytype");
            return (Criteria) this;
        }

        public Criteria andPolicytypeNotBetween(String value1, String value2) {
            addCriterion("PolicyType not between", value1, value2, "policytype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeIsNull() {
            addCriterion("InterfaceType is null");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeIsNotNull() {
            addCriterion("InterfaceType is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeEqualTo(String value) {
            addCriterion("InterfaceType =", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeNotEqualTo(String value) {
            addCriterion("InterfaceType <>", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeGreaterThan(String value) {
            addCriterion("InterfaceType >", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeGreaterThanOrEqualTo(String value) {
            addCriterion("InterfaceType >=", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeLessThan(String value) {
            addCriterion("InterfaceType <", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeLessThanOrEqualTo(String value) {
            addCriterion("InterfaceType <=", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeLike(String value) {
            addCriterion("InterfaceType like", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeNotLike(String value) {
            addCriterion("InterfaceType not like", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeIn(List<String> values) {
            addCriterion("InterfaceType in", values, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeNotIn(List<String> values) {
            addCriterion("InterfaceType not in", values, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeBetween(String value1, String value2) {
            addCriterion("InterfaceType between", value1, value2, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeNotBetween(String value1, String value2) {
            addCriterion("InterfaceType not between", value1, value2, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andXmltypeIsNull() {
            addCriterion("XmlType is null");
            return (Criteria) this;
        }

        public Criteria andXmltypeIsNotNull() {
            addCriterion("XmlType is not null");
            return (Criteria) this;
        }

        public Criteria andXmltypeEqualTo(String value) {
            addCriterion("XmlType =", value, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeNotEqualTo(String value) {
            addCriterion("XmlType <>", value, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeGreaterThan(String value) {
            addCriterion("XmlType >", value, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeGreaterThanOrEqualTo(String value) {
            addCriterion("XmlType >=", value, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeLessThan(String value) {
            addCriterion("XmlType <", value, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeLessThanOrEqualTo(String value) {
            addCriterion("XmlType <=", value, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeLike(String value) {
            addCriterion("XmlType like", value, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeNotLike(String value) {
            addCriterion("XmlType not like", value, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeIn(List<String> values) {
            addCriterion("XmlType in", values, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeNotIn(List<String> values) {
            addCriterion("XmlType not in", values, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeBetween(String value1, String value2) {
            addCriterion("XmlType between", value1, value2, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmltypeNotBetween(String value1, String value2) {
            addCriterion("XmlType not between", value1, value2, "xmltype");
            return (Criteria) this;
        }

        public Criteria andXmlpathIsNull() {
            addCriterion("XmlPath is null");
            return (Criteria) this;
        }

        public Criteria andXmlpathIsNotNull() {
            addCriterion("XmlPath is not null");
            return (Criteria) this;
        }

        public Criteria andXmlpathEqualTo(String value) {
            addCriterion("XmlPath =", value, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathNotEqualTo(String value) {
            addCriterion("XmlPath <>", value, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathGreaterThan(String value) {
            addCriterion("XmlPath >", value, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathGreaterThanOrEqualTo(String value) {
            addCriterion("XmlPath >=", value, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathLessThan(String value) {
            addCriterion("XmlPath <", value, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathLessThanOrEqualTo(String value) {
            addCriterion("XmlPath <=", value, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathLike(String value) {
            addCriterion("XmlPath like", value, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathNotLike(String value) {
            addCriterion("XmlPath not like", value, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathIn(List<String> values) {
            addCriterion("XmlPath in", values, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathNotIn(List<String> values) {
            addCriterion("XmlPath not in", values, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathBetween(String value1, String value2) {
            addCriterion("XmlPath between", value1, value2, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andXmlpathNotBetween(String value1, String value2) {
            addCriterion("XmlPath not between", value1, value2, "xmlpath");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("Operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("Operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("Operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("Operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("Operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("Operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("Operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("Operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("Operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("Operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("Operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("Operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("Operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("Operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNull() {
            addCriterion("MakeDate is null");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNotNull() {
            addCriterion("MakeDate is not null");
            return (Criteria) this;
        }

        public Criteria andMakedateEqualTo(Date value) {
            addCriterionForJDBCDate("MakeDate =", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MakeDate <>", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThan(Date value) {
            addCriterionForJDBCDate("MakeDate >", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MakeDate >=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThan(Date value) {
            addCriterionForJDBCDate("MakeDate <", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MakeDate <=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateIn(List<Date> values) {
            addCriterionForJDBCDate("MakeDate in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MakeDate not in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MakeDate between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MakeDate not between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNull() {
            addCriterion("MakeTime is null");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNotNull() {
            addCriterion("MakeTime is not null");
            return (Criteria) this;
        }

        public Criteria andMaketimeEqualTo(String value) {
            addCriterion("MakeTime =", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotEqualTo(String value) {
            addCriterion("MakeTime <>", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThan(String value) {
            addCriterion("MakeTime >", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThanOrEqualTo(String value) {
            addCriterion("MakeTime >=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThan(String value) {
            addCriterion("MakeTime <", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThanOrEqualTo(String value) {
            addCriterion("MakeTime <=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLike(String value) {
            addCriterion("MakeTime like", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotLike(String value) {
            addCriterion("MakeTime not like", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeIn(List<String> values) {
            addCriterion("MakeTime in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotIn(List<String> values) {
            addCriterion("MakeTime not in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeBetween(String value1, String value2) {
            addCriterion("MakeTime between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotBetween(String value1, String value2) {
            addCriterion("MakeTime not between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterionForJDBCDate("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterionForJDBCDate("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterionForJDBCDate("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ModifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(String value) {
            addCriterion("ModifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(String value) {
            addCriterion("ModifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(String value) {
            addCriterion("ModifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(String value) {
            addCriterion("ModifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(String value) {
            addCriterion("ModifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLike(String value) {
            addCriterion("ModifyTime like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotLike(String value) {
            addCriterion("ModifyTime not like", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<String> values) {
            addCriterion("ModifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<String> values) {
            addCriterion("ModifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(String value1, String value2) {
            addCriterion("ModifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(String value1, String value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1IsNull() {
            addCriterion("StandByFlag1 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1IsNotNull() {
            addCriterion("StandByFlag1 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1EqualTo(String value) {
            addCriterion("StandByFlag1 =", value, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1NotEqualTo(String value) {
            addCriterion("StandByFlag1 <>", value, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1GreaterThan(String value) {
            addCriterion("StandByFlag1 >", value, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1GreaterThanOrEqualTo(String value) {
            addCriterion("StandByFlag1 >=", value, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1LessThan(String value) {
            addCriterion("StandByFlag1 <", value, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1LessThanOrEqualTo(String value) {
            addCriterion("StandByFlag1 <=", value, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1Like(String value) {
            addCriterion("StandByFlag1 like", value, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1NotLike(String value) {
            addCriterion("StandByFlag1 not like", value, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1In(List<String> values) {
            addCriterion("StandByFlag1 in", values, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1NotIn(List<String> values) {
            addCriterion("StandByFlag1 not in", values, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1Between(String value1, String value2) {
            addCriterion("StandByFlag1 between", value1, value2, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag1NotBetween(String value1, String value2) {
            addCriterion("StandByFlag1 not between", value1, value2, "standbyflag1");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2IsNull() {
            addCriterion("StandByFlag2 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2IsNotNull() {
            addCriterion("StandByFlag2 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2EqualTo(String value) {
            addCriterion("StandByFlag2 =", value, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2NotEqualTo(String value) {
            addCriterion("StandByFlag2 <>", value, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2GreaterThan(String value) {
            addCriterion("StandByFlag2 >", value, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2GreaterThanOrEqualTo(String value) {
            addCriterion("StandByFlag2 >=", value, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2LessThan(String value) {
            addCriterion("StandByFlag2 <", value, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2LessThanOrEqualTo(String value) {
            addCriterion("StandByFlag2 <=", value, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2Like(String value) {
            addCriterion("StandByFlag2 like", value, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2NotLike(String value) {
            addCriterion("StandByFlag2 not like", value, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2In(List<String> values) {
            addCriterion("StandByFlag2 in", values, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2NotIn(List<String> values) {
            addCriterion("StandByFlag2 not in", values, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2Between(String value1, String value2) {
            addCriterion("StandByFlag2 between", value1, value2, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag2NotBetween(String value1, String value2) {
            addCriterion("StandByFlag2 not between", value1, value2, "standbyflag2");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3IsNull() {
            addCriterion("StandByFlag3 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3IsNotNull() {
            addCriterion("StandByFlag3 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3EqualTo(String value) {
            addCriterion("StandByFlag3 =", value, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3NotEqualTo(String value) {
            addCriterion("StandByFlag3 <>", value, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3GreaterThan(String value) {
            addCriterion("StandByFlag3 >", value, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3GreaterThanOrEqualTo(String value) {
            addCriterion("StandByFlag3 >=", value, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3LessThan(String value) {
            addCriterion("StandByFlag3 <", value, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3LessThanOrEqualTo(String value) {
            addCriterion("StandByFlag3 <=", value, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3Like(String value) {
            addCriterion("StandByFlag3 like", value, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3NotLike(String value) {
            addCriterion("StandByFlag3 not like", value, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3In(List<String> values) {
            addCriterion("StandByFlag3 in", values, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3NotIn(List<String> values) {
            addCriterion("StandByFlag3 not in", values, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3Between(String value1, String value2) {
            addCriterion("StandByFlag3 between", value1, value2, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag3NotBetween(String value1, String value2) {
            addCriterion("StandByFlag3 not between", value1, value2, "standbyflag3");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4IsNull() {
            addCriterion("StandByFlag4 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4IsNotNull() {
            addCriterion("StandByFlag4 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4EqualTo(String value) {
            addCriterion("StandByFlag4 =", value, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4NotEqualTo(String value) {
            addCriterion("StandByFlag4 <>", value, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4GreaterThan(String value) {
            addCriterion("StandByFlag4 >", value, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4GreaterThanOrEqualTo(String value) {
            addCriterion("StandByFlag4 >=", value, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4LessThan(String value) {
            addCriterion("StandByFlag4 <", value, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4LessThanOrEqualTo(String value) {
            addCriterion("StandByFlag4 <=", value, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4Like(String value) {
            addCriterion("StandByFlag4 like", value, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4NotLike(String value) {
            addCriterion("StandByFlag4 not like", value, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4In(List<String> values) {
            addCriterion("StandByFlag4 in", values, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4NotIn(List<String> values) {
            addCriterion("StandByFlag4 not in", values, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4Between(String value1, String value2) {
            addCriterion("StandByFlag4 between", value1, value2, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag4NotBetween(String value1, String value2) {
            addCriterion("StandByFlag4 not between", value1, value2, "standbyflag4");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5IsNull() {
            addCriterion("StandByFlag5 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5IsNotNull() {
            addCriterion("StandByFlag5 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5EqualTo(String value) {
            addCriterion("StandByFlag5 =", value, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5NotEqualTo(String value) {
            addCriterion("StandByFlag5 <>", value, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5GreaterThan(String value) {
            addCriterion("StandByFlag5 >", value, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5GreaterThanOrEqualTo(String value) {
            addCriterion("StandByFlag5 >=", value, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5LessThan(String value) {
            addCriterion("StandByFlag5 <", value, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5LessThanOrEqualTo(String value) {
            addCriterion("StandByFlag5 <=", value, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5Like(String value) {
            addCriterion("StandByFlag5 like", value, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5NotLike(String value) {
            addCriterion("StandByFlag5 not like", value, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5In(List<String> values) {
            addCriterion("StandByFlag5 in", values, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5NotIn(List<String> values) {
            addCriterion("StandByFlag5 not in", values, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5Between(String value1, String value2) {
            addCriterion("StandByFlag5 between", value1, value2, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andStandbyflag5NotBetween(String value1, String value2) {
            addCriterion("StandByFlag5 not between", value1, value2, "standbyflag5");
            return (Criteria) this;
        }

        public Criteria andErrorflagIsNull() {
            addCriterion("ErrorFlag is null");
            return (Criteria) this;
        }

        public Criteria andErrorflagIsNotNull() {
            addCriterion("ErrorFlag is not null");
            return (Criteria) this;
        }

        public Criteria andErrorflagEqualTo(String value) {
            addCriterion("ErrorFlag =", value, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagNotEqualTo(String value) {
            addCriterion("ErrorFlag <>", value, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagGreaterThan(String value) {
            addCriterion("ErrorFlag >", value, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagGreaterThanOrEqualTo(String value) {
            addCriterion("ErrorFlag >=", value, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagLessThan(String value) {
            addCriterion("ErrorFlag <", value, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagLessThanOrEqualTo(String value) {
            addCriterion("ErrorFlag <=", value, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagLike(String value) {
            addCriterion("ErrorFlag like", value, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagNotLike(String value) {
            addCriterion("ErrorFlag not like", value, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagIn(List<String> values) {
            addCriterion("ErrorFlag in", values, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagNotIn(List<String> values) {
            addCriterion("ErrorFlag not in", values, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagBetween(String value1, String value2) {
            addCriterion("ErrorFlag between", value1, value2, "errorflag");
            return (Criteria) this;
        }

        public Criteria andErrorflagNotBetween(String value1, String value2) {
            addCriterion("ErrorFlag not between", value1, value2, "errorflag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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