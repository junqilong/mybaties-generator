package com.hll.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRecommendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRecommendExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRecTypeIsNull() {
            addCriterion("rec_type is null");
            return (Criteria) this;
        }

        public Criteria andRecTypeIsNotNull() {
            addCriterion("rec_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecTypeEqualTo(Integer value) {
            addCriterion("rec_type =", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotEqualTo(Integer value) {
            addCriterion("rec_type <>", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeGreaterThan(Integer value) {
            addCriterion("rec_type >", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_type >=", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeLessThan(Integer value) {
            addCriterion("rec_type <", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rec_type <=", value, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeIn(List<Integer> values) {
            addCriterion("rec_type in", values, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotIn(List<Integer> values) {
            addCriterion("rec_type not in", values, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeBetween(Integer value1, Integer value2) {
            addCriterion("rec_type between", value1, value2, "recType");
            return (Criteria) this;
        }

        public Criteria andRecTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_type not between", value1, value2, "recType");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNull() {
            addCriterion("rec_name is null");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNotNull() {
            addCriterion("rec_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecNameEqualTo(String value) {
            addCriterion("rec_name =", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotEqualTo(String value) {
            addCriterion("rec_name <>", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThan(String value) {
            addCriterion("rec_name >", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThanOrEqualTo(String value) {
            addCriterion("rec_name >=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThan(String value) {
            addCriterion("rec_name <", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThanOrEqualTo(String value) {
            addCriterion("rec_name <=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLike(String value) {
            addCriterion("rec_name like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotLike(String value) {
            addCriterion("rec_name not like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameIn(List<String> values) {
            addCriterion("rec_name in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotIn(List<String> values) {
            addCriterion("rec_name not in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameBetween(String value1, String value2) {
            addCriterion("rec_name between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotBetween(String value1, String value2) {
            addCriterion("rec_name not between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdIsNull() {
            addCriterion("content_first_id is null");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdIsNotNull() {
            addCriterion("content_first_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdEqualTo(Long value) {
            addCriterion("content_first_id =", value, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdNotEqualTo(Long value) {
            addCriterion("content_first_id <>", value, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdGreaterThan(Long value) {
            addCriterion("content_first_id >", value, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("content_first_id >=", value, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdLessThan(Long value) {
            addCriterion("content_first_id <", value, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdLessThanOrEqualTo(Long value) {
            addCriterion("content_first_id <=", value, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdIn(List<Long> values) {
            addCriterion("content_first_id in", values, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdNotIn(List<Long> values) {
            addCriterion("content_first_id not in", values, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdBetween(Long value1, Long value2) {
            addCriterion("content_first_id between", value1, value2, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstIdNotBetween(Long value1, Long value2) {
            addCriterion("content_first_id not between", value1, value2, "contentFirstId");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextIsNull() {
            addCriterion("content_first_text is null");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextIsNotNull() {
            addCriterion("content_first_text is not null");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextEqualTo(String value) {
            addCriterion("content_first_text =", value, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextNotEqualTo(String value) {
            addCriterion("content_first_text <>", value, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextGreaterThan(String value) {
            addCriterion("content_first_text >", value, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextGreaterThanOrEqualTo(String value) {
            addCriterion("content_first_text >=", value, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextLessThan(String value) {
            addCriterion("content_first_text <", value, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextLessThanOrEqualTo(String value) {
            addCriterion("content_first_text <=", value, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextLike(String value) {
            addCriterion("content_first_text like", value, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextNotLike(String value) {
            addCriterion("content_first_text not like", value, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextIn(List<String> values) {
            addCriterion("content_first_text in", values, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextNotIn(List<String> values) {
            addCriterion("content_first_text not in", values, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextBetween(String value1, String value2) {
            addCriterion("content_first_text between", value1, value2, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstTextNotBetween(String value1, String value2) {
            addCriterion("content_first_text not between", value1, value2, "contentFirstText");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoIsNull() {
            addCriterion("content_first_photo is null");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoIsNotNull() {
            addCriterion("content_first_photo is not null");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoEqualTo(String value) {
            addCriterion("content_first_photo =", value, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoNotEqualTo(String value) {
            addCriterion("content_first_photo <>", value, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoGreaterThan(String value) {
            addCriterion("content_first_photo >", value, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("content_first_photo >=", value, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoLessThan(String value) {
            addCriterion("content_first_photo <", value, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoLessThanOrEqualTo(String value) {
            addCriterion("content_first_photo <=", value, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoLike(String value) {
            addCriterion("content_first_photo like", value, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoNotLike(String value) {
            addCriterion("content_first_photo not like", value, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoIn(List<String> values) {
            addCriterion("content_first_photo in", values, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoNotIn(List<String> values) {
            addCriterion("content_first_photo not in", values, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoBetween(String value1, String value2) {
            addCriterion("content_first_photo between", value1, value2, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentFirstPhotoNotBetween(String value1, String value2) {
            addCriterion("content_first_photo not between", value1, value2, "contentFirstPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdIsNull() {
            addCriterion("content_second_id is null");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdIsNotNull() {
            addCriterion("content_second_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdEqualTo(Long value) {
            addCriterion("content_second_id =", value, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdNotEqualTo(Long value) {
            addCriterion("content_second_id <>", value, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdGreaterThan(Long value) {
            addCriterion("content_second_id >", value, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdGreaterThanOrEqualTo(Long value) {
            addCriterion("content_second_id >=", value, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdLessThan(Long value) {
            addCriterion("content_second_id <", value, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdLessThanOrEqualTo(Long value) {
            addCriterion("content_second_id <=", value, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdIn(List<Long> values) {
            addCriterion("content_second_id in", values, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdNotIn(List<Long> values) {
            addCriterion("content_second_id not in", values, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdBetween(Long value1, Long value2) {
            addCriterion("content_second_id between", value1, value2, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondIdNotBetween(Long value1, Long value2) {
            addCriterion("content_second_id not between", value1, value2, "contentSecondId");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextIsNull() {
            addCriterion("content_second_text is null");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextIsNotNull() {
            addCriterion("content_second_text is not null");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextEqualTo(String value) {
            addCriterion("content_second_text =", value, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextNotEqualTo(String value) {
            addCriterion("content_second_text <>", value, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextGreaterThan(String value) {
            addCriterion("content_second_text >", value, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextGreaterThanOrEqualTo(String value) {
            addCriterion("content_second_text >=", value, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextLessThan(String value) {
            addCriterion("content_second_text <", value, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextLessThanOrEqualTo(String value) {
            addCriterion("content_second_text <=", value, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextLike(String value) {
            addCriterion("content_second_text like", value, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextNotLike(String value) {
            addCriterion("content_second_text not like", value, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextIn(List<String> values) {
            addCriterion("content_second_text in", values, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextNotIn(List<String> values) {
            addCriterion("content_second_text not in", values, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextBetween(String value1, String value2) {
            addCriterion("content_second_text between", value1, value2, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondTextNotBetween(String value1, String value2) {
            addCriterion("content_second_text not between", value1, value2, "contentSecondText");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoIsNull() {
            addCriterion("content_second_photo is null");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoIsNotNull() {
            addCriterion("content_second_photo is not null");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoEqualTo(String value) {
            addCriterion("content_second_photo =", value, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoNotEqualTo(String value) {
            addCriterion("content_second_photo <>", value, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoGreaterThan(String value) {
            addCriterion("content_second_photo >", value, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("content_second_photo >=", value, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoLessThan(String value) {
            addCriterion("content_second_photo <", value, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoLessThanOrEqualTo(String value) {
            addCriterion("content_second_photo <=", value, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoLike(String value) {
            addCriterion("content_second_photo like", value, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoNotLike(String value) {
            addCriterion("content_second_photo not like", value, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoIn(List<String> values) {
            addCriterion("content_second_photo in", values, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoNotIn(List<String> values) {
            addCriterion("content_second_photo not in", values, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoBetween(String value1, String value2) {
            addCriterion("content_second_photo between", value1, value2, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentSecondPhotoNotBetween(String value1, String value2) {
            addCriterion("content_second_photo not between", value1, value2, "contentSecondPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdIsNull() {
            addCriterion("content_third_id is null");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdIsNotNull() {
            addCriterion("content_third_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdEqualTo(Long value) {
            addCriterion("content_third_id =", value, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdNotEqualTo(Long value) {
            addCriterion("content_third_id <>", value, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdGreaterThan(Long value) {
            addCriterion("content_third_id >", value, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("content_third_id >=", value, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdLessThan(Long value) {
            addCriterion("content_third_id <", value, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdLessThanOrEqualTo(Long value) {
            addCriterion("content_third_id <=", value, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdIn(List<Long> values) {
            addCriterion("content_third_id in", values, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdNotIn(List<Long> values) {
            addCriterion("content_third_id not in", values, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdBetween(Long value1, Long value2) {
            addCriterion("content_third_id between", value1, value2, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdIdNotBetween(Long value1, Long value2) {
            addCriterion("content_third_id not between", value1, value2, "contentThirdId");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextIsNull() {
            addCriterion("content_third_text is null");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextIsNotNull() {
            addCriterion("content_third_text is not null");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextEqualTo(String value) {
            addCriterion("content_third_text =", value, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextNotEqualTo(String value) {
            addCriterion("content_third_text <>", value, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextGreaterThan(String value) {
            addCriterion("content_third_text >", value, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextGreaterThanOrEqualTo(String value) {
            addCriterion("content_third_text >=", value, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextLessThan(String value) {
            addCriterion("content_third_text <", value, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextLessThanOrEqualTo(String value) {
            addCriterion("content_third_text <=", value, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextLike(String value) {
            addCriterion("content_third_text like", value, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextNotLike(String value) {
            addCriterion("content_third_text not like", value, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextIn(List<String> values) {
            addCriterion("content_third_text in", values, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextNotIn(List<String> values) {
            addCriterion("content_third_text not in", values, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextBetween(String value1, String value2) {
            addCriterion("content_third_text between", value1, value2, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdTextNotBetween(String value1, String value2) {
            addCriterion("content_third_text not between", value1, value2, "contentThirdText");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoIsNull() {
            addCriterion("content_third_photo is null");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoIsNotNull() {
            addCriterion("content_third_photo is not null");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoEqualTo(String value) {
            addCriterion("content_third_photo =", value, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoNotEqualTo(String value) {
            addCriterion("content_third_photo <>", value, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoGreaterThan(String value) {
            addCriterion("content_third_photo >", value, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("content_third_photo >=", value, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoLessThan(String value) {
            addCriterion("content_third_photo <", value, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoLessThanOrEqualTo(String value) {
            addCriterion("content_third_photo <=", value, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoLike(String value) {
            addCriterion("content_third_photo like", value, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoNotLike(String value) {
            addCriterion("content_third_photo not like", value, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoIn(List<String> values) {
            addCriterion("content_third_photo in", values, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoNotIn(List<String> values) {
            addCriterion("content_third_photo not in", values, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoBetween(String value1, String value2) {
            addCriterion("content_third_photo between", value1, value2, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andContentThirdPhotoNotBetween(String value1, String value2) {
            addCriterion("content_third_photo not between", value1, value2, "contentThirdPhoto");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdIsNull() {
            addCriterion("age_range_id is null");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdIsNotNull() {
            addCriterion("age_range_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdEqualTo(Integer value) {
            addCriterion("age_range_id =", value, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdNotEqualTo(Integer value) {
            addCriterion("age_range_id <>", value, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdGreaterThan(Integer value) {
            addCriterion("age_range_id >", value, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("age_range_id >=", value, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdLessThan(Integer value) {
            addCriterion("age_range_id <", value, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("age_range_id <=", value, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdIn(List<Integer> values) {
            addCriterion("age_range_id in", values, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdNotIn(List<Integer> values) {
            addCriterion("age_range_id not in", values, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdBetween(Integer value1, Integer value2) {
            addCriterion("age_range_id between", value1, value2, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("age_range_id not between", value1, value2, "ageRangeId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Long value) {
            addCriterion("version_id =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Long value) {
            addCriterion("version_id <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Long value) {
            addCriterion("version_id >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("version_id >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Long value) {
            addCriterion("version_id <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Long value) {
            addCriterion("version_id <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Long> values) {
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Long> values) {
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Long value1, Long value2) {
            addCriterion("version_id between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Long value1, Long value2) {
            addCriterion("version_id not between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIsNull() {
            addCriterion("version_code is null");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIsNotNull() {
            addCriterion("version_code is not null");
            return (Criteria) this;
        }

        public Criteria andVersionCodeEqualTo(String value) {
            addCriterion("version_code =", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotEqualTo(String value) {
            addCriterion("version_code <>", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeGreaterThan(String value) {
            addCriterion("version_code >", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("version_code >=", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeLessThan(String value) {
            addCriterion("version_code <", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeLessThanOrEqualTo(String value) {
            addCriterion("version_code <=", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeLike(String value) {
            addCriterion("version_code like", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotLike(String value) {
            addCriterion("version_code not like", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIn(List<String> values) {
            addCriterion("version_code in", values, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotIn(List<String> values) {
            addCriterion("version_code not in", values, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeBetween(String value1, String value2) {
            addCriterion("version_code between", value1, value2, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotBetween(String value1, String value2) {
            addCriterion("version_code not between", value1, value2, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionNameIsNull() {
            addCriterion("version_name is null");
            return (Criteria) this;
        }

        public Criteria andVersionNameIsNotNull() {
            addCriterion("version_name is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNameEqualTo(String value) {
            addCriterion("version_name =", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotEqualTo(String value) {
            addCriterion("version_name <>", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameGreaterThan(String value) {
            addCriterion("version_name >", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("version_name >=", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLessThan(String value) {
            addCriterion("version_name <", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLessThanOrEqualTo(String value) {
            addCriterion("version_name <=", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLike(String value) {
            addCriterion("version_name like", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotLike(String value) {
            addCriterion("version_name not like", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameIn(List<String> values) {
            addCriterion("version_name in", values, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotIn(List<String> values) {
            addCriterion("version_name not in", values, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameBetween(String value1, String value2) {
            addCriterion("version_name between", value1, value2, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotBetween(String value1, String value2) {
            addCriterion("version_name not between", value1, value2, "versionName");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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