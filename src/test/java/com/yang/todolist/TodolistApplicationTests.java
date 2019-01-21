package com.yang.todolist;

import com.yang.todolist.mapper.ToDoListMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodolistApplicationTests {
    @Autowired
    private ToDoListMapper toDoListMapper;
    @Test
    public void contextLoads() {
        System.out.println(toDoListMapper.selectList(null));
    }

}

