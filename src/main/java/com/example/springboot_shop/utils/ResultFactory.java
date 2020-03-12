package com.example.springboot_shop.utils;

/**
 * @Author: wxySmile
 * @Date 20-1-2 上午11:58
 */
public class ResultFactory {

    public static Response buildSuccessResult(Object data,String message) {
        return buildResult(data,message,StatusCode.SUCCESS.code);
    }

    public static Response buildFailResult(String message) {
        return buildResult(null,message,StatusCode.FAIL.code);
    }

    public static Response buildResult(Object data, String message,Integer resultCode) {
        return new Response(data, message, resultCode);
    }

}
