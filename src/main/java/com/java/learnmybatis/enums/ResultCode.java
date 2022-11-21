package com.java.learnmybatis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultCode {
    SUCCSS(1, "成功"),
    FAIL(0, "失败");

    private Integer status;

    private String message;
}
