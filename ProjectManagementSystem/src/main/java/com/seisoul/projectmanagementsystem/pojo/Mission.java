package com.seisoul.projectmanagementsystem.pojo;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
/*对应任务表*/
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "mis_id")
    private Integer misId;

    @Column(name = "desc")
    private String desc;

    @Column(name = "fk_proj_id")
    private Integer fkProjId;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "expire_time")
    private Date expireTime;

    @Column(name = "mis_status")
    private Integer misStatus;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "level")
    private Integer level;

    @Column(name = "progress")
    private Integer progress;

    @Column(name = "fk_mem_id")
    private Integer fkMemId;


    public Integer getMisId() {
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

    public void setLevel(Integer level) {
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
