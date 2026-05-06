package com.watereagle.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ChatController {
    private final ChatClient chatClient;

    // 생성자 주입 (Spring AI의 표준 방식)
    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/chat") // 브라우저 주소창에 /chat 이라고 치면 실행
    public String chatPage() {
        return "chat"; // templates 폴더의 chat.html을 찾아서 실행 (확장자 생략 가능)
    }

    @GetMapping("/sendMessage") // 브라우저 주소창에 /chat 이라고 치면 실행
    public String sendMessage(@RequestParam("message") String message, Model model) {
        // log.info("[내가 보낸 메세지]:"+message);
        System.out.println("[내가 보낸 메세지]:" + message);
        String responseMessage = chatClient.prompt().user(message).call().content();
        model.addAttribute("responseMessage", responseMessage);
        // log.info("[내가 제미나이에게 받은 메세지]:"+responseMessage);
        System.out.println("[내가 제미나이에게 받은 메세지]:" + responseMessage);
        return "response"; // templates 폴더의 chat.html을 찾아서 실행 (확장자 생략 가능)
    }
}
