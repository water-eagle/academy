package com.watereagle.academy.springai.aiboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.watereagle.academy.springai.aiboard.mapper.AiBoardMapper;

@Controller
public class ControllerAiBoard {
    @Autowired
    private AiBoardMapper mapper;

    @GetMapping("/del")
    public String del(@RequestParam("no") int no) {
        int n = mapper.del(no);
        System.out.println("삭제된 글 수:" + n);
        return "redirect:/";
    }
}
