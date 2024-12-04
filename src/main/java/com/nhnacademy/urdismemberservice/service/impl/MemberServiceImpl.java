package com.nhnacademy.urdismemberservice.service.impl;

import com.nhnacademy.urdismemberservice.dto.MemberDto;
import com.nhnacademy.urdismemberservice.dto.MemberSaveRequestDto;
import com.nhnacademy.urdismemberservice.repository.MemberRepository;
import com.nhnacademy.urdismemberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    @Override
    public MemberDto getMemberByEmail(String email) {
        return null;
    }

    @Override
    public String createMember(MemberSaveRequestDto saveRequest) {
        return "";
    }
}
