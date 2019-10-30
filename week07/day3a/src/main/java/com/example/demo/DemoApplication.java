package com.example.demo;

import com.example.demo.Services.MyColor;
import com.example.demo.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
  MyColor myColor;
  Printer printer;

  @Autowired
  public DemoApplication(Printer printer, MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  printer.log("a");
  myColor.printColor();
  }
}
