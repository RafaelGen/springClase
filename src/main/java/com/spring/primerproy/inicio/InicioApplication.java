package com.spring.primerproy.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class InicioApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(InicioApplication.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String name : beanNames){
            System.out.println(name);
        }

        PojoConfig pojo = (PojoConfig) ctx.getBean("myconfig");
        System.out.println(pojo.toString());
    }
}
