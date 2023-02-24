package com.halloWorld.restclient;

import com.halloWorld.dto.Topic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "localhost:8080", name = "topicClient")
public interface TopicFeignClient {

  @GetMapping("/home")
  String getHomePage();

  @GetMapping("/topics")
  List<Topic> getTopics();

  @GetMapping("/topics/{id}")
  Topic getTopic(@PathVariable int id);
}
