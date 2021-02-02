package com.example.demo.controller;

import com.example.demo.common.lang.Result;
import com.example.demo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value="/upload")
public class PhotoUploadController {
    @Autowired
    PhotoService photoService;
    @PostMapping
    public Result uploadPhoto(MultipartFile file){
        String url = photoService.uploadPhoto(file);
        Result result = Result.success("200","success", url);
        return result;
    }
}
