package com.yang.todolist.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yang.todolist.bean.ToDoList;
import com.yang.todolist.dto.Result;
import com.yang.todolist.service.ToDoListService;
import com.yang.todolist.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ToDoListContoller {
    @Autowired
    private ToDoListService toDoListService;
    @RequestMapping("findall")
    public Result findAll(){
        return ResultUtil.success(toDoListService.list(new QueryWrapper<ToDoList>().orderByDesc("id")));
    }
    @RequestMapping("insertorupdate")
    public Result insertOrUpdate(@Valid ToDoList toDoLis, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.fail(bindingResult.getFieldError().getDefaultMessage());
        }else{
            toDoListService.saveOrUpdate(toDoLis);
            return ResultUtil.success(toDoLis);
        }
    }

}
