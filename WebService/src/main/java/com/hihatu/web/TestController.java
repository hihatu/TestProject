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

    @RequestMapping("/select")
    public TestBean select(@RequestParam(value = "id", defaultValue = "0") Integer id) {
        return testService.getTestBean(id);
    }

    @RequestMapping("/update")
    public String update(@RequestParam(value = "id") Integer id, @RequestParam(value = "content") String content) {
        if (id == null || content == null) {
            return "failed";
        }
        testService.updateTest(id, content);
        return "success";
    }
}
