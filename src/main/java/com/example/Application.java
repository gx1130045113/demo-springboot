package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/7/3
 * @Version V1.0
 **/
@SpringBootApplication
@MapperScan("com.example.mapper")
public class Application {
    public static void main(String[] args) {
            SpringApplication.run(Application.class,args);
    }
}
