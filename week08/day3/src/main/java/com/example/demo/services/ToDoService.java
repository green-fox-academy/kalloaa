package com.example.demo.services;

import com.example.demo.models.ToDo;
import com.example.demo.repositories.ToDoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
  ToDoRepository toDoRepository;

  @Autowired
  public ToDoService(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public List<ToDo> findAll(){
    List<ToDo> temp = new ArrayList<>();
    toDoRepository.findAll().forEach(toDo -> temp.add(toDo));
    return temp;
  }

  public ToDo findById(long id){
    return toDoRepository.findById(id).orElse(null);
  }

  public void save(ToDo toDo){
    toDoRepository.save(toDo);
  }

  public ToDo findByTitle(String Title){
    return  toDoRepository.findToDoByTitle(Title);
  }


}
