package com.seisoul.projectmanagementsystem.mapper;
import com.seisoul.projectmanagementsystem.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    Member selectByIdAndPassword(int memId,String memPassword);
}
