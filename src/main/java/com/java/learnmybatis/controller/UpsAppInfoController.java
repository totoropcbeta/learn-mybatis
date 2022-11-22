package com.java.learnmybatis.controller;

import com.java.learnmybatis.entity.UpsAppInfo;
import com.java.learnmybatis.enums.appkey.FeedBackCycleType;
import com.java.learnmybatis.enums.appkey.FeedBackStatus;
import com.java.learnmybatis.service.UpsAppInfoService;
import com.java.learnmybatis.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResultVo getUpsAppInfoById(@PathVariable @ApiParam("appkey的id") Integer id) {
        UpsAppInfo upsAppInfo = upsAppInfoService.getUpsAppInfoById(id);
        return ResultVo.success(upsAppInfo);
    }

    @RequestMapping(value = "/batch-get/info", method = RequestMethod.GET)
    @ApiOperation(value = "通过id批量获取appkey信息")
    public ResultVo batchGetUpsAppInfo(@RequestParam("ids") @ApiParam("appkey的id列表") List<Integer> ids) {
        List<UpsAppInfo> upsApps = upsAppInfoService.getUpsAppInfoByIds(ids);
        if (CollectionUtils.isEmpty(upsApps)) {
            return ResultVo.fail();
        }
        return ResultVo.success(upsApps);
    }

    @RequestMapping(value = "/feed-back-status", method = RequestMethod.GET)
    @ApiOperation(value = "获取appkey反馈状态")
    public ResultVo getFeedBackStatus() {
        ArrayList<Map<String, Object>> feedBackStatus = new ArrayList<>();
        for (FeedBackStatus status : FeedBackStatus.values()) {
            HashMap<String, Object> obj = new HashMap<>();
            obj.put("key", status.getValue());
            obj.put("value", status.getStatus());
            feedBackStatus.add(obj);
        }
        return ResultVo.success(feedBackStatus);
    }

    @RequestMapping(value = "/feed-back-cycle-type", method = RequestMethod.GET)
    @ApiOperation(value = "获取appkey反馈状态")
    public ResultVo getFeedBackCycleType() {
        ArrayList<Map<String, Object>> feedBackCycleType = new ArrayList<>();
        for (FeedBackCycleType type : FeedBackCycleType.values()) {
            HashMap<String, Object> obj = new HashMap<>();
            obj.put("key", type.getValue());
            obj.put("value", type.getType());
            feedBackCycleType.add(obj);
        }
        return ResultVo.success(feedBackCycleType);
    }
}
