package com.yang.todolist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.todolist.bean.ToDoList;
import com.yang.todolist.mapper.ToDoListMapper;
import com.yang.todolist.service.ToDoListService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ToDoListServiceImpl extends ServiceImpl<ToDoListMapper, ToDoList> implements ToDoListService {
}
