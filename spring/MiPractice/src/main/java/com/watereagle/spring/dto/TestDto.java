package com.watereagle.spring.dto;

import lombok.Data;

@Data // Lombok 라이브러리가 게터, 게터함수, 게터메소드 다 자동으로 포함시켜준다.(Outline 탭에서 확인)
public class TestDto {
	private Long no;
	private String str_data;

}
