package com.seisoul.projectmanagementsystem.dto;

/**
 * @ Author YOSHIGAWA
 * @ Description 这是个dto实体类对象
 * 作用地点:用于第二个界面的任务查询
 * 实体类变量及其含义:
 *                  misId:      任务番号
 *                  desc:       案件内容
 *                  addTime:    发布时间
 *                  expireTime: 给定完结时间
 *                  misStatus:  任务处理状态
 *                  startTime:  任务着手时间
 *                  endTime:    任务结束日期
 *                  progress:   任务当前进度
 * @ Date 2023-07-2023/07/12 13:03
 */
public class MissionDto {
    private String misId;                      //任务番号
    private String desc;                       //案件内容
    private String addTime;                    //发布时间
    private String expireTime;                 //给定完结时间
    private String misStatus;                  //任务处理状态
    private String startTime;                  //任务着手时间
    private String endTime;                    //任务结束日期
    private String progress;                   //任务当前进度

    @Override
    public String toString() {
        return "MissionDto{" +
                "misId='" + misId + '\'' +
                ", desc='" + desc + '\'' +
                ", addTime='" + addTime + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", misStatus='" + misStatus + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", progress='" + progress + '\'' +
                '}';
    }

    public MissionDto() {
    }

    public MissionDto(String misId, String desc, String addTime, String expireTime, String misStatus, String startTime, String endTime, String progress) {
        this.misId = misId;
        this.desc = desc;
        this.addTime = addTime;
        this.expireTime = expireTime;
        this.misStatus = misStatus;
        this.startTime = startTime;
        this.endTime = endTime;
        this.progress = progress;
    }

    public String getMisId() {
        return misId;
    }

    public void setMisId(String misId) {
        this.misId = misId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getMisStatus() {
        return misStatus;
    }

    public void setMisStatus(String misStatus) {
        this.misStatus = misStatus;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
