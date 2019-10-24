package com.example.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTControlle {
  AtomicLong atomicLong = new AtomicLong(1);
  @RequestMapping(value="/greeting")
  public Greeting getGreeting(@RequestParam String name) {

    Greeting greeting = new Greeting(1,"Hello " + name);
    greeting.setId(atomicLong.incrementAndGet());
    return greeting;
  }
}
