package com.OnTheRise.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Restful Service, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/restful")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Continue Training") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}