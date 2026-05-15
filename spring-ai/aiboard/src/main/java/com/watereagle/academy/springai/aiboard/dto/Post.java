package com.watereagle.academy.springai.aiboard.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Post {

    private int no;
    private String title;
    private String content;
    private String id;
    private LocalDateTime regDate;

}
