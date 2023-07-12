package com.seisoul.projectmanagementsystem.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
/*对应任务表*/
public class Mission {
    private Integer misId;
    private String desc;
    private Integer fkProjId;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date addTime;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date expireTime;

    private Integer misStatus;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date startTime;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date endTime;
    private Integer level;
    private Integer progress;
    private Integer fkMemId;

    public Integer getMisId() {
        return misId;
    }

    public void setMisId(Integer misId) {
        this.misId = misId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getFkProjId() {
        return fkProjId;
    }

    public void setFkProjId(Integer fkProjId) {
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

    public Integer getMisStatus() {
        return misStatus;
    }

    public void setMisStatus(Integer misStatus) {
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getFkMemId() {
        return fkMemId;
    }

    public void setFkMemId(Integer fkMemId) {
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
