package com.hll.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerExample() {
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

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
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

        public Criteria andCountryCodesIsNull() {
            addCriterion("country_codes is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodesIsNotNull() {
            addCriterion("country_codes is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodesEqualTo(String value) {
            addCriterion("country_codes =", value, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesNotEqualTo(String value) {
            addCriterion("country_codes <>", value, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesGreaterThan(String value) {
            addCriterion("country_codes >", value, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesGreaterThanOrEqualTo(String value) {
            addCriterion("country_codes >=", value, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesLessThan(String value) {
            addCriterion("country_codes <", value, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesLessThanOrEqualTo(String value) {
            addCriterion("country_codes <=", value, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesLike(String value) {
            addCriterion("country_codes like", value, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesNotLike(String value) {
            addCriterion("country_codes not like", value, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesIn(List<String> values) {
            addCriterion("country_codes in", values, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesNotIn(List<String> values) {
            addCriterion("country_codes not in", values, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesBetween(String value1, String value2) {
            addCriterion("country_codes between", value1, value2, "countryCodes");
            return (Criteria) this;
        }

        public Criteria andCountryCodesNotBetween(String value1, String value2) {
            addCriterion("country_codes not between", value1, value2, "countryCodes");
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

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(Byte value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(Byte value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(Byte value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(Byte value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(Byte value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(Byte value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<Byte> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<Byte> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(Byte value1, Byte value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(Byte value1, Byte value2) {
            addCriterion("place not between", value1, value2, "place");
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

        public Criteria andCreatedOnIsNull() {
            addCriterion("created_on is null");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIsNotNull() {
            addCriterion("created_on is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedOnEqualTo(Date value) {
            addCriterion("created_on =", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotEqualTo(Date value) {
            addCriterion("created_on <>", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnGreaterThan(Date value) {
            addCriterion("created_on >", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("created_on >=", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnLessThan(Date value) {
            addCriterion("created_on <", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnLessThanOrEqualTo(Date value) {
            addCriterion("created_on <=", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIn(List<Date> values) {
            addCriterion("created_on in", values, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotIn(List<Date> values) {
            addCriterion("created_on not in", values, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnBetween(Date value1, Date value2) {
            addCriterion("created_on between", value1, value2, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotBetween(Date value1, Date value2) {
            addCriterion("created_on not between", value1, value2, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnIsNull() {
            addCriterion("updated_on is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnIsNotNull() {
            addCriterion("updated_on is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnEqualTo(Date value) {
            addCriterion("updated_on =", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnNotEqualTo(Date value) {
            addCriterion("updated_on <>", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnGreaterThan(Date value) {
            addCriterion("updated_on >", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_on >=", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnLessThan(Date value) {
            addCriterion("updated_on <", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnLessThanOrEqualTo(Date value) {
            addCriterion("updated_on <=", value, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnIn(List<Date> values) {
            addCriterion("updated_on in", values, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnNotIn(List<Date> values) {
            addCriterion("updated_on not in", values, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnBetween(Date value1, Date value2) {
            addCriterion("updated_on between", value1, value2, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedOnNotBetween(Date value1, Date value2) {
            addCriterion("updated_on not between", value1, value2, "updatedOn");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Integer value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Integer value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Integer value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Integer value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Integer value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Integer> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Integer> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Integer value1, Integer value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
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