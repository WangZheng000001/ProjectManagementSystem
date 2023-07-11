package com.seisoul.projectmanagementsystem.mapper;

import com.seisoul.projectmanagementsystem.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    Member selectByIdAndPassword(int memId,String memPassword);

    //查询所有成员
    List<Member> selectAllMember();
    List<String>selectAllMemberName();

    //通过成员id查询
    Member selectByMemId(Member member);

    //通过成员姓名查询(散装参数)
    Member selectByMemName(String memName);

    //通过成员姓名查询
    Member selectByMemName(Member member);

    //通过是否是组长查询
    Member selectByLeader(Member member);

    //通过成员状态
    Member selectByMemStatus(Member member);


}
