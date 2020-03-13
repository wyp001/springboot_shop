package com.example.springboot_shop.controller;

import com.example.springboot_shop.constants.MgState;
import com.example.springboot_shop.entity.SpManager;
import com.example.springboot_shop.entity.SpManagerVO;
import com.example.springboot_shop.service.SpManagerService;
import com.example.springboot_shop.utils.Response;
import com.example.springboot_shop.utils.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SpManagerController {

    @Autowired
    SpManagerService spManagerService;

    @PostMapping("/users")
    public Response addManager(SpManagerVO managerVO){
        SpManager spManager = new SpManager();
        spManager.setMgName(managerVO.getUsername());
        spManager.setMgPwd(managerVO.getPassword());
        spManager.setMgEmail(managerVO.getEmail());
        spManager.setMgMobile(managerVO.getMobile());
        spManager.setMgTime( Integer.valueOf(String.valueOf(new SimpleDateFormat("yyyyMMdd").format(new Date()))));
        int roleId = 1;
        spManager.setRoleId((byte)roleId);
        spManagerService.addManager(spManager);
        return ResultFactory.buildAddSuccessResult(managerVO,"用户创建成功");
    }

    @PutMapping("/users/{uId}/state/{type}")
    public Response updateManagerState(@PathVariable int uId, @PathVariable("type") boolean type ){
        SpManager spManager = spManagerService.getManagerById(uId);
        spManager.setMgState((type ? MgState.TRUE.getValue() : MgState.FLASE.getValue()));
        spManagerService.updateManager(spManager);
        return ResultFactory.buildSuccessResult(spManager,"设置状态成功");
    }

    @GetMapping("users/{id}")
    public Response getManagerById(@PathVariable int id){
        SpManager spManager = spManagerService.getManagerById(id);
        Map<String,Object> data = new HashMap<>();
        data.put("id",spManager.getMgId());
        data.put("username",spManager.getMgName());
        data.put("role_id",spManager.getRoleId());
        data.put("mobile",spManager.getMgMobile());
        data.put("email",spManager.getMgEmail());
        return ResultFactory.buildSuccessResult(data,"查询成功");
    }

    @PutMapping("users/{id}")
    public Response updateManagerInfo(@PathVariable int id,SpManagerVO spManagerVO){
        SpManager spManager = spManagerService.getManagerById(id);
        spManager.setMgMobile(spManagerVO.getMobile());
        spManager.setMgEmail(spManagerVO.getEmail());
        spManagerService.updateManager(spManager);
        spManagerVO.setId(id);
        return ResultFactory.buildSuccessResult(spManagerVO,"更新成功");
    }

    @DeleteMapping("users/{id}")
    public Response deleteManagerById(@PathVariable int id){
        spManagerService.deleteManagerById(id);
        return ResultFactory.buildSuccessResult(null,"删除成功");
    }

    @PutMapping("users/{id}/role")
    public Response updateManagerRole(@PathVariable int id,SpManagerVO spManagerVO) {
        SpManager spManager = spManagerService.getManagerById(id);
        byte role_id = (byte) spManagerVO.getRole_id();
        spManager.setRoleId(role_id);
        spManagerService.updateManager(spManager);
        spManagerVO.setUsername(spManager.getMgName());
        spManagerVO.setMobile(spManager.getMgMobile());
        spManagerVO.setEmail(spManager.getMgEmail());
        spManagerVO.setId(spManager.getMgId());
        return  ResultFactory.buildSuccessResult(spManagerVO,"删除成功");
    }
}
