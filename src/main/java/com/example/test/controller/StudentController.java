package com.example.test.controller;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.test.dao.StudentDao;
import com.example.test.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/StudentController")
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    @RequestMapping(value = "findAll", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    public String findAll() {
        List<Student> students = studentDao.selectList(null);
        return JSON.toJSONString(students);
    }
}
