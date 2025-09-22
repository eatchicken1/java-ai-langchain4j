package com.swpu.java.ai.langchain4j;

import com.swpu.java.ai.langchain4j.assistant.Assistant;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AIServiceTest {

    @Autowired
    private OllamaChatModel ollamaChatModel;
    @Test
    public void testChat() {
        Assistant assistant = AiServices.create(Assistant.class, ollamaChatModel);
        String answer = assistant.chat("你是谁");
        System.out.println("answer = " + answer);
    }

    @Autowired
    private Assistant assistant;
    @Test
    public void testAssistant() {
        String answer = assistant.chat("你是谁");
        System.out.println("answer = " + answer);
    }
}
