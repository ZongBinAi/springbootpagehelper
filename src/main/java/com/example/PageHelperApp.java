package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: n
 * @Date: 2018/11/7 21:30
 * @Description:
 */
@MapperScan("com.example.mapper")
@SpringBootApplication
public class PageHelperApp {
    public static void main(String[] args) {
        SpringApplication.run(PageHelperApp.class, args);
    }
}
