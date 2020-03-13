package com.example.springboot_shop.service;

import com.example.springboot_shop.entity.SpManager;

public interface SpManagerService {

    int addManager(SpManager manager);

    int updateManager(SpManager manager);

    SpManager getManagerById(int id);

    int deleteManagerById(int id);


}
