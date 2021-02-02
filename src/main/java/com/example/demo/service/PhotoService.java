package com.example.demo.service;

import com.example.demo.dao.PhotoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class PhotoService {
    @Autowired
    PhotoDao photoDao;
    public String uploadPhoto(MultipartFile file) {
        String url = null;
        try {
            url = photoDao.uploadPhoto(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }
}
