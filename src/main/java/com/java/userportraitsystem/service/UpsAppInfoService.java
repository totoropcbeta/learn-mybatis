package com.java.userportraitsystem.service;

import com.java.userportraitsystem.entity.UpsAppInfo;
import com.java.userportraitsystem.vo.ups.AppInfoRequest;
import com.java.userportraitsystem.vo.ups.UpsAppinfoRequest;

import java.util.List;

/**
 * @author yuanhang08
 * @date 2022年11月24日
 */
public interface UpsAppInfoService {
    UpsAppInfo getUpsAppInfoById(Integer id);

    List<UpsAppInfo> getUpsAppInfoByIds(List<Integer> ids);

    List<UpsAppInfo> getUpsAppInfoList(AppInfoRequest appInfoRequest);

    List<UpsAppInfo> getAllUpsAppInfo(AppInfoRequest appInfoRequest);

    int createUpsAppkeyApply(UpsAppinfoRequest upsAppinfoRequest);

}
