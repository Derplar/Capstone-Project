package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//Just denotes this class as a service (If you're wondering, it doesn't really mean much)
@Service
public class CoursesHardcodedService {

  private static List<Course> courses = new ArrayList<>();
  private static long idCounter = 0;

  //This is basically instantiated immediately, so that this class always contains this.
  static 
  {
    courses.add(new Course(++idCounter, "Java", "Deploy the 1st Java"));
    courses.add(new Course(++idCounter, "React", "Deploy the 1st React"));
    courses.add(new Course(++idCounter, "Java", "Deploy the 2nd Java"));
    courses.add(new Course(++idCounter, "React", "Deploy the 2nd React"));
  }
  
  //Gets whatever is in courses.
  public List<Course> findAll() {
	    return courses;
	  }
}
