package com.example.springboot_shop.dao;

import com.example.springboot_shop.entity.SpRole;
import com.example.springboot_shop.entity.SpRoleWithBLOBs;

import java.util.List;

public interface SpRoleMapper {


    int deleteByPrimaryKey(Short roleId);

    int insert(SpRoleWithBLOBs record);

    int insertSelective(SpRoleWithBLOBs record);

    SpRoleWithBLOBs selectByPrimaryKey(Short roleId);

    SpRoleWithBLOBs selectBySelective(SpRoleWithBLOBs role);

    int updateByPrimaryKeySelective(SpRoleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SpRoleWithBLOBs record);

    int updateByPrimaryKey(SpRole record);

    List<SpRoleWithBLOBs> getRoleList();

}