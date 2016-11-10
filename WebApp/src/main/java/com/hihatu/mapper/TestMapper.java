package com.hihatu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hihatu.domain.TestBean;

@Mapper
public interface TestMapper {

    TestBean selectById(int id);

    void update(@Param("id") int id, @Param("content") String content);

}
