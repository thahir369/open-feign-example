package com.halloWorld.service;

import com.halloWorld.dto.Topic;
import com.halloWorld.restclient.TopicFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenFeignService {

  @Autowired private TopicFeignClient topicFeignClient;

  public String fetchHomePage() {
    return topicFeignClient.getHomePage();
  }

  public List<Topic> fetchAllTopics() {
    return topicFeignClient.getTopics();
  }

  public Topic fetchOneTopic(int id) {
    return topicFeignClient.getTopic(id);
  }
}
