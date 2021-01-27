package com.example.demo.dao;

import com.example.demo.object.Product;

import java.util.List;

public interface FuzzySearchDao {
    public List<Product> fuzzySearch(String string);
}
