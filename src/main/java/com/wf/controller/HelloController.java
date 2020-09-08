package com.wf.controller;


import com.wf.pojo.User;
import com.wf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @Value("${feifei.url}")
    private String url;

    @Autowired
    private UserService userService;

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id) {
        return userService.quryById(id);
    }
    @GetMapping("hello")
    public String hello(){
        System.out.println(url);
        System.out.println("DataSorce = " + dataSource);
        return "Hello Spring boot!";
    }
}
