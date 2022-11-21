package com.java.learnmybatis.service;

import com.java.learnmybatis.entity.UpsAppInfo;
import com.java.learnmybatis.mapper.UpsAppInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yuanhang08
 * @date 2022年11月21日
 */
@Service
public class UpsAppInfoService {
    @Resource
    private UpsAppInfoMapper upsAppInfoMapper;

    public UpsAppInfo getUpsAppInfoById(Integer id) {

        return upsAppInfoMapper.selectByPrimaryKey(id);
    }
}
