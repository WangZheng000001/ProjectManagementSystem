package com.seisoul.projectmanagementsystem.pojo;

public class Member {
    private Integer memId;
    private String memPassword;
    private String memName;
    private Integer gender;
    private Integer leader;
    private Integer memStatus;


    @Override
    public String toString() {
        return "Member{" +
                "memId=" + memId +
                ", memPassword='" + memPassword + '\'' +
                ", memName='" + memName + '\'' +
                ", gender=" + gender +
                ", leader=" + leader +
                ", memStatus=" + memStatus +
                '}';
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public String getMemPassword() {
        return memPassword;
    }

    public void setMemPassword(String memPassword) {
        this.memPassword = memPassword;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getLeader() {
        return leader;
    }

    public void setLeader(Integer leader) {
        this.leader = leader;
    }

    public Integer getMemStatus() {
        return memStatus;
    }

    public void setMemStatus(Integer memStatus) {
        this.memStatus = memStatus;
    }
}
