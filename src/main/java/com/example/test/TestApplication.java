package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
    public void testFunction1(){
        System.out.println("这是一个测试方法1！");
    }
    public void testFunction2(){
        System.out.println("这是一个测试方法2！");
    }
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
