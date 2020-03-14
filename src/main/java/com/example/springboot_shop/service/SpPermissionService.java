package com.example.springboot_shop.service;

import com.example.springboot_shop.entity.SpPermission;

import java.util.List;

public interface SpPermissionService {


    List<SpPermission> getPermissionList(String type);



}
