package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
    public void testFunction(){
        System.out.println("这是一个测试方法！");
    }
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
