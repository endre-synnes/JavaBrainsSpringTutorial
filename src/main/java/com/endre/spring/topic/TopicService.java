package com.endre.spring.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "spring Framework", "Spring Framework description"),
            new Topic("java", "Core Java", "Core java description"),
            new Topic("javascript", "JavaScript", "JavaScript description")
    );

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
