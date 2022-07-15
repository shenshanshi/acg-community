package com.nico.acgcommunity.controller;

import com.nico.acgcommunity.mapper.UserMapper;
import com.nico.acgcommunity.pojo.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestContrloler {


    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    public List<TestTable> getUser(){
        System.out.println("-----------------");
        List<TestTable> all = userMapper.findAll();

        return all;
    }

}
