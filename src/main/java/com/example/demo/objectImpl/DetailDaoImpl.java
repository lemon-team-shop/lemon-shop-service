package com.example.demo.objectImpl;

import com.example.demo.dao.DetailDao;
import com.example.demo.object.DetailObject;
import com.example.demo.object.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DetailDaoImpl implements DetailDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Product> searchList(DetailObject object) {
        String sql = "select * from t_product where productCode=?";
        List<Product> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class),object.getProductCode());
        return list;
    }
}
