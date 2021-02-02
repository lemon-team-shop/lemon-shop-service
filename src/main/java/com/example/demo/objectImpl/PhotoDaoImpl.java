package com.example.demo.objectImpl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.example.demo.dao.PhotoDao;
import com.example.demo.util.ConstUtil;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Repository
public class PhotoDaoImpl implements PhotoDao {
    @Override
    public String uploadPhoto(MultipartFile file) throws Exception{
        String endpoint = ConstUtil.END_POINT;
        String accessKeyId = ConstUtil.ACCESS_KEY_ID;
        String accessKeySecret = ConstUtil.ACCESS_KEY_SECRET;
        String bucketName = ConstUtil.BUCKET_NAME;
        OSS ossClient = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
        InputStream inputStream = file.getInputStream();
        ossClient.putObject(bucketName,file.getOriginalFilename(),inputStream);
        ossClient.shutdown();
        String url = "http://" + bucketName + "." + endpoint + "/" + file.getOriginalFilename();
        return url;
    }
}
