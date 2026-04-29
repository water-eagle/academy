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
    public String completion(@RequestParam(defaultValue = "안녕 제미나이!") String message) {
        return chatClient.prompt().user(message).call().content();
    }
}
