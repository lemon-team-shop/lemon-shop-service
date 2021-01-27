package com.example.demo.objectImpl;

import com.example.demo.dao.SearchDao;
import com.example.demo.object.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 * 实现类中写具体的查找方法。
 */
import java.util.List;
@Repository
public class SearchImpl implements SearchDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List searchProduct() {
        String sql = "select * from t_product";
        List list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class));
        System.out.println(list);
        return list;
    }
}
