package org.nofat.manage.common;

import lombok.Data;

import java.io.Serializable;

/**
 * R 请求结果类
 *
 * @author liyutao
 * @version 2023/10/27 14:18
 **/
@Data
public class R<T> implements Serializable {
    private Integer code;
    private String message;
    private T content;
    private R(){

    }
    private R(Integer code,String message,T content){
        this.code = code;
        this.message = message;
        this.content = content;
    }
    private R(Integer code,String message){
        this.code = code;
        this.message = message;
        this.content = null;
    }
    public static <T> R<T> ok(T content){
        return new R<>(Constants.successCode, Constants.successMessage, content);
    }
    public static <T> R<T> ok(){
        return new R<>(Constants.successCode, Constants.successMessage);
    }
    public static <T> R<T> error(){
        return new R<>(Constants.errorCode,Constants.errorMessage);
    }
    public static <T> R<T> error(String message){
        return new R<>(Constants.errorCode,message);
    }
}
