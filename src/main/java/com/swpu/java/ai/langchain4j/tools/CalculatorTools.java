package com.swpu.java.ai.langchain4j.tools;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

@Component("calculatorTools")
public class CalculatorTools {
    @Tool
    public double sum(double a, double b) {
        System.out.println("调用加法运算");
        return a + b;
    }

    @Tool
    public double squareRoot(double x) {
        System.out.println("调用平方根运算");
        return Math.sqrt(x);
    }
}
