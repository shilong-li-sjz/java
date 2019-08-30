package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.TestDao;

@Service
public class TestService {

    @Autowired
    TestDao testDao;
    
    public void testConn() {
        testDao.testConn();
    }

}
