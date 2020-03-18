package com.example.springboot_shop.controller;

import com.example.springboot_shop.entity.SpCategory;
import com.example.springboot_shop.service.SpCategoryService;
import com.example.springboot_shop.utils.Response;
import com.example.springboot_shop.utils.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpCategoryController {

    @Autowired
    SpCategoryService spCategoryService;

    @GetMapping("categories")
    public Response getCategoryList(){
        List<SpCategory> categoryList = spCategoryService.getCategoryList();
        return ResultFactory.buildSuccessResult(categoryList,"获取成功");
    }

    @PostMapping("categories")
    public Response addCategory(SpCategory category){
        int i = spCategoryService.addCategory(category);
        return ResultFactory.buildAddSuccessResult(category,"创建成功");
    }

    @GetMapping("categories/{id}")
    public Response getCategoryByCatId(@PathVariable("id") int catId){
        SpCategory category = spCategoryService.getCategoryByPrimaryKey(catId);
        return ResultFactory.buildSuccessResult(category,"获取成功");
    }

    @PutMapping("categories/{id}")
    public Response updateCategory(@PathVariable("id") int catId, String catName){
        SpCategory category = spCategoryService.getCategoryByPrimaryKey(catId);
        category.setCatName(catName);
        spCategoryService.updateCate(category);
        return ResultFactory.buildSuccessResult(category,"更新成功");
    }

    @DeleteMapping("categories/{id}")
    public Response delCate(@PathVariable("id") int catId){
        spCategoryService.delCate(catId);
        return ResultFactory.buildSuccessResult(null,"删除成功");
    }


}
