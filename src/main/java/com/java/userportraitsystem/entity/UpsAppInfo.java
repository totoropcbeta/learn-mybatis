package com.java.userportraitsystem.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UpsAppInfo {
    private Integer id;

    private String appkey;

    private String desc;

    private Boolean location;

    private Integer businessGroup;

    private Integer peakQps;

    private String dataAuth;

    private String creator;

    private String modifier;

    private Date addtime;

    private Date modtime;

    private String owner;

    private Boolean online;

    private Boolean visitAllLabel;

    private Integer bu;

    private String appName;

    private String appDesc;

    private String appAttr;

    private String bgbu;

    private Integer feedbackCycleType;

    private Date feedbackDate;

    private Integer feedbackStatus;

    private String admin;

    private Boolean internal;

    private String authBiz;
}
