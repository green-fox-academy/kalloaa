package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RPost {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long Id;

  private String name;
  private String link;
  private int score = 0;

  public RPost(String name, String link) {
    this.name = name;
    this.link = link;
  }

  public RPost() {
  }

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
