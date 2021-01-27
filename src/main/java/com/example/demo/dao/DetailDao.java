package com.example.demo.dao;

import com.example.demo.object.DetailObject;
import com.example.demo.object.Product;

import java.util.List;

public interface DetailDao {
    public List<Product> searchList(DetailObject object);
}
