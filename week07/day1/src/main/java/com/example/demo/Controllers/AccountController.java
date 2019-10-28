package com.example.demo.Controllers;

import com.example.demo.Models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
  private List<BankAccount> accounts = new ArrayList<>();

  public AccountController(){
    accounts.add(new BankAccount("Simba",2000, "Lion", true, true));
    accounts.add(new BankAccount("Szkar",0, "Lion", false, false));
    accounts.add(new BankAccount("Timo",99999, "Ferret", false,true));
    accounts.add(new BankAccount("Pumba",15, "Piggie", false,false));
    accounts.add(new BankAccount("i never watched Lion King",2000, "Frog", true,false));
  }


  @GetMapping(value = {"/show"})
  public String indexPage(Model model) {
    model.addAttribute("myAccounts", accounts);
    model.addAttribute("valami","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "index";
  }


}
