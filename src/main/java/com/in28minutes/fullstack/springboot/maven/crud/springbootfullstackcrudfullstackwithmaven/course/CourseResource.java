package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//This is telling the REACT origin, which will probably be redefined when on the server.
//For now though, the REACT server is on port 3000 and on localhost.
@CrossOrigin(origins = { "http://localhost:3000"})
//Defines that this class is in fact REST.
@RestController
public class CourseResource {

  //This is basically saying "Hey!  Auto start this."
  //So even though this isn't instantiated, it's automatically started.
  @Autowired
  private CoursesHardcodedService courseManagementService;

  //A GET function.  The {} mapping denotes that the path variable is defined on the other end.
  //The mapping is equal to the full path sent by the axios line in the xxxDataService files.
  //The @PathVariable is passing in the stuff from the mapping above.
  //When you return, it automatically takes the object(Or list/array/whatever) and converts it to a JSON format.
  @GetMapping("/instructors/{username}/{courses}")
  public List<Course> getCourse(@PathVariable String username, @PathVariable String courses) 
  {
	  System.out.println(username + ' ' + courses);
	  return courseManagementService.findAll();
  }

  //A POST function.  The POST and GET differences are still present.  Beware.
  @PostMapping("/buttonz")
  //There also exists a @RequestBody parameter if you want to pass something else into the Java code.
  //There is a mirror of below in ButtonDataService
  //public String getButton (@RequestBody int id)
  public String getButton() 
  {
	  return "Life, at any cost!";
	  //return courseManagementService.findById(id);
  }

}
