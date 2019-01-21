package com.yang.todolist.util;

import com.yang.todolist.dto.Result;

public class ResultUtil {
    public static  Result success(Object obj){
        return new Result(true,"执行成功！",obj);
    }
    public static Result fail(String msg){
        return new Result(false,msg,null);
    }
}
