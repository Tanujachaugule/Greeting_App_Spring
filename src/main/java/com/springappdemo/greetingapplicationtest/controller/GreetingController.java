package com.springappdemo.greetingapplicationtest.controller;

import com.springappdemo.greetingapplicationtest.entity.Greeting;
import com.springappdemo.greetingapplicationtest.entity.User;
import com.springappdemo.greetingapplicationtest.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingService greetingService;
    @GetMapping(value = {"", "/"})
    public Greeting greeting(@RequestParam(value = "userFirstName", defaultValue = "World") String firstName,
                             @RequestParam(value = "userLastName", defaultValue = "") String lastName){
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }


}
