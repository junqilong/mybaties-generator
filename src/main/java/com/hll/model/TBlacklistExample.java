package com.hll.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBlacklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBlacklistExample() {
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

        public Criteria andBlackNameIsNull() {
            addCriterion("black_name is null");
            return (Criteria) this;
        }

        public Criteria andBlackNameIsNotNull() {
            addCriterion("black_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlackNameEqualTo(String value) {
            addCriterion("black_name =", value, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameNotEqualTo(String value) {
            addCriterion("black_name <>", value, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameGreaterThan(String value) {
            addCriterion("black_name >", value, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameGreaterThanOrEqualTo(String value) {
            addCriterion("black_name >=", value, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameLessThan(String value) {
            addCriterion("black_name <", value, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameLessThanOrEqualTo(String value) {
            addCriterion("black_name <=", value, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameLike(String value) {
            addCriterion("black_name like", value, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameNotLike(String value) {
            addCriterion("black_name not like", value, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameIn(List<String> values) {
            addCriterion("black_name in", values, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameNotIn(List<String> values) {
            addCriterion("black_name not in", values, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameBetween(String value1, String value2) {
            addCriterion("black_name between", value1, value2, "blackName");
            return (Criteria) this;
        }

        public Criteria andBlackNameNotBetween(String value1, String value2) {
            addCriterion("black_name not between", value1, value2, "blackName");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Long value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Long value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Long value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Long value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Long value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Long> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Long> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Long value1, Long value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Long value1, Long value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("content_type is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("content_type is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("content_type =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("content_type <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("content_type >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("content_type >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("content_type <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("content_type <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("content_type like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("content_type not like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<String> values) {
            addCriterion("content_type in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<String> values) {
            addCriterion("content_type not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("content_type between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("content_type not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andBlackAttrIsNull() {
            addCriterion("black_attr is null");
            return (Criteria) this;
        }

        public Criteria andBlackAttrIsNotNull() {
            addCriterion("black_attr is not null");
            return (Criteria) this;
        }

        public Criteria andBlackAttrEqualTo(String value) {
            addCriterion("black_attr =", value, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrNotEqualTo(String value) {
            addCriterion("black_attr <>", value, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrGreaterThan(String value) {
            addCriterion("black_attr >", value, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrGreaterThanOrEqualTo(String value) {
            addCriterion("black_attr >=", value, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrLessThan(String value) {
            addCriterion("black_attr <", value, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrLessThanOrEqualTo(String value) {
            addCriterion("black_attr <=", value, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrLike(String value) {
            addCriterion("black_attr like", value, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrNotLike(String value) {
            addCriterion("black_attr not like", value, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrIn(List<String> values) {
            addCriterion("black_attr in", values, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrNotIn(List<String> values) {
            addCriterion("black_attr not in", values, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrBetween(String value1, String value2) {
            addCriterion("black_attr between", value1, value2, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackAttrNotBetween(String value1, String value2) {
            addCriterion("black_attr not between", value1, value2, "blackAttr");
            return (Criteria) this;
        }

        public Criteria andBlackDescIsNull() {
            addCriterion("black_desc is null");
            return (Criteria) this;
        }

        public Criteria andBlackDescIsNotNull() {
            addCriterion("black_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBlackDescEqualTo(String value) {
            addCriterion("black_desc =", value, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescNotEqualTo(String value) {
            addCriterion("black_desc <>", value, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescGreaterThan(String value) {
            addCriterion("black_desc >", value, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescGreaterThanOrEqualTo(String value) {
            addCriterion("black_desc >=", value, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescLessThan(String value) {
            addCriterion("black_desc <", value, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescLessThanOrEqualTo(String value) {
            addCriterion("black_desc <=", value, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescLike(String value) {
            addCriterion("black_desc like", value, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescNotLike(String value) {
            addCriterion("black_desc not like", value, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescIn(List<String> values) {
            addCriterion("black_desc in", values, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescNotIn(List<String> values) {
            addCriterion("black_desc not in", values, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescBetween(String value1, String value2) {
            addCriterion("black_desc between", value1, value2, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andBlackDescNotBetween(String value1, String value2) {
            addCriterion("black_desc not between", value1, value2, "blackDesc");
            return (Criteria) this;
        }

        public Criteria andCountriesIsNull() {
            addCriterion("countries is null");
            return (Criteria) this;
        }

        public Criteria andCountriesIsNotNull() {
            addCriterion("countries is not null");
            return (Criteria) this;
        }

        public Criteria andCountriesEqualTo(String value) {
            addCriterion("countries =", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesNotEqualTo(String value) {
            addCriterion("countries <>", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesGreaterThan(String value) {
            addCriterion("countries >", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesGreaterThanOrEqualTo(String value) {
            addCriterion("countries >=", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesLessThan(String value) {
            addCriterion("countries <", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesLessThanOrEqualTo(String value) {
            addCriterion("countries <=", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesLike(String value) {
            addCriterion("countries like", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesNotLike(String value) {
            addCriterion("countries not like", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesIn(List<String> values) {
            addCriterion("countries in", values, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesNotIn(List<String> values) {
            addCriterion("countries not in", values, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesBetween(String value1, String value2) {
            addCriterion("countries between", value1, value2, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesNotBetween(String value1, String value2) {
            addCriterion("countries not between", value1, value2, "countries");
            return (Criteria) this;
        }

        public Criteria andLanguagesIsNull() {
            addCriterion("languages is null");
            return (Criteria) this;
        }

        public Criteria andLanguagesIsNotNull() {
            addCriterion("languages is not null");
            return (Criteria) this;
        }

        public Criteria andLanguagesEqualTo(String value) {
            addCriterion("languages =", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotEqualTo(String value) {
            addCriterion("languages <>", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesGreaterThan(String value) {
            addCriterion("languages >", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesGreaterThanOrEqualTo(String value) {
            addCriterion("languages >=", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesLessThan(String value) {
            addCriterion("languages <", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesLessThanOrEqualTo(String value) {
            addCriterion("languages <=", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesLike(String value) {
            addCriterion("languages like", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotLike(String value) {
            addCriterion("languages not like", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesIn(List<String> values) {
            addCriterion("languages in", values, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotIn(List<String> values) {
            addCriterion("languages not in", values, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesBetween(String value1, String value2) {
            addCriterion("languages between", value1, value2, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotBetween(String value1, String value2) {
            addCriterion("languages not between", value1, value2, "languages");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsIsNull() {
            addCriterion("age_range_ids is null");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsIsNotNull() {
            addCriterion("age_range_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsEqualTo(String value) {
            addCriterion("age_range_ids =", value, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsNotEqualTo(String value) {
            addCriterion("age_range_ids <>", value, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsGreaterThan(String value) {
            addCriterion("age_range_ids >", value, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("age_range_ids >=", value, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsLessThan(String value) {
            addCriterion("age_range_ids <", value, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsLessThanOrEqualTo(String value) {
            addCriterion("age_range_ids <=", value, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsLike(String value) {
            addCriterion("age_range_ids like", value, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsNotLike(String value) {
            addCriterion("age_range_ids not like", value, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsIn(List<String> values) {
            addCriterion("age_range_ids in", values, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsNotIn(List<String> values) {
            addCriterion("age_range_ids not in", values, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsBetween(String value1, String value2) {
            addCriterion("age_range_ids between", value1, value2, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andAgeRangeIdsNotBetween(String value1, String value2) {
            addCriterion("age_range_ids not between", value1, value2, "ageRangeIds");
            return (Criteria) this;
        }

        public Criteria andModelNamesIsNull() {
            addCriterion("model_names is null");
            return (Criteria) this;
        }

        public Criteria andModelNamesIsNotNull() {
            addCriterion("model_names is not null");
            return (Criteria) this;
        }

        public Criteria andModelNamesEqualTo(String value) {
            addCriterion("model_names =", value, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesNotEqualTo(String value) {
            addCriterion("model_names <>", value, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesGreaterThan(String value) {
            addCriterion("model_names >", value, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesGreaterThanOrEqualTo(String value) {
            addCriterion("model_names >=", value, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesLessThan(String value) {
            addCriterion("model_names <", value, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesLessThanOrEqualTo(String value) {
            addCriterion("model_names <=", value, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesLike(String value) {
            addCriterion("model_names like", value, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesNotLike(String value) {
            addCriterion("model_names not like", value, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesIn(List<String> values) {
            addCriterion("model_names in", values, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesNotIn(List<String> values) {
            addCriterion("model_names not in", values, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesBetween(String value1, String value2) {
            addCriterion("model_names between", value1, value2, "modelNames");
            return (Criteria) this;
        }

        public Criteria andModelNamesNotBetween(String value1, String value2) {
            addCriterion("model_names not between", value1, value2, "modelNames");
            return (Criteria) this;
        }

        public Criteria andVersionCodesIsNull() {
            addCriterion("version_codes is null");
            return (Criteria) this;
        }

        public Criteria andVersionCodesIsNotNull() {
            addCriterion("version_codes is not null");
            return (Criteria) this;
        }

        public Criteria andVersionCodesEqualTo(String value) {
            addCriterion("version_codes =", value, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesNotEqualTo(String value) {
            addCriterion("version_codes <>", value, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesGreaterThan(String value) {
            addCriterion("version_codes >", value, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesGreaterThanOrEqualTo(String value) {
            addCriterion("version_codes >=", value, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesLessThan(String value) {
            addCriterion("version_codes <", value, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesLessThanOrEqualTo(String value) {
            addCriterion("version_codes <=", value, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesLike(String value) {
            addCriterion("version_codes like", value, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesNotLike(String value) {
            addCriterion("version_codes not like", value, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesIn(List<String> values) {
            addCriterion("version_codes in", values, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesNotIn(List<String> values) {
            addCriterion("version_codes not in", values, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesBetween(String value1, String value2) {
            addCriterion("version_codes between", value1, value2, "versionCodes");
            return (Criteria) this;
        }

        public Criteria andVersionCodesNotBetween(String value1, String value2) {
            addCriterion("version_codes not between", value1, value2, "versionCodes");
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

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Integer value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Integer value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Integer value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Integer value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Integer> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Integer> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Integer value1, Integer value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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