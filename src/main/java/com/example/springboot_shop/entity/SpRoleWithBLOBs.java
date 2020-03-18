package com.example.springboot_shop.entity;

import java.util.ArrayList;
import java.util.List;

public class SpRoleWithBLOBs extends SpRole {

    private String psIds;

    private String psCa;

    private String roleDesc;

    private List<SpPermission>  children = new ArrayList<>();

    public String getPsCa() {
        return psCa;
    }

    public void setPsCa(String psCa) {
        this.psCa = psCa == null ? null : psCa.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getPsIds() {
        return psIds;
    }

    public void setPsIds(String psIds) {
        this.psIds = psIds;
    }

    @Override
    public List<SpPermission> getChildren() {
        return children;
    }

    @Override
    public void setChildren(List<SpPermission> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "SpRoleWithBLOBs{" +
                "psIds='" + psIds + '\'' +
                ", psCa='" + psCa + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", children=" + children +
                '}';
    }
}