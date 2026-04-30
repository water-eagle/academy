package com.watereagle.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {
    private final ChatClient chatClient;

    // 생성자 주입 (Spring AI의 표준 방식)
    public AiController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/ai")
    public String completion(@RequestParam(defaultValue = "스프링 AI 프레임워크에 대한 전망은 어때?") String message) {
        return chatClient.prompt().user(message).call().content();
    }
}
