package com.helloWorld.controller;

import com.helloWorld.dto.Topic;
import com.helloWorld.service.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/openfeign")
public class OpenFeignController {

  @Autowired private OpenFeignService openFeignService;

  @GetMapping("/home")
  String fetchHomePage() {
    return openFeignService.fetchHomePage();
  }

  @GetMapping("/topics")
  List<Topic> fetchAllTopics() {
    return openFeignService.fetchAllTopics();
  }

  @GetMapping("/topics/{id}")
  Topic fetchOneTopic(@PathVariable int id) {
    return openFeignService.fetchOneTopic(id);
  }
}
