package com.seisoul.projectmanagementsystem.mapper;

import com.seisoul.projectmanagementsystem.pojo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository    //这是一个Dao层,添加这个注解表示这是一个Dao层
public interface MemberMapper {
    Member selectByIdAndPassword(int memId, String memPassword);

    Member selectAll(Member member);

    Member selectById(Member member);

    Member selectByName(Member member);

    Member selectByLeader(Member member);

    Member selectByStatus(Member member);


}
