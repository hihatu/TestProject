package com.hihatu.domain;

import java.io.Serializable;

public class TestBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String content;

    public TestBean(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
