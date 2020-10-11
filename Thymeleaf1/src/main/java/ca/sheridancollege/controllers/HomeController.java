package ca.sheridancollege.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private String message = "Jonathan";
	private List<String> names = new ArrayList<String>();
	
	@GetMapping("/") //localhost:8080
	public String TestThymeleaf(Model model) {
		names.clear();
		names.add("Jon");
		names.add("Ann");
		names.add("Kim");
		names.add("Tom");
		names.add("Tod");
		names.add("Liz");
		
		for(String s : names) {
			System.out.println(s);
		}
		
		//for(object : collection of objects)
		
		//Attribute is a String, Object pair
		//The string is the name we use to refer to the object
		//The object is what we want to display
		
		model.addAttribute("myMessage", message);
		model.addAttribute("myList", names);
		
		return "thymetest.html";
	}
	
	@GetMapping("/test")
	public String sometest() {
		return null;
	}
}
