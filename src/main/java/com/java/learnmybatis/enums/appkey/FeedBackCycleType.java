package com.java.learnmybatis.enums.appkey;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FeedBackCycleType {
    WEEK(0, "每周"),
    BIWEEKLY(1, "每双周"),
    MONTH(2, "每月"),
    QUARTER(3, "每季度");
    private final Integer value;
    private final String type;

}
