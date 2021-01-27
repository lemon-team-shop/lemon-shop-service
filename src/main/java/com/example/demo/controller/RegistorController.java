package com.example.demo.controller;

import com.example.demo.dao.RegistorDao;
import com.example.demo.object.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
