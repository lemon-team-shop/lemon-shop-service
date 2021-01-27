package com.example.demo.service;

import com.example.demo.dao.SearchDao;
import com.example.demo.object.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    @Autowired
    private SearchDao searchDao;
    public List searchProductList() {
        List list = searchDao.searchProduct();
        return list;
    }
}
