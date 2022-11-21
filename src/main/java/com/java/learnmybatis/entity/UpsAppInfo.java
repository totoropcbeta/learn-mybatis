package com.java.learnmybatis.entity;

import java.util.Date;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey == null ? null : appkey.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Boolean getLocation() {
        return location;
    }

    public void setLocation(Boolean location) {
        this.location = location;
    }

    public Integer getBusinessGroup() {
        return businessGroup;
    }

    public void setBusinessGroup(Integer businessGroup) {
        this.businessGroup = businessGroup;
    }

    public Integer getPeakQps() {
        return peakQps;
    }

    public void setPeakQps(Integer peakQps) {
        this.peakQps = peakQps;
    }

    public String getDataAuth() {
        return dataAuth;
    }

    public void setDataAuth(String dataAuth) {
        this.dataAuth = dataAuth == null ? null : dataAuth.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getModtime() {
        return modtime;
    }

    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Boolean getVisitAllLabel() {
        return visitAllLabel;
    }

    public void setVisitAllLabel(Boolean visitAllLabel) {
        this.visitAllLabel = visitAllLabel;
    }

    public Integer getBu() {
        return bu;
    }

    public void setBu(Integer bu) {
        this.bu = bu;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc == null ? null : appDesc.trim();
    }

    public String getAppAttr() {
        return appAttr;
    }

    public void setAppAttr(String appAttr) {
        this.appAttr = appAttr == null ? null : appAttr.trim();
    }

    public String getBgbu() {
        return bgbu;
    }

    public void setBgbu(String bgbu) {
        this.bgbu = bgbu == null ? null : bgbu.trim();
    }

    public Integer getFeedbackCycleType() {
        return feedbackCycleType;
    }

    public void setFeedbackCycleType(Integer feedbackCycleType) {
        this.feedbackCycleType = feedbackCycleType;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public Integer getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(Integer feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin == null ? null : admin.trim();
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public String getAuthBiz() {
        return authBiz;
    }

    public void setAuthBiz(String authBiz) {
        this.authBiz = authBiz == null ? null : authBiz.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appkey=").append(appkey);
        sb.append(", desc=").append(desc);
        sb.append(", location=").append(location);
        sb.append(", businessGroup=").append(businessGroup);
        sb.append(", peakQps=").append(peakQps);
        sb.append(", dataAuth=").append(dataAuth);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", addtime=").append(addtime);
        sb.append(", modtime=").append(modtime);
        sb.append(", owner=").append(owner);
        sb.append(", online=").append(online);
        sb.append(", visitAllLabel=").append(visitAllLabel);
        sb.append(", bu=").append(bu);
        sb.append(", appName=").append(appName);
        sb.append(", appDesc=").append(appDesc);
        sb.append(", appAttr=").append(appAttr);
        sb.append(", bgbu=").append(bgbu);
        sb.append(", feedbackCycleType=").append(feedbackCycleType);
        sb.append(", feedbackDate=").append(feedbackDate);
        sb.append(", feedbackStatus=").append(feedbackStatus);
        sb.append(", admin=").append(admin);
        sb.append(", internal=").append(internal);
        sb.append(", authBiz=").append(authBiz);
        sb.append("]");
        return sb.toString();
    }
}