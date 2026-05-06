package com.watereagle.ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import com.watereagle.ai.model.Heroine;
import com.watereagle.ai.prompt.PromptHeroine;

@Service
public class AiHeroine {

    private final ChatClient chatClient;

    public AiHeroine(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public Heroine getHeroine() {
        Heroine heroine = chatClient.prompt()
                .user(PromptHeroine.GENERATION)
                .call()
                .entity(Heroine.class);
        return heroine;
    }
}
