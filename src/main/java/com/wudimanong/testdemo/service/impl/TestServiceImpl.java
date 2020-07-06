package com.wudimanong.testdemo.service.impl;

import com.wudimanong.testdemo.dao.TestDao;
import com.wudimanong.testdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangqiao
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao testDao;

    @Override
    public String saveTest(String name) {
        testDao.addUser(name);
        return "success";
    }
}
