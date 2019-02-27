package com.hemming.web.controller;

import com.hemming.web.PO.UserPO;
import com.hemming.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping
    public @ResponseBody
    UserPO addUser(@RequestParam String name, @RequestParam String password) {
        UserPO userPO = new UserPO();
        userPO.setName(name);
        userPO.setPassword(password);
        Long aLong = userMapper.create(userPO);
        return userPO;
    }

    @GetMapping
    public @ResponseBody
    String ping(@RequestParam String value) {
        return value;
    }

}
