package com.example.demo.controller;

import com.example.demo.common.lang.Result;
import com.example.demo.dao.SearchDao;
import com.example.demo.object.Product;
import com.example.demo.objectImpl.SearchImpl;
import com.example.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller中注入Service
 * Service中注入mapper
 */
@RestController //把对象交给Spring管理,并返回json数据
@RequestMapping(value="/search")
public class SearchController {
    @Autowired
    private SearchService searchService;
    @PostMapping
    public Result searchList (@RequestBody Object acceptName) {

        System.out.println(acceptName);
        List list = searchService.searchProductList();
        Result result = Result.success("200", "success", list);
        return result;
    }
}
