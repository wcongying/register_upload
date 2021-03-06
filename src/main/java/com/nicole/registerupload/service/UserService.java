package com.nicole.registerupload.service;


import com.nicole.registerupload.entity.User;
import com.nicole.registerupload.util.ImgException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    long insertUser(User user);

    /**
     * 通过用户名，手机号或者email查询
     * @param username
     * @return
     */
    User selectUserName(String username);

    /**
     * 上传图片
     * @param
     * @return
     */
    String uploadImage(MultipartFile file, String username) throws IOException, ImgException;
}

