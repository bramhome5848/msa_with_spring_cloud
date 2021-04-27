package com.lkj.userservice.controller;

import com.lkj.userservice.vo.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")    //쓰지 않은 것과 같음..
public class UserController {

    private Environment env;
    private Greeting greeting;

    @Autowired
    public UserController(Environment env, Greeting greeting) {
        this.env = env;
        this.greeting = greeting;
    }

    @GetMapping("/health_check")
    public String status() {
        return "It's Working in User Service";
    }

    @GetMapping("/welcome")
    public String welcome() {
        //return env.getProperty("greeting.message"); //application.yml 의 값 직접 사용
        return greeting.getMessage();
    }
}
