package com.example.demo.dao;

import org.springframework.web.multipart.MultipartFile;

public interface PhotoDao {
    public String uploadPhoto(MultipartFile file) throws Exception;
}
