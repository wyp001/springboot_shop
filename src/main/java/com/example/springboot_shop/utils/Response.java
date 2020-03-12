package com.example.springboot_shop.utils;

import java.util.HashMap;

public class Response {

    private Object data;
    private HashMap<String,Object> meta = new HashMap<>();

    public Response(Object data, String msg, Integer status) {
        meta.put("msg",msg);
        meta.put("status",status);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public HashMap<String, Object> getMeta() {
        return meta;
    }

    public void setMeta(HashMap<String, Object> meta) {
        this.meta = meta;
    }
}
