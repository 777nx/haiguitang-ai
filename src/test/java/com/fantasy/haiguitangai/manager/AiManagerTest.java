package com.fantasy.haiguitangai.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void doChat() {
        String systemPrompt = "你是一个医生，请根据用户输入的病情，给出建议";
        String userPrompt = "我最近总是感到头痛，而且有时候还会头晕，这是什么原因？";
        String answer = aiManager.doChat(systemPrompt, userPrompt);
        System.out.println(answer);
    }
}
