package com.yang.todolist.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class ToDoListContollerTest {

    @Autowired
    private MockMvc mvc;


    @Test
    public void findAll() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/findall"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void insertOrUpdate() {
    }
}