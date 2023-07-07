package com.example.dydb;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class InitData {

    @Bean
    public ApplicationRunner devInit(DynamoDBService dynamoDBService) {
        return args -> {

            for(long i=100; i<=110; i++) {
                MyClass data = MyClass.builder()
                        .id(i)
                        .createDate(LocalDateTime.now())
                        .build();
                dynamoDBService.putItem("hello", data);
            }
        };
    }
}
