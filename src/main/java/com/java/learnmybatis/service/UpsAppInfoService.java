package com.java.learnmybatis.service;

import com.java.learnmybatis.entity.UpsAppInfo;
import com.java.learnmybatis.mapper.UpsAppInfoMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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

    public List<UpsAppInfo> getUpsAppInfoByIds(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return new ArrayList<>();
        }
        return upsAppInfoMapper.selectByAppkeyIds(ids);
    }
}
