package com.java.userportraitsystem.vo;

import com.java.userportraitsystem.enums.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yuanhang08
 * @date 2022年11月21日
 */
@Data
@NoArgsConstructor
public class ResultVo implements Serializable {
    private Integer status;
    private String message;
    private Object data;

    public static ResultVo success(Object data) {
        ResultVo resultVo = new ResultVo();
        resultVo.setStatus(ResultCode.SUCCSS.getStatus());
        resultVo.setMessage(ResultCode.SUCCSS.getMessage());
        resultVo.setData(data);
        return resultVo;
    }

    public static ResultVo fail() {
        ResultVo resultVo = new ResultVo();
        resultVo.setStatus(ResultCode.FAIL.getStatus());
        resultVo.setMessage(ResultCode.FAIL.getMessage());
        return resultVo;
    }
}
