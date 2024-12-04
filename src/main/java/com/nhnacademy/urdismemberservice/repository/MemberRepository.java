package com.nhnacademy.urdismemberservice.repository;

import com.nhnacademy.urdismemberservice.dto.MemberDto;
import com.nhnacademy.urdismemberservice.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
    Optional<MemberDto> findByEmail(String email);
}
