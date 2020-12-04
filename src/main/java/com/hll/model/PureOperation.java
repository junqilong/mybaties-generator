package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PureOperation implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "资源类型，可多个")
    private String contentTypes;

    @ApiModelProperty(value = "语言代码，可多个")
    private String languages;

    @ApiModelProperty(value = "年龄段ID，可多选")
    private String ageRangeIds;

    @ApiModelProperty(value = "国家或地区代码，可多个")
    private String countryCodes;

    @ApiModelProperty(value = "机型名称，可多个")
    private String modelNames;

    @ApiModelProperty(value = "内部版本号，可多个")
    private String versionCodes;

    @ApiModelProperty(value = "1:纯净版或，2:营版")
    private Boolean type;

    @ApiModelProperty(value = "状态")
    private Byte status;

    @ApiModelProperty(value = "创建时间")
    private Date createdOn;

    @ApiModelProperty(value = "创建者")
    private Short createdBy;

    @ApiModelProperty(value = "更新时间")
    private Date updatedOn;

    @ApiModelProperty(value = "更新者")
    private Short updatedBy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContentTypes() {
        return contentTypes;
    }

    public void setContentTypes(String contentTypes) {
        this.contentTypes = contentTypes;
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

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Short getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Short createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Short getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Short updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contentTypes=").append(contentTypes);
        sb.append(", languages=").append(languages);
        sb.append(", ageRangeIds=").append(ageRangeIds);
        sb.append(", countryCodes=").append(countryCodes);
        sb.append(", modelNames=").append(modelNames);
        sb.append(", versionCodes=").append(versionCodes);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedOn=").append(updatedOn);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}