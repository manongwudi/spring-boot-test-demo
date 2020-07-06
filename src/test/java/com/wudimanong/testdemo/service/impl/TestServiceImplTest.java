package com.wudimanong.testdemo.service.impl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import com.wudimanong.testdemo.dao.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jiangqiao
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestServiceImpl.class)
@ActiveProfiles("test")
public class TestServiceImplTest {

    @Autowired
    TestServiceImpl testServiceImpl;

    @MockBean
    TestDao testDao;

    @Test
    public void saveTest() {
        //调用测试方法
        testServiceImpl.saveTest("无敌码农微信公众号");
        //验证执行测试的逻辑中是否调用过addUser方法
        verify(testDao).addUser(any());
    }
}
