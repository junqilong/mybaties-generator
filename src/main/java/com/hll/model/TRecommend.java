package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TRecommend implements Serializable {
    private Long id;

    private Integer recType;

    private String recName;

    private String language;

    private Long contentFirstId;

    private String contentFirstText;

    private String contentFirstPhoto;

    private Long contentSecondId;

    private String contentSecondText;

    private String contentSecondPhoto;

    private Long contentThirdId;

    private String contentThirdText;

    private String contentThirdPhoto;

    private Integer ageRangeId;

    private Long modelId;

    private String modelName;

    private Long versionId;

    private String versionCode;

    private String versionName;

    private String area;

    private String country;

    private Integer sort;

    private Integer status;

    private Date createDate;

    private Long createBy;

    private Date updateDate;

    private Long updateBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRecType() {
        return recType;
    }

    public void setRecType(Integer recType) {
        this.recType = recType;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getContentFirstId() {
        return contentFirstId;
    }

    public void setContentFirstId(Long contentFirstId) {
        this.contentFirstId = contentFirstId;
    }

    public String getContentFirstText() {
        return contentFirstText;
    }

    public void setContentFirstText(String contentFirstText) {
        this.contentFirstText = contentFirstText;
    }

    public String getContentFirstPhoto() {
        return contentFirstPhoto;
    }

    public void setContentFirstPhoto(String contentFirstPhoto) {
        this.contentFirstPhoto = contentFirstPhoto;
    }

    public Long getContentSecondId() {
        return contentSecondId;
    }

    public void setContentSecondId(Long contentSecondId) {
        this.contentSecondId = contentSecondId;
    }

    public String getContentSecondText() {
        return contentSecondText;
    }

    public void setContentSecondText(String contentSecondText) {
        this.contentSecondText = contentSecondText;
    }

    public String getContentSecondPhoto() {
        return contentSecondPhoto;
    }

    public void setContentSecondPhoto(String contentSecondPhoto) {
        this.contentSecondPhoto = contentSecondPhoto;
    }

    public Long getContentThirdId() {
        return contentThirdId;
    }

    public void setContentThirdId(Long contentThirdId) {
        this.contentThirdId = contentThirdId;
    }

    public String getContentThirdText() {
        return contentThirdText;
    }

    public void setContentThirdText(String contentThirdText) {
        this.contentThirdText = contentThirdText;
    }

    public String getContentThirdPhoto() {
        return contentThirdPhoto;
    }

    public void setContentThirdPhoto(String contentThirdPhoto) {
        this.contentThirdPhoto = contentThirdPhoto;
    }

    public Integer getAgeRangeId() {
        return ageRangeId;
    }

    public void setAgeRangeId(Integer ageRangeId) {
        this.ageRangeId = ageRangeId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", recType=").append(recType);
        sb.append(", recName=").append(recName);
        sb.append(", language=").append(language);
        sb.append(", contentFirstId=").append(contentFirstId);
        sb.append(", contentFirstText=").append(contentFirstText);
        sb.append(", contentFirstPhoto=").append(contentFirstPhoto);
        sb.append(", contentSecondId=").append(contentSecondId);
        sb.append(", contentSecondText=").append(contentSecondText);
        sb.append(", contentSecondPhoto=").append(contentSecondPhoto);
        sb.append(", contentThirdId=").append(contentThirdId);
        sb.append(", contentThirdText=").append(contentThirdText);
        sb.append(", contentThirdPhoto=").append(contentThirdPhoto);
        sb.append(", ageRangeId=").append(ageRangeId);
        sb.append(", modelId=").append(modelId);
        sb.append(", modelName=").append(modelName);
        sb.append(", versionId=").append(versionId);
        sb.append(", versionCode=").append(versionCode);
        sb.append(", versionName=").append(versionName);
        sb.append(", area=").append(area);
        sb.append(", country=").append(country);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}