package com.springappdemo.greetingapplicationtest.controller;


import com.springappdemo.greetingapplicationtest.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "userFirstNameName", defaultValue = "World") String firstName,
                             @RequestParam(value = "userLastNam", defaultValue = "lastname")String lastName){
        return new Greeting(counter.incrementAndGet(),
                String.format(template,firstName,lastName));
    }
}
