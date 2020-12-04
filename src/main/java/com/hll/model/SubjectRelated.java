package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SubjectRelated implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "专题ID")
    private Integer subjectId;

    @ApiModelProperty(value = "内容如app、website的id")
    private Long contentId;

    @ApiModelProperty(value = "排序")
    private Integer contentSort;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Integer getContentSort() {
        return contentSort;
    }

    public void setContentSort(Integer contentSort) {
        this.contentSort = contentSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", contentId=").append(contentId);
        sb.append(", contentSort=").append(contentSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}