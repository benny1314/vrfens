package com.ttc.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleNameIsNull() {
            addCriterion("article_name is null");
            return (Criteria) this;
        }

        public Criteria andArticleNameIsNotNull() {
            addCriterion("article_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNameEqualTo(String value) {
            addCriterion("article_name =", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotEqualTo(String value) {
            addCriterion("article_name <>", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThan(String value) {
            addCriterion("article_name >", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThanOrEqualTo(String value) {
            addCriterion("article_name >=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThan(String value) {
            addCriterion("article_name <", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThanOrEqualTo(String value) {
            addCriterion("article_name <=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLike(String value) {
            addCriterion("article_name like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotLike(String value) {
            addCriterion("article_name not like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameIn(List<String> values) {
            addCriterion("article_name in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotIn(List<String> values) {
            addCriterion("article_name not in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameBetween(String value1, String value2) {
            addCriterion("article_name between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotBetween(String value1, String value2) {
            addCriterion("article_name not between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNull() {
            addCriterion("article_content is null");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNotNull() {
            addCriterion("article_content is not null");
            return (Criteria) this;
        }

        public Criteria andArticleContentEqualTo(String value) {
            addCriterion("article_content =", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotEqualTo(String value) {
            addCriterion("article_content <>", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThan(String value) {
            addCriterion("article_content >", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThanOrEqualTo(String value) {
            addCriterion("article_content >=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThan(String value) {
            addCriterion("article_content <", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThanOrEqualTo(String value) {
            addCriterion("article_content <=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLike(String value) {
            addCriterion("article_content like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotLike(String value) {
            addCriterion("article_content not like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentIn(List<String> values) {
            addCriterion("article_content in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotIn(List<String> values) {
            addCriterion("article_content not in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentBetween(String value1, String value2) {
            addCriterion("article_content between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotBetween(String value1, String value2) {
            addCriterion("article_content not between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentIsNull() {
            addCriterion("article_html_content is null");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentIsNotNull() {
            addCriterion("article_html_content is not null");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentEqualTo(String value) {
            addCriterion("article_html_content =", value, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentNotEqualTo(String value) {
            addCriterion("article_html_content <>", value, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentGreaterThan(String value) {
            addCriterion("article_html_content >", value, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentGreaterThanOrEqualTo(String value) {
            addCriterion("article_html_content >=", value, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentLessThan(String value) {
            addCriterion("article_html_content <", value, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentLessThanOrEqualTo(String value) {
            addCriterion("article_html_content <=", value, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentLike(String value) {
            addCriterion("article_html_content like", value, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentNotLike(String value) {
            addCriterion("article_html_content not like", value, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentIn(List<String> values) {
            addCriterion("article_html_content in", values, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentNotIn(List<String> values) {
            addCriterion("article_html_content not in", values, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentBetween(String value1, String value2) {
            addCriterion("article_html_content between", value1, value2, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlContentNotBetween(String value1, String value2) {
            addCriterion("article_html_content not between", value1, value2, "articleHtmlContent");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNull() {
            addCriterion("article_author is null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNotNull() {
            addCriterion("article_author is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEqualTo(String value) {
            addCriterion("article_author =", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotEqualTo(String value) {
            addCriterion("article_author <>", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThan(String value) {
            addCriterion("article_author >", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("article_author >=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThan(String value) {
            addCriterion("article_author <", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThanOrEqualTo(String value) {
            addCriterion("article_author <=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLike(String value) {
            addCriterion("article_author like", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotLike(String value) {
            addCriterion("article_author not like", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIn(List<String> values) {
            addCriterion("article_author in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotIn(List<String> values) {
            addCriterion("article_author not in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorBetween(String value1, String value2) {
            addCriterion("article_author between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotBetween(String value1, String value2) {
            addCriterion("article_author not between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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