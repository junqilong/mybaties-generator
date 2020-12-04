package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BaseCountry implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "国家或地区名称")
    private String countryName;

    @ApiModelProperty(value = "国家或地区代码")
    private String countryCode;

    @ApiModelProperty(value = "中文名称")
    private String countryNameCn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryNameCn() {
        return countryNameCn;
    }

    public void setCountryNameCn(String countryNameCn) {
        this.countryNameCn = countryNameCn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countryName=").append(countryName);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", countryNameCn=").append(countryNameCn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}