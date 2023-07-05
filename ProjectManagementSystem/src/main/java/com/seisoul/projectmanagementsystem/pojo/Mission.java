package com.seisoul.projectmanagementsystem.pojo;

import java.sql.Date;
/*对应任务表*/
public class Mission {
    private int misId;
    private String desc;
    private int fkProjId;
    private Date addTime;
    private Date expireTime;
    private int misStatus;
    private Date startTime;
    private Date endTime;
    private int level;
    private int progress;
    private int fkMemId;

    public int getMisId() {
        return misId;
    }

    public void setMisId(int misId) {
        this.misId = misId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getFkProjId() {
        return fkProjId;
    }

    public void setFkProjId(int fkProjId) {
        this.fkProjId = fkProjId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public int getMisStatus() {
        return misStatus;
    }

    public void setMisStatus(int misStatus) {
        this.misStatus = misStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getFkMemId() {
        return fkMemId;
    }

    public void setFkMemId(int fkMemId) {
        this.fkMemId = fkMemId;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "misId=" + misId +
                ", desc='" + desc + '\'' +
                ", fkProjId=" + fkProjId +
                ", addTime=" + addTime +
                ", expireTime=" + expireTime +
                ", misStatus=" + misStatus +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", level=" + level +
                ", progress=" + progress +
                ", fkMemId=" + fkMemId +
                '}';
    }
}
