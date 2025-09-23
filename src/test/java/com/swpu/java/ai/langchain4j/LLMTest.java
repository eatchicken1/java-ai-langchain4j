package com.swpu.java.ai.langchain4j;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LLMTest {

    /**
     * GPT Demo测试
     */
    @Test
    public void testGPTDemo(){
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        String answer = model.chat("你好");
        System.out.println("answer = " + answer);
    }

    /**
     * OpenAI模型测试
     */
    @Autowired
    private OpenAiChatModel openAiChatModel;
    @Test
    public void testDeepseek(){
        String answer = openAiChatModel.chat("你是谁");
        System.out.println("answer = " + answer);
    }

    /**
     * ollama本地模型测试
     */
    @Autowired
    private OllamaChatModel ollamaChatModel;
    @Test
    public void testOllama() {
        String answer = ollamaChatModel.chat("你是谁");
        System.out.println("answer = " + answer);
    }

    /**
     * 通义千问大模型
     */
    @Autowired
    private QwenChatModel qwenChatModel;
    @Test
    public void testDashScopeQwen() {
        //向模型提问
        String answer = qwenChatModel.chat("你好");
        //输出结果
        System.out.println(answer);
    }

}
