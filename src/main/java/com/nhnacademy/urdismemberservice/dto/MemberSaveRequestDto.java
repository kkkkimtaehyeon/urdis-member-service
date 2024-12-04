package com.nhnacademy.urdismemberservice.dto;

import java.time.LocalDate;

public record MemberSaveRequestDto(
        String email,
        String name,
        LocalDate birthDate
) {
}
