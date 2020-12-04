package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Content implements Serializable {
    private Long id;

    @ApiModelProperty(value = "内容名称")
    private String name;

    private String names;

    @ApiModelProperty(value = "星级推荐")
    private Byte star;

    @ApiModelProperty(value = "内容类型")
    private String contentType;

    @ApiModelProperty(value = "app包名")
    private String packageName;

    @ApiModelProperty(value = "app内跳转链接")
    private String deepLink;

    @ApiModelProperty(value = "网站地址")
    private String websiteUrl;

    @ApiModelProperty(value = "内容图标")
    private String icon;

    @ApiModelProperty(value = "推荐图")
    private String recommendPic;

    @ApiModelProperty(value = "关联语言")
    private String language;

    private String languages;

    @ApiModelProperty(value = "年龄范围id")
    private Integer ageRangeId;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createdOn;

    @ApiModelProperty(value = "创建者")
    private Integer createdBy;

    @ApiModelProperty(value = "更新时间")
    private Date updatedOn;

    @ApiModelProperty(value = "更新者")
    private Integer updatedBy;

    private String countryCodes;

    private String ageRangeIds;

    private String modelNames;

    private String versionCodes;

    @ApiModelProperty(value = "表示跳转到页面做的动作，譬如播放视频，播放音乐等")
    private String extra;

    @ApiModelProperty(value = "描述")
    private String description;

    private String sourceUrl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Byte getStar() {
        return star;
    }

    public void setStar(Byte star) {
        this.star = star;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRecommendPic() {
        return recommendPic;
    }

    public void setRecommendPic(String recommendPic) {
        this.recommendPic = recommendPic;
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

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
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

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", names=").append(names);
        sb.append(", star=").append(star);
        sb.append(", contentType=").append(contentType);
        sb.append(", packageName=").append(packageName);
        sb.append(", deepLink=").append(deepLink);
        sb.append(", websiteUrl=").append(websiteUrl);
        sb.append(", icon=").append(icon);
        sb.append(", recommendPic=").append(recommendPic);
        sb.append(", language=").append(language);
        sb.append(", languages=").append(languages);
        sb.append(", ageRangeId=").append(ageRangeId);
        sb.append(", status=").append(status);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedOn=").append(updatedOn);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", countryCodes=").append(countryCodes);
        sb.append(", ageRangeIds=").append(ageRangeIds);
        sb.append(", modelNames=").append(modelNames);
        sb.append(", versionCodes=").append(versionCodes);
        sb.append(", extra=").append(extra);
        sb.append(", description=").append(description);
        sb.append(", sourceUrl=").append(sourceUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}