package com.yang.todolist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yang.todolist.bean.ToDoList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ToDoListMapper extends BaseMapper<ToDoList> {
}
