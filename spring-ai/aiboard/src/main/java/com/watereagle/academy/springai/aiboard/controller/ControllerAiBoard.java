package com.watereagle.academy.springai.aiboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.watereagle.academy.springai.aiboard.dto.Post;
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

    @GetMapping("/read")
    public String read(@RequestParam("no") int no, Model model) {
        Post post = mapper.read(no);
        model.addAttribute("post", post);
        return "read";
    }

}
