package com.example.demo.Controllers;

import com.example.demo.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(value = "/useful")
  public String showIndex(){
    return "index";
  }

  @GetMapping(value = "/random-color")
  public  String showRC(Model model){
    model.addAttribute("randomcolor",utilityService.randomColor());
    return "RC";
  }
  @GetMapping(value = "/useful/email")
  public String showEV(Model model, @RequestParam String email){
    System.out.println(email);
    model.addAttribute("isValid",utilityService.validateEmail(email));
    return "EV";
  }
}
