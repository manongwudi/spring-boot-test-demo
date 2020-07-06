package com.wudimanong.testdemo.controller;

import com.wudimanong.testdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangqiao
 */
@RestController
@RequestMapping("/demo")
public class TestController {

    @Autowired
    TestService testServiceImpl;

    @PostMapping("/saveTest")
    public String saveTest(@RequestParam("name") String name) {
        return testServiceImpl.saveTest(name);
    }
}
