package com.example.demo.service;

import com.example.demo.dao.DetailDao;
import com.example.demo.object.DetailObject;
import com.example.demo.object.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {
    @Autowired
    DetailDao detailDao;
    public List<Product> findDetail(DetailObject object) {
        List<Product> list = detailDao.searchList(object);
        return list;
    }
}
