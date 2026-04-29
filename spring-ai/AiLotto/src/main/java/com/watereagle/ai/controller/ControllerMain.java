package com.watereagle.ai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMain {
    @GetMapping("/hello")
    public String hello() {
        return "가동 준비 완료! 짹짹!";
    }
}
