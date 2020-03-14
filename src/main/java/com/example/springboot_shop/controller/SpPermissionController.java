package com.example.springboot_shop.controller;

import com.example.springboot_shop.entity.SpPermission;
import com.example.springboot_shop.service.SpPermissionService;
import com.example.springboot_shop.utils.Response;
import com.example.springboot_shop.utils.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpPermissionController {

    @Autowired
    SpPermissionService spPermissionService;

    @GetMapping("rights/{type}")
    public Response getPermissionList(@PathVariable String type){
        List<SpPermission> list = spPermissionService.getPermissionList(type);
        return ResultFactory.buildSuccessResult(list,"获取权限列表成功");
    }




}
