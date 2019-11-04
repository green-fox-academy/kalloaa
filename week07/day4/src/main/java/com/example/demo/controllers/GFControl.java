package com.example.demo.controllers;

import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IModel;

@Controller
public class GFControl {
  private StudentService studentService;

  @Autowired
  public GFControl(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping(value = "/gfa" )
  public String showIndex(){
    return "index";
  }

  @GetMapping(value = "/gfa/list")
  public String showList(Model model){
    model.addAttribute("list",studentService.findAll());
    return "list";
  }

  @GetMapping(value = "/gfa/add")
  public String showAddPage(){
    return "addPage";
  }

  @PostMapping(value = "/gfa/add/adding")
  public String addMembers(@RequestParam String newMember){
    studentService.save(newMember);
    return "redirect:/gfa";
  }

  @GetMapping(value = "/gfa/search")
  public String showSearchPage(){
    return "checkPage";
  }

  @PostMapping(value = "/gfa/search/check")
  public String checkMember(@RequestParam String member, Model model){
    model.addAttribute("memberExists",studentService.check(member));
    return "redirect:/gfa/search";
  }




}
