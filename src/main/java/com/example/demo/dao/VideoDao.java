package com.example.demo.dao;

import org.springframework.web.multipart.MultipartFile;

public interface VideoDao {
    public String uploadVideo(MultipartFile file);
}
