package com.example.demo.controllers;

import com.example.demo.models.ToDo;
import com.example.demo.services.AssigneeService;
import com.example.demo.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoController {

  private ToDoService toDoService;
  private AssigneeService assigneeService;

  @Autowired
  public ToDoController(ToDoService toDoService, AssigneeService assigneeService) {
    this.toDoService = toDoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = "/todo")
  public String showIndex(){
    return "index";
  }

  @GetMapping(value = "/todo/list")
  public String showList(Model model){
    model.addAttribute("todos",toDoService.findAll());
    return "list";
  }

  @PostMapping(value = "/todo/add")
  public String addTodo(@RequestParam String title){
    toDoService.save(new ToDo(title));
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/todo/{todoID}")
  public String getTheTodosAssignee(@PathVariable(name = "todoID") Long todoID,Model model){

    model.addAttribute("assigneelist", assigneeService.getListofAssigneesByTodo(toDoService.findById(todoID)));
    return "listToDoByAssignee";
  }

}