package com.yang.todolist.handle;

import com.yang.todolist.dto.Result;
import com.yang.todolist.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private Logger logger= LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        logger.info("【系统错误】={}",e);
        return ResultUtil.fail("出错");
    }
}
