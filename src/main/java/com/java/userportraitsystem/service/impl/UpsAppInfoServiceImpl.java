package com.java.userportraitsystem.service.impl;

import com.github.pagehelper.PageHelper;
import com.java.userportraitsystem.entity.UpsAppInfo;
import com.java.userportraitsystem.mapper.UpsAppInfoMapper;
import com.java.userportraitsystem.service.IUpsAppInfoService;
import com.java.userportraitsystem.vo.ups.AppInfoRequest;
import com.java.userportraitsystem.vo.ups.UpsAppinfoRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
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
public class UpsAppInfoServiceImpl implements IUpsAppInfoService {
    @Resource
    private UpsAppInfoMapper upsAppInfoMapper;

    @Override
    public UpsAppInfo getUpsAppInfoById(Integer id) {

        return upsAppInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UpsAppInfo> getUpsAppInfoByIds(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return new ArrayList<>();
        }
        return upsAppInfoMapper.selectByAppkeyIds(ids);
    }

    @Override
    public List<UpsAppInfo> getUpsAppInfoList(AppInfoRequest appInfoRequest) {
        String query = appInfoRequest.getQuery();
        String misId = appInfoRequest.getMisId();
        Integer feedBackStatus = appInfoRequest.getFeedBackStatus();
        Integer feedBackCycleType = appInfoRequest.getFeedBackCycleType();
        Integer pageNo = appInfoRequest.getPageNo();
        Integer pageSize = appInfoRequest.getPageSize();
        PageHelper.startPage(pageNo, pageSize); // 分页
        return upsAppInfoMapper.selectUpsAppInfoList(query, misId, feedBackStatus, feedBackCycleType);

    }

    @Override
    public int createUpsAppkeyApply(UpsAppinfoRequest upsAppinfoRequest) {
        UpsAppInfo upsAppInfo = new UpsAppInfo();
        BeanUtils.copyProperties(upsAppinfoRequest, upsAppInfo);
        List<String> apiAuth = upsAppinfoRequest.getApiAuth();
        List<String> dataAuth = upsAppinfoRequest.getDataAuth();
        if (CollectionUtils.isNotEmpty(apiAuth) && apiAuth.contains("1")) {
            dataAuth.add("163");
        }
        upsAppInfo.setDataAuth(dataAuth.toString());
        upsAppInfo.setBusinessGroup(0);
        log.info(upsAppInfo.toString());
        upsAppInfoMapper.insertUpsAppkeySelective(upsAppInfo);
        return upsAppInfo.getId();
    }
}
