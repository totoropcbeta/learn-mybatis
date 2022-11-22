package com.java.learnmybatis.vo.ups;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @author yuanhang08
 * @date 2022年11月22日
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true) // 前端传过来的字段多了或少了不会异常
@ApiModel(value = "appkey查询参数")
public class AppInfoRequest {
    @ApiModelProperty(value = "页码")
    @Min(value = 1, message = "页码必须大于等于1")
    private Integer pageNo;
    @ApiModelProperty(value = "每页数量")
    @Min(value = 1, message = "每页数量必须大于等于1")
    private Integer pageSize;
    @ApiModelProperty(value = "查询者")
    private String misId;
    @ApiModelProperty(value = "搜索词")
    private String query;
    @ApiModelProperty(value = "反馈状态")
    private Integer feedBackStatus;
    @ApiModelProperty(value = "反馈周期")
    private Integer feedBackCycleType;
}
