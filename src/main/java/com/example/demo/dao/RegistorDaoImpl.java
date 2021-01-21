package com.example.demo.dao;

import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistorDaoImpl implements RegistorDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void searchUser(User user) {
        String sql = "insert into t_user values(?,?,?)";
        int update = jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getUserId());
    }
}