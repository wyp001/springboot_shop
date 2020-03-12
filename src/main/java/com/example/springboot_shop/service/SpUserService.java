package com.example.springboot_shop.service;

import com.example.springboot_shop.entity.SpUser;
import com.example.springboot_shop.utils.PageUtils;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * 会员表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-03-11 17:21:21
 */
public interface SpUserService {

    PageInfo<SpUser> queryPage(String params,int pagenum, int pagesize );

    List<SpUser> getUserList();


}

