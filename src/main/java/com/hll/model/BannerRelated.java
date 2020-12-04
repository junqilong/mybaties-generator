package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BannerRelated implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "只能关联一个内容")
    private Integer bannerId;

    @ApiModelProperty(value = "内容如app、website的id")
    private Long contentId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bannerId=").append(bannerId);
        sb.append(", contentId=").append(contentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}