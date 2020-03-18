package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.dao.SpPermissionMapper;
import com.example.springboot_shop.dao.SpRoleMapper;
import com.example.springboot_shop.entity.SpPermission;
import com.example.springboot_shop.entity.SpRole;
import com.example.springboot_shop.entity.SpRoleWithBLOBs;
import com.example.springboot_shop.service.SpPermissionService;
import com.example.springboot_shop.service.SpRoleService;
import com.example.springboot_shop.utils.TreeUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpRoleServiceImpl implements SpRoleService {

    @Resource
    SpRoleMapper spRoleMapper;
    @Resource
    SpPermissionMapper spPermissionMapper;

    @Resource
    SpPermissionService spPermissionService;

    @Override
    public List<SpRoleWithBLOBs> getRoleList() {
        List<SpRoleWithBLOBs> roleList = spRoleMapper.getRoleList();
        for (SpRoleWithBLOBs role: roleList
             ) {
            String[] psIds = role.getPsIds().split(",");
            for (String id: psIds
                 ) {
                List<SpPermission> permissionList = spPermissionService.getPermissionList("tree");
                role.setChildren(permissionList);
            }
        }
        return roleList;
    }

    @Override
    public int addRole(SpRoleWithBLOBs role) {
        return spRoleMapper.insertSelective(role);
    }

    @Override
    public SpRoleWithBLOBs getRoleBysPrimaryKey(short roleId) {
        SpRoleWithBLOBs role = spRoleMapper.selectByPrimaryKey(roleId);
        for (String  psId: role.getPsIds().split(",")
             ) {
            if (psId != null && !"".equals(psId)){
                SpPermission spPermission = spPermissionMapper.selectByPrimaryKey(Short.parseShort(psId));
            }
        }



        return role;
    }

    @Override
    public SpRoleWithBLOBs getRoleBysSelective(SpRoleWithBLOBs role) {
        SpRoleWithBLOBs resRole = spRoleMapper.selectBySelective(role);
        List<SpPermission> children = TreeUtils.permissionListToTree(resRole.getChildren());
        resRole.setChildren(children);
        return resRole;
    }

    @Override
    public int updateRoleByPrimaryKey(SpRole role) {
        return spRoleMapper.updateByPrimaryKey(role);
    }

    @Override
    public int deleteRoleByPrimaryKey(short roleId) {
        return spRoleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int updeleteRoleInfoById(SpRoleWithBLOBs role) {
        return spRoleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public int deleteRoleOfPermission(short roleId, int rightId) {
        SpRoleWithBLOBs role = spRoleMapper.selectByPrimaryKey(roleId);
        StringBuffer sb = new StringBuffer();
        for (String psId:role.getPsIds().split(",")){
            if (psId != null &&  !"".equals(psId) && rightId != Integer.parseInt(psId)){
                sb.append(","+ psId);
            }
        }
        role.setPsIds(sb.toString().substring(sb.toString().indexOf(",")+1));
        System.out.println(role.getPsIds());
        return spRoleMapper.updateByPrimaryKeySelective(role);
    }
}
