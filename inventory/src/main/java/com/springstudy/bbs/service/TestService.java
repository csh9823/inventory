package com.springstudy.bbs.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstudy.bbs.mapper.TestUserMapper;

@Service
public class TestService {
	
    @Autowired
    private TestUserMapper userMapper;

    public List<HashMap<String, Object>> getAllUsers() {
        return userMapper.findAllUsers();
    }   
}
