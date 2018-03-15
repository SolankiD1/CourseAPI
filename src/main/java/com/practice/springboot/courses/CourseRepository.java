package com.practice.springboot.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String > {
	//this will run crud opperations on your model. 
	//This is a string findBy{Model field} the Spring Data JPA will split and run a filter to your database to grab the column. 
	//if its an object and you want a field inside the object you have to do findBy{ObjectName}{ObjectFieldYouWant} and it will grab deeper.
	//Many to One @ will allow the app to grab a field inside an object from your course model.  
	public List<Course> findByTopicId(String topicId);
}
