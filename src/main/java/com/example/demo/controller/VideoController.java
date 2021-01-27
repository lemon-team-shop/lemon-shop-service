package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.example.demo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.tags.EditorAwareTag;

@RestController
@RequestMapping
public class VideoController {
    @Autowired
    VideoService videoService;
    @PostMapping()
    public void uploadVideo(MultipartFile file) {
        String string = videoService.uploadVideo(file);

    }
}
