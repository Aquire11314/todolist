package com.yang.todolist.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ToDoListContollerTest {

    @Test
    public void findAll() {
        System.out.println(123);
    }

    @Test
    public void insertOrUpdate() {
        findAll();
        findAll();
    }
}