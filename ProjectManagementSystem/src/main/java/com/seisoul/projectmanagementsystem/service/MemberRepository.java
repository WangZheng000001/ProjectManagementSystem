package com.seisoul.projectmanagementsystem.service;

import com.seisoul.projectmanagementsystem.pojo.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}

