package com.nhnacademy.urdismemberservice.service;

import com.nhnacademy.urdismemberservice.dto.MemberDto;
import com.nhnacademy.urdismemberservice.dto.MemberSaveRequestDto;

public interface MemberService {
    //oauth 인증시에 호출
    MemberDto getMemberByEmail(String email);
    String createMember(MemberSaveRequestDto saveRequest);
}
