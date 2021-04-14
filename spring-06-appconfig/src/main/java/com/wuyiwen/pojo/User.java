package com.wuyiwen.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class User {


    @Value("ddaf")
    public String name;

    @Value("cao")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
