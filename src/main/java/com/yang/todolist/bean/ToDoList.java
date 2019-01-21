package com.yang.todolist.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@TableName("todo")
public class ToDoList {
    @TableId(type = IdType.AUTO)
    private long id;
    @NotNull(message = "item字段不能为空")
    private String item;
}
