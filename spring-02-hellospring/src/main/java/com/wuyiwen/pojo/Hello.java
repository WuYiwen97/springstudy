package com.wuyiwen.pojo;

public class Hello {

    public  Hello(String name){
        this.name =name;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("hellp"+ name);
    }
}
