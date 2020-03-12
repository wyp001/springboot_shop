package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.dao.SpUserDao;
import com.example.springboot_shop.entity.SpUser;
import com.example.springboot_shop.service.SpUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SpUserServiceImpl implements SpUserService {

    @Resource
    SpUserDao spUserDao;

    @Override
    public List<SpUser> getUserList() {
        return spUserDao.getUserList();
    }

    @Override
    public PageInfo<SpUser> queryPage(String username, int pagenum, int pagesize) {
        List<SpUser> users = spUserDao.getUserListByQuery(username);
        PageHelper.offsetPage((pagenum -1)* pagesize,pagesize);
        return new PageInfo<>(users);
    }

}
