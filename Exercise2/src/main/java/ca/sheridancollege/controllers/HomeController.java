package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")  //URL -> localhost:8080
	public String goHome() {
		return "home.html";  //look in the src/main/resources/templates for home.html
	}
	
	@GetMapping("/name")  //URL -> localhost:8080/name
	public String goName() {
		return "name.html";
	}
	
	@GetMapping("/program")  //URL -> localhost:8080/program
	public String goProgram() {
		return "program.html";
	}
	
	@GetMapping("/school")  //URL -> localhost:8080/school
	public String goSchool() {
		return "school.html";
	}
}
