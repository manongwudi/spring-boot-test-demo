package com.wudimanong.testdemo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jiangqiao
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ITTestControllerTest {

    @Autowired
    TestController testController;

    @Test
    public void saveTest() {
        testController.saveTest("无敌码农微信公众号");
    }
}
