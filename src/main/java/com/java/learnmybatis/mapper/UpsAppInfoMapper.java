package com.java.learnmybatis.mapper;

import com.java.learnmybatis.entity.UpsAppInfo;
import com.java.learnmybatis.entity.UpsAppInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UpsAppInfoMapper {
    long countByExample(UpsAppInfoExample example);

    int deleteByExample(UpsAppInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpsAppInfo record);

    int insertSelective(UpsAppInfo record);

    List<UpsAppInfo> selectByExample(UpsAppInfoExample example);

    UpsAppInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpsAppInfo record, @Param("example") UpsAppInfoExample example);

    int updateByExample(@Param("record") UpsAppInfo record, @Param("example") UpsAppInfoExample example);

    int updateByPrimaryKeySelective(UpsAppInfo record);

    int updateByPrimaryKey(UpsAppInfo record);
}