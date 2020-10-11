package ca.sheridancollege.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.database.DatabaseAccess;

@Controller
public class HomeController {

	@Autowired
	private DatabaseAccess da;
	
	@GetMapping("/")
	public String goHome() {
		da.addDrink();
		return "home.html";
	}
}
