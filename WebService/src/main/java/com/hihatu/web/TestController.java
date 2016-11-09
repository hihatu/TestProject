package com.hihatu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hihatu.domain.TestBean;
import com.hihatu.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public TestBean helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
        return testService.getTestBean(name);
    }
}
