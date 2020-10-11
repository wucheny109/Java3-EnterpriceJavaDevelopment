package ca.sheridancollege.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.beans.Student;

@Controller
public class HomeController {
	
	@GetMapping("/")  //localhost:8080
	public String goHome() {
		return "addStudent.html";
	}

	@GetMapping("/add") // localhost:8080/add
	public String add(@RequestParam String name, @RequestParam int id, @RequestParam double grade) {
		Student student = new Student(name, id, grade);
		System.out.println(student);
		return "addStudent.html";
	}
	
}
