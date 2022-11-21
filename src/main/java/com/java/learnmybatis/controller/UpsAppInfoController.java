package com.java.learnmybatis.controller;

import com.java.learnmybatis.entity.UpsAppInfo;
import com.java.learnmybatis.service.UpsAppInfoService;
import com.java.learnmybatis.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuanhang08
 * @date 2022年11月21日
 */
@RestController
@RequestMapping("/ups/app")
@Api(tags = "UPSAppKey管理")
public class UpsAppInfoController {
    @Resource
    private UpsAppInfoService upsAppInfoService;

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "通过id获取appkey信息")
    public ResultVo getUpsAppInfoById(@PathVariable Integer id) {
        UpsAppInfo upsAppInfo = upsAppInfoService.getUpsAppInfoById(id);
        return ResultVo.success(upsAppInfo);
    }
}
