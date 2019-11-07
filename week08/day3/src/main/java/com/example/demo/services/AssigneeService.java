package com.example.demo.services;

import com.example.demo.models.Assignee;
import com.example.demo.models.ToDo;
import com.example.demo.repositories.AssigneeRepository;
import com.example.demo.repositories.ToDoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService {
  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public List<Assignee> findAll(){
    List<Assignee> temp = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignee -> temp.add(assignee));
    return temp;
  }

  public Assignee findById(Long Id){
    return assigneeRepository.findById(Id).orElse(null);
  }

  public void save(Assignee assignee){
    assigneeRepository.save(assignee);
  }

  public Assignee findAssigneeByName(String name){
    return assigneeRepository.findAssigneeByName(name);
  }

  public void editAssigneeName(Assignee assignee, String newName){
    assignee.setName(newName);
    assigneeRepository.save(assignee);
  }

  public void addToDo(Assignee assignee, ToDo todo){
    assignee.addToDo(todo);
    todo.addAssignee(assignee);
  }

  public List<Assignee> getListofAssigneesByTodo(ToDo toDo){
    return toDo.getAssignees();
  }




}
