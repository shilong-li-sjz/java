package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.service.TestService;

@Controller
@RequestMapping("")
public class TestReqController {
    
    @Autowired
    TestService testService;
    
    @RequestMapping("req")
    @ResponseBody
    public String defaultReq() {
        testService.testConn();
        return "thanks for req";
    }
}
