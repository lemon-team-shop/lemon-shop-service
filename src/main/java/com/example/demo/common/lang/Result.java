package com.example.demo.common.lang;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result implements Serializable {
    private String status;
    private String message;
    private Object data;
    public static Result success(String status, String message, Object data){
        Result r = new Result();
        r.setStatus(status);
        r.setMessage(message);
        r.setData(data);
        System.out.println(r);
        return r;
    }
}
