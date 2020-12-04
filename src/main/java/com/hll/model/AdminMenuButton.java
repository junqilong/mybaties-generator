package com.hll.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AdminMenuButton implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "所属上级菜单")
    private String parentCode;

    @ApiModelProperty(value = "1查看，2编辑")
    private String permissionCode;

    @ApiModelProperty(value = "按钮名称")
    private String name;

    @ApiModelProperty(value = "按钮url")
    private String pageUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentCode=").append(parentCode);
        sb.append(", permissionCode=").append(permissionCode);
        sb.append(", name=").append(name);
        sb.append(", pageUrl=").append(pageUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}