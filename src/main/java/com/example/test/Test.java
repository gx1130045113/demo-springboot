package com.example.test;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/8/5
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        String timestamp=new Date().getTime()+"";
        String randomNumber = RandomStringUtils.randomNumeric(8);
        String roomString=timestamp+randomNumber;

    }
}
