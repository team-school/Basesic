package com.ssmbase.basesic.config;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultResponse<T> implements Serializable {

    private static final String SUCCESS = "200";

    private static final String FAIL = "999";

    private String code;

    private String message;

     private T data;

     private ResultResponse(String code){
          this.code = code;
     }

     private ResultResponse(String code, String message){
          this.code = code;
          this.message = message;
     }

     private ResultResponse(String code, T data){
          this.code = code;
          this.data = data;
     }

     private ResultResponse(String code, String message, T data){
          this.code = code;
          this.message = message;
          this.data = data;
     }

     @JsonIgnore // json 序列号过滤
     public boolean isSuccess(){
          return this.code.equals(SUCCESS);
     }

     public String getCode(){
          return code;
     }

     public String getMessage(){
          return message;
     }

     public T getData(){
          return data;
     }

     /**
       * 正确的返回类型
       * @param <T>
       * @return
       */


     public static <T> ResultResponse<T> createBySuccess(T data){
          return new ResultResponse<T>(SUCCESS, data);
     }

     public static <T> ResultResponse<T> createByError(String errorCode, String msg){
         return new ResultResponse<T>(errorCode,msg);
     }

         /**
       * 如果结果只有一个值，用此方法
       * @param key
       * @param obj
       * @param <T>
       * @return
       */
    public static <T> ResultResponse<T> createBySuccessKey(String key ,Object obj){
             Map<String,Object> map = new HashMap<String,Object>();
             map.put(key,obj);
             return createBySuccess((T)map);
     }

    public static <T> ResultResponse<T> createBySuccessMap(Map map){
         return createBySuccess((T)map);
    }

}