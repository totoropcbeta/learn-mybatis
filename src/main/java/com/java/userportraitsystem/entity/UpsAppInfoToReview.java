package com.java.userportraitsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * appkey申请审批信息
 * </p>
 *
 * @author 大脸猫
 * @since 2022-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UpsAppInfoToReview对象", description = "appkey申请审批信息")
public class UpsAppInfoToReview implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "primary key")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "提交的app的id,用于判断新建or更新,-1表示新建")
    private Integer appId;

    @ApiModelProperty(value = "应用的appkey,与octo的appkey一致")
    private String appkey;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "服务地点, 0:北京, 1:上海")
    private Boolean location;

    @ApiModelProperty(value = "事业群, 0:平台, 1:餐饮, 2:到综, 3:外卖, 4:酒旅, 5:猫眼, 6:广告, 7:其他")
    private Integer businessGroup;

    @ApiModelProperty(value = "qps调用峰值")
    private Integer peakQps;

    @ApiModelProperty(value = "有权限的标签列表")
    private String dataAuth;

    @ApiModelProperty(value = "创建人misid")
    private String creator;

    @ApiModelProperty(value = "修改人misid")
    private String modifier;

    @ApiModelProperty(value = "负责人misid")
    private String owner;

    private Date modtime;

    @ApiModelProperty(value = "是否在线, 0:不在线, 1:在线")
    private Boolean online;

    @ApiModelProperty(value = "状态, 0:待review, 1:已review, -1:被驳回, -2:取消")
    private Boolean status;

    @ApiModelProperty(value = "bu")
    private Integer bu;

    @ApiModelProperty(value = "应用中文名")
    private String appName;

    @ApiModelProperty(value = "应用描述")
    private String appDesc;

    @ApiModelProperty(value = "bgbu名称")
    private String bgbu;

    @ApiModelProperty(value = "0-每周，1-每双周，2-每月，3-没季度")
    private Integer feedbackCycleType;

    @ApiModelProperty(value = "待反馈日期")
    private Date feedbackDate;

    @ApiModelProperty(value = "appkey对应的系统属性")
    private String appAttr;

    @ApiModelProperty(value = "appkey负责人")
    private String admin;

    @ApiModelProperty(value = "将军令审批流id")
    private Long authFlowId;

    @ApiModelProperty(value = "将军令审批开始时间")
    private Date authFlowStartTime;

    @ApiModelProperty(value = "将军令审批结束时间")
    private Date authFlowEndTime;

    @ApiModelProperty(value = "j项目标签列表，用逗号分隔")
    private String jProjectLabelIds;


}
