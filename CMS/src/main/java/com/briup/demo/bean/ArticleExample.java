package com.briup.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Short value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andClicktimesIsNull() {
            addCriterion("CLICKTIMES is null");
            return (Criteria) this;
        }

        public Criteria andClicktimesIsNotNull() {
            addCriterion("CLICKTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andClicktimesEqualTo(Short value) {
            addCriterion("CLICKTIMES =", value, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesNotEqualTo(Short value) {
            addCriterion("CLICKTIMES <>", value, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesGreaterThan(Short value) {
            addCriterion("CLICKTIMES >", value, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesGreaterThanOrEqualTo(Short value) {
            addCriterion("CLICKTIMES >=", value, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesLessThan(Short value) {
            addCriterion("CLICKTIMES <", value, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesLessThanOrEqualTo(Short value) {
            addCriterion("CLICKTIMES <=", value, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesIn(List<Short> values) {
            addCriterion("CLICKTIMES in", values, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesNotIn(List<Short> values) {
            addCriterion("CLICKTIMES not in", values, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesBetween(Short value1, Short value2) {
            addCriterion("CLICKTIMES between", value1, value2, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andClicktimesNotBetween(Short value1, Short value2) {
            addCriterion("CLICKTIMES not between", value1, value2, "clicktimes");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("PUBLISHDATE is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("PUBLISHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(Date value) {
            addCriterion("PUBLISHDATE =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(Date value) {
            addCriterion("PUBLISHDATE <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(Date value) {
            addCriterion("PUBLISHDATE >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBLISHDATE >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(Date value) {
            addCriterion("PUBLISHDATE <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(Date value) {
            addCriterion("PUBLISHDATE <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<Date> values) {
            addCriterion("PUBLISHDATE in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<Date> values) {
            addCriterion("PUBLISHDATE not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(Date value1, Date value2) {
            addCriterion("PUBLISHDATE between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(Date value1, Date value2) {
            addCriterion("PUBLISHDATE not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Short value) {
            addCriterion("CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Short value) {
            addCriterion("CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Short value) {
            addCriterion("CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Short value) {
            addCriterion("CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Short value) {
            addCriterion("CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Short value) {
            addCriterion("CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Short> values) {
            addCriterion("CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Short> values) {
            addCriterion("CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Short value1, Short value2) {
            addCriterion("CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Short value1, Short value2) {
            addCriterion("CATEGORY_ID not between", value1, value2, "categoryId");
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