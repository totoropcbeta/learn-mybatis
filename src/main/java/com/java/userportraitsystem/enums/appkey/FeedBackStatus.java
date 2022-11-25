package com.java.userportraitsystem.enums.appkey;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FeedBackStatus {
    UNFINISHED(0, "未反馈"),
    FINISHED(1, "已反馈");
    private final Integer value;
    private final String status;
}
