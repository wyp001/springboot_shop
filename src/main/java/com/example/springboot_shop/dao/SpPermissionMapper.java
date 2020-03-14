package com.example.springboot_shop.dao;

import com.example.springboot_shop.entity.SpPermission;

import java.util.List;

public interface SpPermissionMapper {

    int deleteByPrimaryKey(Short psId);

    int insert(SpPermission record);

    int insertSelective(SpPermission record);

    SpPermission selectByPrimaryKey(Short psId);

    int updateByPrimaryKeySelective(SpPermission record);

    int updateByPrimaryKey(SpPermission record);

    List<SpPermission> getPermissionList();
}