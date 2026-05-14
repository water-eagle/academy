package com.watereagle.ai.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MemberDto {
    private String id;
    private String pw;
    private String name;
    private LocalDateTime regDate;
}
