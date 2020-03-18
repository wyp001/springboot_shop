package com.example.springboot_shop.entity;

import java.util.ArrayList;
import java.util.List;

public class SpRole {
    private Short roleId;

    private String roleName;

//    private String psIds;
//
//    private String psCa;

    private String roleDesc;

    private List<SpPermission> children;

    public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

//    public String getPsIds() {
//        return psIds;
//    }
//
//    public void setPsIds(String psIds) {
//        this.psIds = psIds == null ? null : psIds.trim();
//    }
//
//    public String getPsCa() {
//        return psCa;
//    }
//
//    public void setPsCa(String psCa) {
//        this.psCa = psCa;
//    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<SpPermission> getChildren() {
        return children;
    }

    public void setChildren(List<SpPermission> children) {
        this.children = children;
    }
}