package com.example.test.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void daoTest() {
        studentDao.selectList(null);
    }
}