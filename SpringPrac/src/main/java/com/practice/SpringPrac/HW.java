package com.practice.SpringPrac;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HW {

    @GetMapping(path = "/gyan")
    public String hello(){
        return "Hello For Gyan Ponnappa";
    }
    @GetMapping(path = "/greet")
    public String greeting(){
        return "Greetings My Dear Friend";
    }
}
