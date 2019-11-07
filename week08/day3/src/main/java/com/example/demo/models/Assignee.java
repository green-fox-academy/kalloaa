package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;


  private String name;
  private String email;
  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "assignees")
  private List<ToDo> todos = new ArrayList<>();

  public Assignee() {
  }

  public Assignee( String name, String email) {
    this.name = name;
    this.email = email;
  }
  public void addToDo(ToDo toDo){
    todos.add(toDo);
  }

  public List<ToDo> getTodos() {
    return todos;
  }

  public void setTodos(List<ToDo> todos) {
    this.todos = todos;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
