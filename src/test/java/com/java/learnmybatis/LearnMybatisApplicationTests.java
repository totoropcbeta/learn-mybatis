package com.java.learnmybatis;

import com.java.learnmybatis.entity.UpsAppInfo;
import com.java.learnmybatis.mapper.UpsAppInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LearnMybatisApplicationTests {
    @Autowired
    private UpsAppInfoMapper upsAppInfoMapper;

    @Test
    public void testMyBatis() {
        UpsAppInfo upsAppInfo = upsAppInfoMapper.selectByPrimaryKey(1);
        System.out.println(upsAppInfo);
    }

}
