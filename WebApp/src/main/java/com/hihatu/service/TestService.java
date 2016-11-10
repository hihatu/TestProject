package com.hihatu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hihatu.domain.TestBean;
import com.hihatu.mapper.TestMapper;

@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public TestBean getTestBean(int id) {
        TestBean bean = this.testMapper.selectById(id);
        if (bean == null) {
            bean = new TestBean(0, "Hello, World!");
        }
        return bean;
    }

    public void updateTest(int id, String content) {
        this.testMapper.update(id, content);
    }
}
