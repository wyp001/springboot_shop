package com.example.springboot_shop.entity;

import java.util.ArrayList;
import java.util.List;

public class SpCategory {
    private Integer catId;

    private String catName;

    private Integer catPid;

    private Integer catLevel;

    private Integer catDeleted;

    private String catIcon;

    private String catSrc;

    private List<SpCategory> children = new ArrayList<>();

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public Integer getCatPid() {
        return catPid;
    }

    public void setCatPid(Integer catPid) {
        this.catPid = catPid;
    }

    public Integer getCatLevel() {
        return catLevel;
    }

    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    public Integer getCatDeleted() {
        return catDeleted;
    }

    public void setCatDeleted(Integer catDeleted) {
        this.catDeleted = catDeleted;
    }

    public String getCatIcon() {
        return catIcon;
    }

    public void setCatIcon(String catIcon) {
        this.catIcon = catIcon == null ? null : catIcon.trim();
    }

    public String getCatSrc() {
        return catSrc;
    }

    public void setCatSrc(String catSrc) {
        this.catSrc = catSrc == null ? null : catSrc.trim();
    }

    public List<SpCategory> getChildren() {
        return children;
    }

    public void setChildren(List<SpCategory> children) {
        this.children = children;
    }
}