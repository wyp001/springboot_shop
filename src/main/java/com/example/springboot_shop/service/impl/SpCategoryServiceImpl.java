package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.dao.SpCategoryMapper;
import com.example.springboot_shop.entity.SpCategory;
import com.example.springboot_shop.service.SpCategoryService;
import com.example.springboot_shop.utils.TreeUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpCategoryServiceImpl implements SpCategoryService {

    @Resource
    SpCategoryMapper spCategoryMapper;


    @Override
    public List<SpCategory> getCategoryList() {
        List<SpCategory> categoryList = spCategoryMapper.getCategoryList();
        categoryList = TreeUtils.cateListToTree(categoryList);
        return categoryList;
    }

    @Override
    public int addCategory(SpCategory category) {
        return spCategoryMapper.insertSelective(category);
    }

    @Override
    public SpCategory getCategoryByPrimaryKey(int catId) {
        return spCategoryMapper.selectByPrimaryKey(catId);
    }


    @Override
    public int updateCate(SpCategory category) {
        SpCategory cate = spCategoryMapper.selectByPrimaryKey(category.getCatId());
        cate.setCatName(category.getCatName());
        return spCategoryMapper.updateByPrimaryKeySelective(cate);
    }

    @Override
    public int delCate(int catId) {
        return spCategoryMapper.deleteByPrimaryKey(catId);
    }
}
