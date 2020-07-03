package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @ClassName HelloController
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/7/3
 * @Version V1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/hello")
    public String hello(){
      //  System.out.println("dataSource----"+dataSource);
        return "hello springboot ";
    }

}
