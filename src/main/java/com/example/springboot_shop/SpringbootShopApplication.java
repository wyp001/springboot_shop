package com.example.springboot_shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot_shop.dao")
public class SpringbootShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShopApplication.class, args);
    }

}
