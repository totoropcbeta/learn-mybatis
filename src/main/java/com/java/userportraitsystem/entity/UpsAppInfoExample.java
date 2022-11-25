package com.java.userportraitsystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UpsAppInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpsAppInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNull() {
            addCriterion("appkey is null");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNotNull() {
            addCriterion("appkey is not null");
            return (Criteria) this;
        }

        public Criteria andAppkeyEqualTo(String value) {
            addCriterion("appkey =", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotEqualTo(String value) {
            addCriterion("appkey <>", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThan(String value) {
            addCriterion("appkey >", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
            addCriterion("appkey >=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThan(String value) {
            addCriterion("appkey <", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThanOrEqualTo(String value) {
            addCriterion("appkey <=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLike(String value) {
            addCriterion("appkey like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotLike(String value) {
            addCriterion("appkey not like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyIn(List<String> values) {
            addCriterion("appkey in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotIn(List<String> values) {
            addCriterion("appkey not in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyBetween(String value1, String value2) {
            addCriterion("appkey between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotBetween(String value1, String value2) {
            addCriterion("appkey not between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(Boolean value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(Boolean value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(Boolean value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(Boolean value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(Boolean value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<Boolean> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<Boolean> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(Boolean value1, Boolean value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIsNull() {
            addCriterion("business_group is null");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIsNotNull() {
            addCriterion("business_group is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupEqualTo(Integer value) {
            addCriterion("business_group =", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupNotEqualTo(Integer value) {
            addCriterion("business_group <>", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupGreaterThan(Integer value) {
            addCriterion("business_group >", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_group >=", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupLessThan(Integer value) {
            addCriterion("business_group <", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupLessThanOrEqualTo(Integer value) {
            addCriterion("business_group <=", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIn(List<Integer> values) {
            addCriterion("business_group in", values, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupNotIn(List<Integer> values) {
            addCriterion("business_group not in", values, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupBetween(Integer value1, Integer value2) {
            addCriterion("business_group between", value1, value2, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("business_group not between", value1, value2, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andPeakQpsIsNull() {
            addCriterion("peak_qps is null");
            return (Criteria) this;
        }

        public Criteria andPeakQpsIsNotNull() {
            addCriterion("peak_qps is not null");
            return (Criteria) this;
        }

        public Criteria andPeakQpsEqualTo(Integer value) {
            addCriterion("peak_qps =", value, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsNotEqualTo(Integer value) {
            addCriterion("peak_qps <>", value, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsGreaterThan(Integer value) {
            addCriterion("peak_qps >", value, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("peak_qps >=", value, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsLessThan(Integer value) {
            addCriterion("peak_qps <", value, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsLessThanOrEqualTo(Integer value) {
            addCriterion("peak_qps <=", value, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsIn(List<Integer> values) {
            addCriterion("peak_qps in", values, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsNotIn(List<Integer> values) {
            addCriterion("peak_qps not in", values, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsBetween(Integer value1, Integer value2) {
            addCriterion("peak_qps between", value1, value2, "peakQps");
            return (Criteria) this;
        }

        public Criteria andPeakQpsNotBetween(Integer value1, Integer value2) {
            addCriterion("peak_qps not between", value1, value2, "peakQps");
            return (Criteria) this;
        }

        public Criteria andDataAuthIsNull() {
            addCriterion("data_auth is null");
            return (Criteria) this;
        }

        public Criteria andDataAuthIsNotNull() {
            addCriterion("data_auth is not null");
            return (Criteria) this;
        }

        public Criteria andDataAuthEqualTo(String value) {
            addCriterion("data_auth =", value, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthNotEqualTo(String value) {
            addCriterion("data_auth <>", value, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthGreaterThan(String value) {
            addCriterion("data_auth >", value, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthGreaterThanOrEqualTo(String value) {
            addCriterion("data_auth >=", value, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthLessThan(String value) {
            addCriterion("data_auth <", value, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthLessThanOrEqualTo(String value) {
            addCriterion("data_auth <=", value, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthLike(String value) {
            addCriterion("data_auth like", value, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthNotLike(String value) {
            addCriterion("data_auth not like", value, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthIn(List<String> values) {
            addCriterion("data_auth in", values, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthNotIn(List<String> values) {
            addCriterion("data_auth not in", values, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthBetween(String value1, String value2) {
            addCriterion("data_auth between", value1, value2, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andDataAuthNotBetween(String value1, String value2) {
            addCriterion("data_auth not between", value1, value2, "dataAuth");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNull() {
            addCriterion("modtime is null");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNotNull() {
            addCriterion("modtime is not null");
            return (Criteria) this;
        }

        public Criteria andModtimeEqualTo(Date value) {
            addCriterion("modtime =", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotEqualTo(Date value) {
            addCriterion("modtime <>", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThan(Date value) {
            addCriterion("modtime >", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modtime >=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThan(Date value) {
            addCriterion("modtime <", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThanOrEqualTo(Date value) {
            addCriterion("modtime <=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIn(List<Date> values) {
            addCriterion("modtime in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotIn(List<Date> values) {
            addCriterion("modtime not in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeBetween(Date value1, Date value2) {
            addCriterion("modtime between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotBetween(Date value1, Date value2) {
            addCriterion("modtime not between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Boolean value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Boolean value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Boolean value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Boolean value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Boolean value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Boolean> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Boolean> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Boolean value1, Boolean value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelIsNull() {
            addCriterion("visit_all_label is null");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelIsNotNull() {
            addCriterion("visit_all_label is not null");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelEqualTo(Boolean value) {
            addCriterion("visit_all_label =", value, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelNotEqualTo(Boolean value) {
            addCriterion("visit_all_label <>", value, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelGreaterThan(Boolean value) {
            addCriterion("visit_all_label >", value, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("visit_all_label >=", value, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelLessThan(Boolean value) {
            addCriterion("visit_all_label <", value, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelLessThanOrEqualTo(Boolean value) {
            addCriterion("visit_all_label <=", value, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelIn(List<Boolean> values) {
            addCriterion("visit_all_label in", values, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelNotIn(List<Boolean> values) {
            addCriterion("visit_all_label not in", values, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelBetween(Boolean value1, Boolean value2) {
            addCriterion("visit_all_label between", value1, value2, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andVisitAllLabelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("visit_all_label not between", value1, value2, "visitAllLabel");
            return (Criteria) this;
        }

        public Criteria andBuIsNull() {
            addCriterion("bu is null");
            return (Criteria) this;
        }

        public Criteria andBuIsNotNull() {
            addCriterion("bu is not null");
            return (Criteria) this;
        }

        public Criteria andBuEqualTo(Integer value) {
            addCriterion("bu =", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuNotEqualTo(Integer value) {
            addCriterion("bu <>", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuGreaterThan(Integer value) {
            addCriterion("bu >", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuGreaterThanOrEqualTo(Integer value) {
            addCriterion("bu >=", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuLessThan(Integer value) {
            addCriterion("bu <", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuLessThanOrEqualTo(Integer value) {
            addCriterion("bu <=", value, "bu");
            return (Criteria) this;
        }

        public Criteria andBuIn(List<Integer> values) {
            addCriterion("bu in", values, "bu");
            return (Criteria) this;
        }

        public Criteria andBuNotIn(List<Integer> values) {
            addCriterion("bu not in", values, "bu");
            return (Criteria) this;
        }

        public Criteria andBuBetween(Integer value1, Integer value2) {
            addCriterion("bu between", value1, value2, "bu");
            return (Criteria) this;
        }

        public Criteria andBuNotBetween(Integer value1, Integer value2) {
            addCriterion("bu not between", value1, value2, "bu");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppDescIsNull() {
            addCriterion("app_desc is null");
            return (Criteria) this;
        }

        public Criteria andAppDescIsNotNull() {
            addCriterion("app_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAppDescEqualTo(String value) {
            addCriterion("app_desc =", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescNotEqualTo(String value) {
            addCriterion("app_desc <>", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescGreaterThan(String value) {
            addCriterion("app_desc >", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescGreaterThanOrEqualTo(String value) {
            addCriterion("app_desc >=", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescLessThan(String value) {
            addCriterion("app_desc <", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescLessThanOrEqualTo(String value) {
            addCriterion("app_desc <=", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescLike(String value) {
            addCriterion("app_desc like", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescNotLike(String value) {
            addCriterion("app_desc not like", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescIn(List<String> values) {
            addCriterion("app_desc in", values, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescNotIn(List<String> values) {
            addCriterion("app_desc not in", values, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescBetween(String value1, String value2) {
            addCriterion("app_desc between", value1, value2, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescNotBetween(String value1, String value2) {
            addCriterion("app_desc not between", value1, value2, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppAttrIsNull() {
            addCriterion("app_attr is null");
            return (Criteria) this;
        }

        public Criteria andAppAttrIsNotNull() {
            addCriterion("app_attr is not null");
            return (Criteria) this;
        }

        public Criteria andAppAttrEqualTo(String value) {
            addCriterion("app_attr =", value, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrNotEqualTo(String value) {
            addCriterion("app_attr <>", value, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrGreaterThan(String value) {
            addCriterion("app_attr >", value, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrGreaterThanOrEqualTo(String value) {
            addCriterion("app_attr >=", value, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrLessThan(String value) {
            addCriterion("app_attr <", value, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrLessThanOrEqualTo(String value) {
            addCriterion("app_attr <=", value, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrLike(String value) {
            addCriterion("app_attr like", value, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrNotLike(String value) {
            addCriterion("app_attr not like", value, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrIn(List<String> values) {
            addCriterion("app_attr in", values, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrNotIn(List<String> values) {
            addCriterion("app_attr not in", values, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrBetween(String value1, String value2) {
            addCriterion("app_attr between", value1, value2, "appAttr");
            return (Criteria) this;
        }

        public Criteria andAppAttrNotBetween(String value1, String value2) {
            addCriterion("app_attr not between", value1, value2, "appAttr");
            return (Criteria) this;
        }

        public Criteria andBgbuIsNull() {
            addCriterion("bgbu is null");
            return (Criteria) this;
        }

        public Criteria andBgbuIsNotNull() {
            addCriterion("bgbu is not null");
            return (Criteria) this;
        }

        public Criteria andBgbuEqualTo(String value) {
            addCriterion("bgbu =", value, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuNotEqualTo(String value) {
            addCriterion("bgbu <>", value, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuGreaterThan(String value) {
            addCriterion("bgbu >", value, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuGreaterThanOrEqualTo(String value) {
            addCriterion("bgbu >=", value, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuLessThan(String value) {
            addCriterion("bgbu <", value, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuLessThanOrEqualTo(String value) {
            addCriterion("bgbu <=", value, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuLike(String value) {
            addCriterion("bgbu like", value, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuNotLike(String value) {
            addCriterion("bgbu not like", value, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuIn(List<String> values) {
            addCriterion("bgbu in", values, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuNotIn(List<String> values) {
            addCriterion("bgbu not in", values, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuBetween(String value1, String value2) {
            addCriterion("bgbu between", value1, value2, "bgbu");
            return (Criteria) this;
        }

        public Criteria andBgbuNotBetween(String value1, String value2) {
            addCriterion("bgbu not between", value1, value2, "bgbu");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeIsNull() {
            addCriterion("feedback_cycle_type is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeIsNotNull() {
            addCriterion("feedback_cycle_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeEqualTo(Integer value) {
            addCriterion("feedback_cycle_type =", value, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeNotEqualTo(Integer value) {
            addCriterion("feedback_cycle_type <>", value, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeGreaterThan(Integer value) {
            addCriterion("feedback_cycle_type >", value, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("feedback_cycle_type >=", value, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeLessThan(Integer value) {
            addCriterion("feedback_cycle_type <", value, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("feedback_cycle_type <=", value, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeIn(List<Integer> values) {
            addCriterion("feedback_cycle_type in", values, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeNotIn(List<Integer> values) {
            addCriterion("feedback_cycle_type not in", values, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeBetween(Integer value1, Integer value2) {
            addCriterion("feedback_cycle_type between", value1, value2, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCycleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("feedback_cycle_type not between", value1, value2, "feedbackCycleType");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIsNull() {
            addCriterion("feedback_date is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIsNotNull() {
            addCriterion("feedback_date is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateEqualTo(Date value) {
            addCriterionForJDBCDate("feedback_date =", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("feedback_date <>", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateGreaterThan(Date value) {
            addCriterionForJDBCDate("feedback_date >", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("feedback_date >=", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateLessThan(Date value) {
            addCriterionForJDBCDate("feedback_date <", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("feedback_date <=", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIn(List<Date> values) {
            addCriterionForJDBCDate("feedback_date in", values, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("feedback_date not in", values, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("feedback_date between", value1, value2, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("feedback_date not between", value1, value2, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusIsNull() {
            addCriterion("feedback_status is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusIsNotNull() {
            addCriterion("feedback_status is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusEqualTo(Integer value) {
            addCriterion("feedback_status =", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusNotEqualTo(Integer value) {
            addCriterion("feedback_status <>", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusGreaterThan(Integer value) {
            addCriterion("feedback_status >", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("feedback_status >=", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusLessThan(Integer value) {
            addCriterion("feedback_status <", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusLessThanOrEqualTo(Integer value) {
            addCriterion("feedback_status <=", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusIn(List<Integer> values) {
            addCriterion("feedback_status in", values, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusNotIn(List<Integer> values) {
            addCriterion("feedback_status not in", values, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusBetween(Integer value1, Integer value2) {
            addCriterion("feedback_status between", value1, value2, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("feedback_status not between", value1, value2, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(String value) {
            addCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(String value) {
            addCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(String value) {
            addCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(String value) {
            addCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(String value) {
            addCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(String value) {
            addCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLike(String value) {
            addCriterion("admin like", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotLike(String value) {
            addCriterion("admin not like", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<String> values) {
            addCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<String> values) {
            addCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(String value1, String value2) {
            addCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(String value1, String value2) {
            addCriterion("admin not between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andInternalIsNull() {
            addCriterion("internal is null");
            return (Criteria) this;
        }

        public Criteria andInternalIsNotNull() {
            addCriterion("internal is not null");
            return (Criteria) this;
        }

        public Criteria andInternalEqualTo(Boolean value) {
            addCriterion("internal =", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotEqualTo(Boolean value) {
            addCriterion("internal <>", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThan(Boolean value) {
            addCriterion("internal >", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("internal >=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThan(Boolean value) {
            addCriterion("internal <", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThanOrEqualTo(Boolean value) {
            addCriterion("internal <=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalIn(List<Boolean> values) {
            addCriterion("internal in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotIn(List<Boolean> values) {
            addCriterion("internal not in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalBetween(Boolean value1, Boolean value2) {
            addCriterion("internal between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("internal not between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andAuthBizIsNull() {
            addCriterion("auth_biz is null");
            return (Criteria) this;
        }

        public Criteria andAuthBizIsNotNull() {
            addCriterion("auth_biz is not null");
            return (Criteria) this;
        }

        public Criteria andAuthBizEqualTo(String value) {
            addCriterion("auth_biz =", value, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizNotEqualTo(String value) {
            addCriterion("auth_biz <>", value, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizGreaterThan(String value) {
            addCriterion("auth_biz >", value, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizGreaterThanOrEqualTo(String value) {
            addCriterion("auth_biz >=", value, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizLessThan(String value) {
            addCriterion("auth_biz <", value, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizLessThanOrEqualTo(String value) {
            addCriterion("auth_biz <=", value, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizLike(String value) {
            addCriterion("auth_biz like", value, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizNotLike(String value) {
            addCriterion("auth_biz not like", value, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizIn(List<String> values) {
            addCriterion("auth_biz in", values, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizNotIn(List<String> values) {
            addCriterion("auth_biz not in", values, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizBetween(String value1, String value2) {
            addCriterion("auth_biz between", value1, value2, "authBiz");
            return (Criteria) this;
        }

        public Criteria andAuthBizNotBetween(String value1, String value2) {
            addCriterion("auth_biz not between", value1, value2, "authBiz");
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
    }
}