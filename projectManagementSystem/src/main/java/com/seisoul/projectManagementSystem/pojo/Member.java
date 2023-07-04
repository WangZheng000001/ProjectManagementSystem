package com.seisoul.projectmanagementsystem.pojo;

public class Member {
   private int memId;
   private String memPassword;
   private String memName;
   private int gender;
   private int leader;

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getLeader() {
        return leader;
    }

    public void setLeader(int leader) {
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memId=" + memId +
                ", memPassword='" + memPassword + '\'' +
                ", memName='" + memName + '\'' +
                ", gender=" + gender +
                ", leader=" + leader +
                '}';
    }
}
