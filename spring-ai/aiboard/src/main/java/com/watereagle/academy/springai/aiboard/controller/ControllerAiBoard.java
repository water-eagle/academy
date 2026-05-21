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

    @GetMapping("/")
    public String list(Model model) {
        List<Post> posts = mapper.getList();
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
        mapper.write(post);
        return "redirect:/";
    }

    @GetMapping("edit")
    public String edit(@RequestParam("no") int no, Model model) {
        Post post = mapper.read(no);
        model.addAttribute("post", post);
        return "edit";
    }

    @GetMapping("editProc")
    public String editProc(Post post) {
        mapper.edit(post);
        return "redirect:/";
    }

}
