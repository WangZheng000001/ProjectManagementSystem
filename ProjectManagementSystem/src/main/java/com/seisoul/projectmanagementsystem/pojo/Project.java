package com.seisoul.projectmanagementsystem.pojo;

import java.sql.Date;
/*对应项目表*/

public class Project {
    private int projId;
    private String projPassword;
    private String projName;
    private Date addTime;
    private Date endTime;
    private int projStatus;
    private int fkMemId;

    public int getProjId() {
        return projId;
    }

    public void setProjId(int projId) {
        this.projId = projId;
    }

    public String getProjPassword() {
        return projPassword;
    }

    public void setProjPassword(String projPassword) {
        this.projPassword = projPassword;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getProjStatus() {
        return projStatus;
    }

    public void setProjStatus(int projStatus) {
        this.projStatus = projStatus;
    }

    public int getFkMemId() {
        return fkMemId;
    }

    public void setFkMemId(int fkMemId) {
        this.fkMemId = fkMemId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projId=" + projId +
                ", projPassword='" + projPassword + '\'' +
                ", projName='" + projName + '\'' +
                ", addTime=" + addTime +
                ", endTime=" + endTime +
                ", projStatus=" + projStatus +
                ", fkMemId=" + fkMemId +
                '}';
    }
}
