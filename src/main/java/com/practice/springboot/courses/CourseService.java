package com.practice.springboot.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired	
	private CourseRepository courseRepository;
	//what is a service a singleton that depends on the service and it can inject it to different classes.
	//it wont create a new service everytime. 	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
			.forEach(courses::add);
		return courses;
	}
	
	public Course getCourses(String id){
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course topic){
		courseRepository.save(topic);
	}
	
	public void updateCourse(Course course) {	
		courseRepository.save(course);	
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
