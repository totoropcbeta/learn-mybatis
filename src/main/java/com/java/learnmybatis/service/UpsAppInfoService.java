package com.java.learnmybatis.service;

import com.github.pagehelper.PageHelper;
import com.java.learnmybatis.entity.UpsAppInfo;
import com.java.learnmybatis.mapper.UpsAppInfoMapper;
import com.java.learnmybatis.vo.ups.AppInfoRequest;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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

    public List<UpsAppInfo> getUpsAppInfoList(AppInfoRequest appInfoRequest) {
        String query = appInfoRequest.getQuery();
        String misId = appInfoRequest.getMisId();
        Integer feedBackStatus = appInfoRequest.getFeedBackStatus();
        Integer feedBackCycleType = appInfoRequest.getFeedBackCycleType();
        Integer pageNo = appInfoRequest.getPageNo();
        Integer pageSize = appInfoRequest.getPageSize();
        PageHelper.startPage(pageNo, pageSize);
        return upsAppInfoMapper.selectUpsAppInfoList(query, misId, feedBackStatus, feedBackCycleType);

    }
}
