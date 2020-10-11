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
	public String processLogin(@RequestParam String user, @RequestParam String pass,
			@RequestParam(required=false, defaultValue="-1") int id) {
		//int idval = Integer.parseInt(id);
		System.out.println("ID value is:"+id);
		System.out.println("User value is:"+user);
		System.out.println("Pass value is:"+pass);
		return "home.html";
	}
	
	
}
