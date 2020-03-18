package com.example.springboot_shop.controller;

import com.example.springboot_shop.entity.SpRole;
import com.example.springboot_shop.entity.SpRoleWithBLOBs;
import com.example.springboot_shop.service.SpRoleService;
import com.example.springboot_shop.utils.Response;
import com.example.springboot_shop.utils.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpRoleController {

    @Autowired
    SpRoleService spRoleService;

    @ResponseBody
    @GetMapping("roles")
    public Response getRoleList(){
        List<SpRoleWithBLOBs> roleList = spRoleService.getRoleList();
        return ResultFactory.buildSuccessResult(roleList,"获取成功");
    }

    @PostMapping("roles")
    public Response addRole(SpRoleWithBLOBs role){
        spRoleService.addRole(role);
        return ResultFactory.buildAddSuccessResult(role,"创建成功");
    }

    @GetMapping("roles/{id}")
    public Response getRoleByRoleId(@PathVariable("id") short roleId){
        SpRoleWithBLOBs role = spRoleService.getRoleBysPrimaryKey(roleId);
        return ResultFactory.buildSuccessResult(role,"获取成功");
    }

    @PutMapping("roles/{id}")
    public Response updateRoleById(@PathVariable("id") short roleId, SpRole role){
        role.setRoleId(roleId);
        spRoleService.updateRoleByPrimaryKey(role);
        return ResultFactory.buildSuccessResult(role,"编辑角色成功");
    }

    @DeleteMapping("roles/{id}")
    public Response deleteRoleById(@PathVariable("id") short roleId){
        spRoleService.deleteRoleByPrimaryKey(roleId);
        return ResultFactory.buildSuccessResult(null,"删除成功");
    }

    @PostMapping("roles/{roleId}/rights")
    public Response roleAuthorization(@PathVariable("roleId") short roleId,SpRoleWithBLOBs roleInfo){
        SpRoleWithBLOBs role = spRoleService.getRoleBysPrimaryKey(roleId);
        role.setPsIds(roleInfo.getPsIds());
        spRoleService.updeleteRoleInfoById(role);
        return ResultFactory.buildSuccessResult(role,"更新成功");
    }


    @DeleteMapping("roles/{roleId}/rights/{rightId}")
    public Response deleteRoleOfPermission(@PathVariable short roleId, @PathVariable int rightId) {
        spRoleService.deleteRoleOfPermission(roleId,rightId);
        SpRoleWithBLOBs role = spRoleService.getRoleBysPrimaryKey(roleId);
        role = spRoleService.getRoleBysSelective(role);
        return ResultFactory.buildSuccessResult(role,"取消权限成功");
    }


}
