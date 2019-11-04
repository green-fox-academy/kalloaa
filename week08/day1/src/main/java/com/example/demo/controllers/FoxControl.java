package com.example.demo.controllers;

import com.example.demo.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxControl {

  FoxService foxService;

  @Autowired
  public FoxControl(FoxService foxy) {
    this.foxService = foxy;
  }


  @GetMapping(value = "/foxclub")
  public String showIndex(Model model){
    if (foxService.getName() == null){
      return "redirect:/foxclub/login";
    }
    else {
      model.addAttribute("name",foxService.getName());
      return "index";
    }
  }

  @GetMapping(value = "/foxclub/login")
  public String showLogin(){
    return "login";
  }

  @PostMapping(value = "/foxclub/login/add")
  public String doLogin(@RequestParam String name){

    return "redirect:/foxclub";
  }
}
