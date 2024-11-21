package com.tencent.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tencent.*"})
public class ManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManagementApplication.class, args);
  }
}
