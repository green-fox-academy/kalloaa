package com.example.demo.controllers;

import com.example.demo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ToDoController {

  ToDoRepository toDoRepository;

  @Autowired
  public ToDoController (ToDoRepository toDoRepository){
    this.toDoRepository=toDoRepository;
  }

  @GetMapping(value = "/todo")
  public String showIndex(){
    return "index";
  }

  @GetMapping(value = "/todo/list")
  public String showList(Model model){
    model.addAttribute("todos",toDoRepository.findAll());
    return "list";
  }
}
