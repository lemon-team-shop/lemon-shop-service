package com.example.demo.controller;

import com.example.demo.common.lang.Result;
import com.example.demo.dao.LoginDao;
import com.example.demo.object.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Service
@ResponseBody
@RestController
@Repository
public class LoginController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String Success = "登陆成功";
    @Autowired
    private LoginDao loginDao;
    private Map<String, Object> map;
    private Result reverse;
    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody User user) { //获取接收到的对象
        String sql = "select * from t_user where username=?";
        User userResult = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class), user.getUsername());
        System.out.println(userResult.getPassword().equals(user.getPassword()));
        if (userResult.getPassword().equals(user.getPassword())) {
            reverse = Result.success("200","登录成功", userResult);
        } else {
            reverse = Result.success("200","登录失败", userResult);
        }
        return reverse;
    }
}

