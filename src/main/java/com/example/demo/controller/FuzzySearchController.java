package com.example.demo.controller;

import com.example.demo.object.Product;
import com.example.demo.service.FuzzyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // ResponseBody 与 Controller
@RequestMapping(value="/fuzzySearch")
public class FuzzySearchController {
    @Autowired
    FuzzyService fuzzyService;
    @PostMapping
    public List<Product> fuzzySearch( @RequestBody Product product) {
        System.out.println(product);
        String string = product.getProductName();
        List<Product> list = fuzzyService.searchPro(string);
        return list;
    }
}
