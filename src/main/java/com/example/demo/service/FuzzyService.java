package com.example.demo.service;

import com.example.demo.dao.FuzzySearchDao;
import com.example.demo.object.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuzzyService {
    @Autowired
    FuzzySearchDao fuzzySearchDao;
    public List<Product> searchPro(String string) {
        List<Product> list = fuzzySearchDao.fuzzySearch(string);
        return list;
    }
}
