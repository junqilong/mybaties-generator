package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "类别名称")
    private String categoryName;

    @ApiModelProperty(value = "类别简称")
    private String categoryCode;

    @ApiModelProperty(value = "类别图标")
    private String categoryIcon;

    @ApiModelProperty(value = "语言")
    private String language;

    private String languages;

    @ApiModelProperty(value = "年龄范围id")
    private Integer ageRangeId;

    private String ageRangeIds;

    private String countryCodes;

    private String modelNames;

    private String versionCodes;

    private Integer sort;

    private Integer status;

    private Date createdOn;

    private Integer createdBy;

    private Date updatedOn;

    private Integer updatedBy;

    private Byte top;

    private Byte allFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Integer getAgeRangeId() {
        return ageRangeId;
    }

    public void setAgeRangeId(Integer ageRangeId) {
        this.ageRangeId = ageRangeId;
    }

    public String getAgeRangeIds() {
        return ageRangeIds;
    }

    public void setAgeRangeIds(String ageRangeIds) {
        this.ageRangeIds = ageRangeIds;
    }

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    public String getModelNames() {
        return modelNames;
    }

    public void setModelNames(String modelNames) {
        this.modelNames = modelNames;
    }

    public String getVersionCodes() {
        return versionCodes;
    }

    public void setVersionCodes(String versionCodes) {
        this.versionCodes = versionCodes;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Byte getTop() {
        return top;
    }

    public void setTop(Byte top) {
        this.top = top;
    }

    public Byte getAllFlag() {
        return allFlag;
    }

    public void setAllFlag(Byte allFlag) {
        this.allFlag = allFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryCode=").append(categoryCode);
        sb.append(", categoryIcon=").append(categoryIcon);
        sb.append(", language=").append(language);
        sb.append(", languages=").append(languages);
        sb.append(", ageRangeId=").append(ageRangeId);
        sb.append(", ageRangeIds=").append(ageRangeIds);
        sb.append(", countryCodes=").append(countryCodes);
        sb.append(", modelNames=").append(modelNames);
        sb.append(", versionCodes=").append(versionCodes);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedOn=").append(updatedOn);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", top=").append(top);
        sb.append(", allFlag=").append(allFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}