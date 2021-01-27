package com.example.demo.service;

import com.example.demo.dao.VideoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoService {
    @Autowired
    VideoDao videoDao;
    public String uploadVideo(MultipartFile file) {
        String string= videoDao.uploadVideo(file);
        return string;
    }
}
