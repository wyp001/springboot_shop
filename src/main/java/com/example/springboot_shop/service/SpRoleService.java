package com.example.springboot_shop.service;

import com.example.springboot_shop.entity.SpRole;
import com.example.springboot_shop.entity.SpRoleWithBLOBs;

import java.util.List;

public interface SpRoleService {

    List<SpRoleWithBLOBs> getRoleList();

    int addRole(SpRoleWithBLOBs role);

    SpRoleWithBLOBs getRoleBysPrimaryKey(short roleId);

    SpRoleWithBLOBs getRoleBysSelective(SpRoleWithBLOBs role);

    int updateRoleByPrimaryKey(SpRole role);

    int deleteRoleByPrimaryKey(short roleId);

    int updeleteRoleInfoById(SpRoleWithBLOBs role);

    int deleteRoleOfPermission(short roleId, int rightId);


}
