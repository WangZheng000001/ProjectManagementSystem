package com.seisoul.projectmanagementsystem.mapper;

import com.seisoul.projectmanagementsystem.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    Member selectByIdAndPassword(int memId, String memPassword);

    //通过成员姓名查询(散装参数)
    Member selectByMemName(String memName);

    //方法名:查询所有成员 返回值:Member对象的集合 方法形参:无
    List<Member> selectAllMember();

    //方法名:通过成员id查询 返回值:Member对象的集合 方法形参:Member对象
    List<Member> selectByMemId(Member member);

    //方法名:通过成员姓名查询 返回值:一个Member对象 方法形参:Member对象
    Member selectByMemName(Member member);

    //方法名:通过是否是组长查询 返回值:Member对象的集合 方法形参:Member对象
    List<Member> selectByLeader(Member member);

    //方法名:通过成员状态 返回值:Member对象的集合 方法形参:Member对象
    List<Member> selectByMemStatus(Member member);


}
