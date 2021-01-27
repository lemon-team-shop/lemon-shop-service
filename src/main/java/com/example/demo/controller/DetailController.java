package com.example.demo.controller;

import com.example.demo.object.DetailObject;
import com.example.demo.object.Product;
import com.example.demo.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/product")
public class DetailController {
    private DetailObject object;
    @Autowired
    DetailService detailService;

    @PostMapping
    public List<Product> searchDetail(@RequestBody DetailObject object) {
        List<Product> list = detailService.findDetail(object);
        return list;
    }
}
