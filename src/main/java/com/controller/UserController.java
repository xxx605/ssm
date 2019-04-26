package com.controller;

import com.pojo.User;
import com.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    Userservice userservice;
    @RequestMapping("/")
    public List<User> add(){
        return userservice.selectLists();
    }
}
