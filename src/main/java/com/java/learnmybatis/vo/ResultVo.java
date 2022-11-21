package com.java.learnmybatis.vo;

import com.java.learnmybatis.enums.ResultCode;
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
    private Integer code;
    private String message;
    private Object data;

    public static ResultVo success(Object data) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(ResultCode.SUCCSS.getCode());
        resultVo.setMessage(ResultCode.SUCCSS.getMessage());
        resultVo.setData(data);
        return resultVo;
    }
}
