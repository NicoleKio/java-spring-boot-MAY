package ua.com.nicole.javaspringboot.lesson_code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DemoBeansConfig {

    @Primary
    @Bean
    public String demoBean1(){
        return "demoBean 1";
    }

    @Bean
    public String demoBean2(){
        return "demoBean 2";
    }

    @Bean
    public Integer demoBeanInt(){
        return 888;
    }

}
