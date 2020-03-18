package com.example.springboot_shop.service;

import com.example.springboot_shop.entity.SpCategory;

import java.util.List;

public interface SpCategoryService {

    List<SpCategory> getCategoryList();

    int addCategory(SpCategory category);

    SpCategory getCategoryByPrimaryKey(int catId);

    int updateCate(SpCategory category);

    int delCate(int catId);



}
