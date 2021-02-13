package com.kraynov.springsandbox;

import com.kraynov.springsandbox.service.InputProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringSandBoxApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringSandBoxApplication.class, args);
        System.out.println("pakr ctx = " + ctx.getBeanFactory());
        System.out.println("beans = "+ Arrays.toString(ctx.getBeanDefinitionNames()));

        InputProcessor someService = ctx.getBean("inputProcessor", InputProcessor.class);
        System.out.println("beans = "+ someService.processFirstStepInput("123"));
        System.out.println("beans = "+ ctx.getBean("inputProcessor", InputProcessor.class).processSecondStepInput("321"));
    }
}
