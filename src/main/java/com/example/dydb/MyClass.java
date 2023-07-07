package com.example.dydb;

import lombok.*;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.time.LocalDateTime;

@DynamoDbBean
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyClass {

    private Long id;
    private LocalDateTime createDate;

    @DynamoDbPartitionKey
    public Long getId() {
        return id;
    }
}
