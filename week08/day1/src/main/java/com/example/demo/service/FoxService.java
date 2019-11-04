package com.example.demo.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  String name;
  ArrayList<String> skills;

  public FoxService(String name, ArrayList<String> skills) {
    this.name = name;
    this.skills = skills;
  }
  public FoxService(){
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getSkills() {
    return skills;
  }

  public void addSkill(String skill){
    skills.add(skill);
  }

}
