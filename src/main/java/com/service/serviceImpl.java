package com.service;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpl implements Userservice{
    @Autowired
    UserDao userDao;
    @Override
    public List<User> selectLists() {
        return userDao.gets();
    }
}
