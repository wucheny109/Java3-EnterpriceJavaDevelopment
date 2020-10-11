package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String processInfo(@RequestParam String name, @RequestParam String id, @RequestParam String c1,
			@RequestParam String c2, @RequestParam String c3, @RequestParam String c4,
			@RequestParam(required=false) boolean chb1,
			@RequestParam(required=false) boolean chb2, 
			@RequestParam(required=false) boolean chb3) {
		System.out.println("Student Name:" + name);
		System.out.println("Student ID:" + id);
		System.out.println("Course1: " + c1);
		System.out.println("Course2: " + c2);
		System.out.println("Course3: " + c3);
		System.out.println("Course4: " + c4);
		System.out.println("Co-op: " + chb1);
		System.out.println("Full time student: " + chb2);
		System.out.println("Paid tuition: " + chb3);
		return "success.html";
	}
}
