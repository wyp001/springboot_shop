package com.example.springboot_shop.dao;

import com.example.springboot_shop.entity.SpManager;

public interface SpManagerMapper {


    int deleteByPrimaryKey(Integer mgId);

    int insert(SpManager record);

    int insertSelective(SpManager record);

    SpManager selectByPrimaryKey(Integer mgId);

    int updateByPrimaryKeySelective(SpManager record);

    int updateByPrimaryKey(SpManager record);
}