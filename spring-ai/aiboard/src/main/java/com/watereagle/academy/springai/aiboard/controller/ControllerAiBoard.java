package com.watereagle.academy.springai.aiboard.controller;

import java.util.List;

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
    private AiBoardMapper service;

    @GetMapping("/del")
    public String del(@RequestParam("no") int no) {
        int n = service.del(no);
        System.out.println("삭제된 글 수:" + n);
        return "redirect:/";
    }

    @GetMapping("/read")
    public String read(@RequestParam("no") int no, Model model) {
        Post post = service.read(no);
        model.addAttribute("post", post);
        return "read";
    }

    @GetMapping("/")
    public String list(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
        List<Post> posts = service.getList(3); 
        model.addAttribute("posts", posts); 
        return "list";
    }

    @GetMapping("write")
    public String write() {
        return "write";
    }

    @GetMapping("writeProc")
    public String writeProc(Post post) {
        post.setId("kitty");
        service.write(post);
        return "redirect:/";
    }

    @GetMapping("edit")
    public String edit(@RequestParam("no") int no, Model model) {
        Post post = service.read(no);
        model.addAttribute("post", post);
        return "edit";
    }

    @GetMapping("editProc")
    public String editProc(Post post) {
        service.edit(post);
        return "redirect:/";
    }

}
