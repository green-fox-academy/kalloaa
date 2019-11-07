package com.example.demo;

import com.example.demo.models.Assignee;
import com.example.demo.models.ToDo;
import com.example.demo.services.AssigneeService;
import com.example.demo.services.ToDoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  private ToDoService toDoService;
  private AssigneeService assigneeService;

  public DemoApplication(ToDoService toDoService, AssigneeService assigneeService) {
    this.toDoService = toDoService;
    this.assigneeService = assigneeService;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Assignee belus = new Assignee("Bla","bela@asd.com");
    Assignee celus = new Assignee("Cla","cela@dsa.com");
    ToDo doSomething = new ToDo("Something");
    ToDo doSomethingElse = new ToDo("Something...Else!");
    assigneeService.addToDo(belus,doSomething);
    assigneeService.addToDo(belus,doSomethingElse);
    assigneeService.addToDo(celus,doSomething);
    assigneeService.save(belus);
    assigneeService.save(celus);
    toDoService.save(doSomethingElse);
    toDoService.save(doSomething);
  }
}
