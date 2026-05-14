package com.watereagle.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.watereagle.ai.dto.MemberDto;
import com.watereagle.ai.mapper.MemberMapper;

@Controller
public class ControllerGameHome {

    @Autowired
    private MemberMapper mapper;

    @ResponseBody
    @GetMapping("/testJoin")
    public String testJoin() {
        MemberDto dto = new MemberDto();
        dto.setId("commander1");
        dto.setPw("1234");
        dto.setName("고양이");

        try {
            mapper.join(dto);
            return "로그인 성공";
        } catch (Exception e) {
            e.printStackTrace();
            return "로그인 실패: " + e.getMessage();
        }
    }

}
