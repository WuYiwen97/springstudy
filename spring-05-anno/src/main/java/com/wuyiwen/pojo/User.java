package com.wuyiwen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于 注册了在xml中注册了bean
@Component
public class User {


    //等价于 property 属性
    @Value("cao")
    public String name = "woyw";
}
