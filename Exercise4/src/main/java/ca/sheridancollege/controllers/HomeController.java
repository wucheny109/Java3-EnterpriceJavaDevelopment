package ca.sheridancollege.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.beans.Student;
import ca.sheridancollege.database.StudentStorage;

@Controller
public class HomeController {

	@GetMapping("/")  //localhost:8080
	public String goHome() {
		return "home.html";
	}
	
	@GetMapping("/login")  //localhost:8080/login
	public String goLogin() {
		return "login.html";
	}
	
	@GetMapping("/submission")  //localhost:8080/submission
	public String processLogin(@RequestParam String user, @RequestParam String pass) {
		if (user.equals("Chenyu") && pass.equals("password")) {
			return "success.html";
		}else {
			return "fail.html";
		}
	}
	
	@GetMapping("/information") //localhost:8080/information
	public String processInfo(@RequestParam String name, @RequestParam String id, 
			@RequestParam String c1, @RequestParam String c2, 
			@RequestParam String c3, @RequestParam String c4,
			@RequestParam(required=false) boolean isCoop,
			@RequestParam(required=false) boolean isFulltime, 
			@RequestParam(required=false) boolean isPaid) {
		List<String> courses = new ArrayList<>();
		if(!c1.equals("")) {
			courses.add(c1);
		}
		if(!c2.equals("")) {
			courses.add(c2);
		}
		if(!c3.equals("")) {
			courses.add(c3);
		}
		if(!c4.equals("")) {
			courses.add(c4);
		}
		
		int studentId = Integer.parseInt(id);
		Student student = new Student(name, studentId, courses, isCoop, isFulltime, isPaid);
		StudentStorage.students.add(student);
		return "success.html";
	}
	
	@GetMapping("/viewStudents") //localhost:8080/viewStudent
	public String viewStudents() {
		for (Student newS : StudentStorage.students) {
			System.out.println(newS);
		}
		return "success.html";
	}
}
