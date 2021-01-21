package com.example.demo.controller;

import com.example.demo.dao.RegistorDao;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

@RestController
public class RegistorController {
    @Autowired
    private RegistorDao registorDao;
    @PostMapping("/registor")
    @ResponseBody
    public User registor(@RequestBody User user) {
        registorDao.searchUser(user);
        return null;
    }
}
