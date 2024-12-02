package com.SpringLearning.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.model.Course;

@RestController
public class CourseRestController {

	@GetMapping("/course-info")
	public ResponseEntity<Course> getCoureseInfo(){
		
		Course course = new Course(1, "Java", 2999.99);
		
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder
				.methodOn(CourseRestController.class).getAllCoureseInfo()).withRel("Get All Courses.");
		
		course.add(link);
		
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
	@GetMapping("/all-course")
	public ResponseEntity<List> getAllCoureseInfo(){
		
		Course course1 = new Course(1, "Java", 2999.99);
		Course course2 = new Course(2, "AWS", 4999.99);
		Course course3 = new Course(3, "DevOps", 3999.99);
		
		List<Course> list = new ArrayList<>();
		
		list.add(course1);
		list.add(course2);
		list.add(course3);
		
		return new ResponseEntity<List>(list, HttpStatus.OK);
	}
	
}
