package com.java.userportraitsystem;

import com.java.userportraitsystem.entity.UpsAppInfo;
import com.java.userportraitsystem.mapper.UpsAppInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserPortraitSystemApplicationTests {
    @Autowired
    private UpsAppInfoMapper upsAppInfoMapper;

    @Test
    public void testMyBatis() {
        UpsAppInfo upsAppInfo = upsAppInfoMapper.selectByPrimaryKey(1);
        System.out.println(upsAppInfo);
    }

    @Test
    public void testMyBatis_01() {
        List<UpsAppInfo> upsAppInfos = upsAppInfoMapper.selectUpsAppInfoList("画像", "yinlikui", null, null);
        System.out.println(upsAppInfos);
    }


}
