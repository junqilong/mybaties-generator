package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class VersionModelRelated implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "版本id")
    private Integer packageVersionId;

    @ApiModelProperty(value = "机型id")
    private Long padModelId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageVersionId() {
        return packageVersionId;
    }

    public void setPackageVersionId(Integer packageVersionId) {
        this.packageVersionId = packageVersionId;
    }

    public Long getPadModelId() {
        return padModelId;
    }

    public void setPadModelId(Long padModelId) {
        this.padModelId = padModelId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", packageVersionId=").append(packageVersionId);
        sb.append(", padModelId=").append(padModelId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}