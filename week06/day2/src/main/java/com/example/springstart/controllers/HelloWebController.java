package com.example.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
  AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " ddd");
    return "greeting";
  }

}
