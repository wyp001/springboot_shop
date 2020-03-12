package com.example.springboot_shop.dao;

import com.example.springboot_shop.entity.SpUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 会员表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-03-11 17:21:21
 */
//@Mapper
public interface SpUserDao  {

    List<SpUser> getUserList();

    List<SpUser> getUserListByQuery(String username);


}
