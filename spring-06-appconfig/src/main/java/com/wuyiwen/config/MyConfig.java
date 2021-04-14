package com.wuyiwen.config;


import com.wuyiwen.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wuyiwen.pojo")
public class MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
