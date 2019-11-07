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
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;

  private String title;
  private boolean urgent = false;
  private boolean done = false;

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Assignee> assignees = new ArrayList<>();

  public List<Assignee> getAssignees() {
    return assignees;
  }

  public void addAssignee(Assignee assignee){
    assignees.add(assignee);
  }

  public void setAssignees(List<Assignee> assignees) {
    this.assignees = assignees;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public ToDo(String title){
    this.title = title;
  }

  public ToDo(){
  }
}