package com.example.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends BaseMapper<Student> {

}
