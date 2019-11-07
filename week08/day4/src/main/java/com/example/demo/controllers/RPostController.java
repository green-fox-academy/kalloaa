package com.example.demo.controllers;

import com.example.demo.services.RPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RPostController {
  private RPostService rPostService;

  @Autowired
  public RPostController(RPostService rPostService) {
    this.rPostService = rPostService;
  }

  @GetMapping("/reddit")
  public String showIndex(){
    return "index";
  }
}
