package com.example.demo.objectImpl;

import com.example.demo.dao.VideoDao;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Repository
public class VideoDaoImpl implements VideoDao {
    @Override
    public String uploadVideo(MultipartFile file) {

        try {
            InputStream inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = "";
        return string;
    }
}
