package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TLearningcenter implements Serializable {
    private Long id;

    private Long contentId;

    private String contentType;

    private String contentName;

    private String contentTraitName;

    private String languages;

    private String ageRangeIds;

    private String modelNames;

    private String versionCodes;

    private String countries;

    private Integer sort;

    private Integer status;

    private String remark;

    private Date createDate;

    private Integer createBy;

    private Date updateDate;

    private Integer updateBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getContentTraitName() {
        return contentTraitName;
    }

    public void setContentTraitName(String contentTraitName) {
        this.contentTraitName = contentTraitName;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getAgeRangeIds() {
        return ageRangeIds;
    }

    public void setAgeRangeIds(String ageRangeIds) {
        this.ageRangeIds = ageRangeIds;
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

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contentId=").append(contentId);
        sb.append(", contentType=").append(contentType);
        sb.append(", contentName=").append(contentName);
        sb.append(", contentTraitName=").append(contentTraitName);
        sb.append(", languages=").append(languages);
        sb.append(", ageRangeIds=").append(ageRangeIds);
        sb.append(", modelNames=").append(modelNames);
        sb.append(", versionCodes=").append(versionCodes);
        sb.append(", countries=").append(countries);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}