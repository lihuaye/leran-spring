package moe.emilia.learn.config;

import moe.emilia.learn.pojo.SystemInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SystemInfo getInfo(){
        return new SystemInfo("V1.0.0", "Hello Spring Mvc");
    }
}
