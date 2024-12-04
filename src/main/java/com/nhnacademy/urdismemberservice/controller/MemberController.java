package com.nhnacademy.urdismemberservice.controller;

import com.nhnacademy.urdismemberservice.dto.MemberDto;
import com.nhnacademy.urdismemberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/api/members")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/email/{email}")
    public ResponseEntity<MemberDto> getMemberByEmail(@PathVariable("email") String email) {
        MemberDto memberDto = memberService.getMemberByEmail(email);
        return ResponseEntity.status(HttpStatus.OK).body(memberDto);
    }
}
