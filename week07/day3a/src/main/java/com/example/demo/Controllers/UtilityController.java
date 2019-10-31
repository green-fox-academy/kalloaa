package com.example.demo.Controllers;

import com.example.demo.Services.UtilityService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
  private List<String> savedCeasar = new ArrayList<>();

  public List<String> getSavedCeasar() {
    return savedCeasar;
  }


  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(value = "/useful")
  public String showIndex(Model model){
    model.addAttribute("ceasars",savedCeasar);
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

  @GetMapping(value = "/useful/ceasar")
  public String showCEAS(){
    return "CEAS";
  }

  @PostMapping(path = "/useful/ceasar/add")
  public String ceasarIt(@RequestParam String text,@RequestParam int number){
    savedCeasar.add(utilityService.caesar(text,number));
    return "redirect:/useful";
  }
}
