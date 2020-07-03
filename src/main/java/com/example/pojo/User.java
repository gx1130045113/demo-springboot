package com.example.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @ClassName User
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/7/3
 * @Version V1.0
 **/
@Data
@Slf4j
public class User {
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String note;
    private Date  created;
    private Date  updated;

}
