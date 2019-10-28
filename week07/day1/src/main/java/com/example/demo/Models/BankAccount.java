package com.example.demo.Models;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private Boolean isKing;
  private Boolean isGood;

  public BankAccount(String name, int balance, String animalType, Boolean isKing, Boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public  BankAccount(Boolean isKing){

  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getKing() {
    return isKing;
  }

  public void setKing(Boolean king) {
    isKing = king;
  }

  public Boolean getGood() {
    return isGood;
  }

  public void setGood(Boolean good) {
    isGood = good;
  }
}
