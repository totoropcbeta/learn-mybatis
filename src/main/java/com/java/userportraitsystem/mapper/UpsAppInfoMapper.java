package com.java.userportraitsystem.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.java.userportraitsystem.entity.UpsAppInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * appkey授权信息 Mapper 接口
 * </p>
 *
 * @author 大脸猫
 * @since 2022-11-25
 */
@Mapper
public interface UpsAppInfoMapper extends BaseMapper<UpsAppInfo> {

    UpsAppInfo selectByPrimaryKey(Integer id);

    List<UpsAppInfo> selectByAppkeyIds(List<Integer> ids);

    List<UpsAppInfo> selectUpsAppInfoList(String query, String misId, Integer feedBackStatus, Integer feedBackCycleType);

    void insertUpsAppkeySelective(UpsAppInfo upsAppInfo); // 返回的是受影响行数
}
