package com.example.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  long id;
  String content;

  public long getId() {
    return id;
  }
  public String getContent(){
    return content;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }
}