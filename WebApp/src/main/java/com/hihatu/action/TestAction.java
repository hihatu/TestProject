package com.hihatu.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hihatu.domain.TestBean;
import com.hihatu.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

@Component
public class TestAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(TestAction.class);

    @Autowired
    private TestService testService;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public List<TestBean> getTestBeans() {
        logger.info("getTestBeans");
        return testService.getTestBeanList();
    }
}
