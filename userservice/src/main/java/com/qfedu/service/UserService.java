package com.qfedu.service;

import com.qfedu.mapper.UserMapper;

import com.qfedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZZzz
 * @version 1.0
 * @className UserService
 * @description TODO
 * @date 2019/8/16 20:30
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User querById(Long id) {

        System.out.println("asd");
        return userMapper.selectByPrimaryKey(id);
    }

}
