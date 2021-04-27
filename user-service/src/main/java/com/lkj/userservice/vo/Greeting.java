package com.lkj.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {

    @Value("${greeting.message}")
    private String message; //application.yml 에서 가져옴
}
