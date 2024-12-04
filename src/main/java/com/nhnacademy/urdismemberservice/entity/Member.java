package com.nhnacademy.urdismemberservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class Member {
    @Id
    @Column(name = "member_id")
    private String id;
    @Column(name = "member_email")
    private String email;
    @Column(name = "member_name")
    private String name;
    @Column(name = "member_role")
    private Role role;
    private LocalDateTime createdAt;
}
