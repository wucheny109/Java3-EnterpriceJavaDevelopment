package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeowController {

	@GetMapping("/meow")  //URL -> localhost:8080/meow
	public String goMeow() {
		return "meow.html";
	}
	
	@GetMapping("/test")  //URL -> localhost:8080/test
	public String goTest() {
		return "meow.html";
	}
}
