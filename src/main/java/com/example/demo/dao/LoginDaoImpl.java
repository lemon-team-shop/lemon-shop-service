package com.example.demo.dao;

import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public User loginUser(User user) {
//        String sql = "select count() from t_user";
//        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(user.getUsername());
        String sql = "select * from t_user where username=?";

        User userResult = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class), user.getUsername());
        System.out.println(userResult.toString());
        return userResult;
    }
}
