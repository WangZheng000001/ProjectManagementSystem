package com.seisoul.projectmanagementsystem.pojo;

import jakarta.persistence.*;

/**
 * @ Author changcyril40
 * @ Description 这是一个实体类,类里声明了数据库里tb_mem的属性,一一对应的声明了表格tb_mem的所有的属性
 * @ Date 2023-07-2023/07/10 14:59
 */

@Entity
@Table(name = "tb_mem")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memId")
    private Integer memId;

    @Column(name = "memPassword")
    private String memPassword;

    @Column(name = "memName")
    private String memName;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "leader")
    private Integer leader;

    @Column(name = "memStatus")
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
