package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.dao.SpManagerMapper;
import com.example.springboot_shop.entity.SpManager;
import com.example.springboot_shop.service.SpManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SpManagerServiceImpl implements SpManagerService {

    @Resource
    SpManagerMapper spManagerMapper;

    @Override
    public int addManager(SpManager manager) {
        return spManagerMapper.insert(manager);
    }

    @Override
    public int updateManager(SpManager manager) {
        return spManagerMapper.updateByPrimaryKeySelective(manager);
    }

    @Override
    public SpManager getManagerById(int id) {
        return spManagerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteManagerById(int id) {
        return spManagerMapper.deleteByPrimaryKey(id);
    }
}
