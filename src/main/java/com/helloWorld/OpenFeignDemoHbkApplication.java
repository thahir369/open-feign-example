package com.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignDemoHbkApplication {

  public static void main(String[] args) {
    SpringApplication.run(OpenFeignDemoHbkApplication.class, args);
  }
}
