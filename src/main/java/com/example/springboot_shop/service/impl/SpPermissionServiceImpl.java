package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.dao.SpPermissionMapper;
import com.example.springboot_shop.entity.SpPermission;
import com.example.springboot_shop.service.SpPermissionService;
import com.example.springboot_shop.utils.TreeUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SpPermissionServiceImpl implements SpPermissionService {

    @Resource
    SpPermissionMapper spPermissionMapper;


    @Override
    public List<SpPermission> getPermissionList(String type) {
        List<SpPermission> list = spPermissionMapper.getPermissionList();
        if ("tree".equals(type)){
            list = TreeUtils.permissionListToTree(list);
        }
        return list;
    }
}
