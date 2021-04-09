package com.wuyiwen.service;

import com.wuyiwen.dao.UserDao;
import com.wuyiwen.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void getUser(){
        userDao.getUser();
    }
}
