package com.example.springboot_shop.dao;

import com.example.springboot_shop.entity.SpCategory;

import java.util.List;

public interface SpCategoryMapper {

    int deleteByPrimaryKey(Integer catId);

    int insert(SpCategory record);

    int insertSelective(SpCategory record);

    SpCategory selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(SpCategory record);

    int updateByPrimaryKeyWithBLOBs(SpCategory record);

    int updateByPrimaryKey(SpCategory record);

    List<SpCategory> getCategoryList();


}