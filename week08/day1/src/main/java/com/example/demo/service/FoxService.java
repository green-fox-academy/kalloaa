package com.example.demo.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  String name;
  int avatar;
  String avatarImg;
  ArrayList<String> skills;

  public FoxService(String name, int avatar, ArrayList<String> skills) {
    this.name = name;
    this.avatar = avatar;
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

  public String getAvatar() {
    String temp = "";
    switch (avatar){
      case 1 : temp = "doge.jpg";
      break;
      case 2 : temp = "doge_abstract.jpg";
      break;
      case 3 : temp = "doge_bread.png";
      break;
      default : temp = "doge_spoopy.jpg";
      break;
    }
    return temp;
  }

  public void setAvatar(int avatar) {
    this.avatar = avatar;
  }
}
