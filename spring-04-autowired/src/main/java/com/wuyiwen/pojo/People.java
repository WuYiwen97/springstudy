package com.wuyiwen.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class People {
    @Resource
    private Cat cat;
    @Resource
    private Dog dog;
    private String str;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", str='" + str + '\'' +
                '}';
    }
}
