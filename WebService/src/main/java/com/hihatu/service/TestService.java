package com.hihatu.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

import com.hihatu.domain.TestBean;

@Component
public class TestService {

    private final AtomicInteger counter = new AtomicInteger();

    public TestBean getTestBean(String content){
        TestBean bean = new TestBean(counter.incrementAndGet(), String.format("Hello, %s!", content));
        return bean;
    }
}
