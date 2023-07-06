package com.seisoul.projectmanagementsystem.mapper;

import com.seisoul.projectmanagementsystem.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    Member selectByIdAndPassword(int memId,String memPassword);
    Member selectByMemName(String memName);
    List<Member>selectAll();
    List<Member>selectAllMemName();

}
