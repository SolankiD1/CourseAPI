package com.practice.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired	
	private TopicRepository topicRepository;
	//what is a service a singleton that depends on the service and it can inject it to different classes.
	//it wont create a new service everytime. 	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
			.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic){
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {	
		topicRepository.save(topic);	
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
