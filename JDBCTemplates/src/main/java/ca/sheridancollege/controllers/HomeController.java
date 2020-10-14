package ca.sheridancollege.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.beans.Drink;
import ca.sheridancollege.database.DatabaseAccess;

@Controller
public class HomeController {

	@Autowired
	private DatabaseAccess da;
	
	@GetMapping("/")
	public String goHome() {
		//da.addDrink();
		Drink d = new Drink("Jons Drink", "Orange Juice", 2.3, "Lemon Juice", 0.5, "Mix with Ice");
		da.addDrink(d);
		return "home.html";
	}
	
	@GetMapping("/view")
	public String viewDrink() {
		//da.addDrink();
		ArrayList<Drink> drinks = da.getDrinks2();
		for (Drink d : drinks) {
			System.out.println(d);
		}
		return "home.html";
	}
}
