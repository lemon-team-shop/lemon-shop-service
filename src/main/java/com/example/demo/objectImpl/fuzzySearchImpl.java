package com.example.demo.objectImpl;

import com.example.demo.dao.FuzzySearchDao;
import com.example.demo.object.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class fuzzySearchImpl implements FuzzySearchDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> fuzzySearch(String string) {
        String sql = "select * from t_product where productName like ?";
        List<Product> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class), "%" + string + "%");
        System.out.println(list);
         return list;
    }
}
