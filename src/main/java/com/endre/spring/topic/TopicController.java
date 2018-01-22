package com.endre.spring.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring", "spring Framework", "Spring Framework description"),
                new Topic("java", "Core Java", "Core java description"),
                new Topic("javascript", "JavaScript", "JavaScript description")
        );
    }

}
