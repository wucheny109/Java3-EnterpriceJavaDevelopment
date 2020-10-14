package ca.sheridancollege.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.sheridancollege.beans.Drink;
import ca.sheridancollege.database.DatabaseAccess;


@Controller
public class HomeController {

	@Autowired
	private DatabaseAccess da;
	
	@GetMapping("/")
	public String goAddPage(Model model) {
		model.addAttribute("drink", new Drink());
		return "addDrink.html";
	}
	
	@GetMapping("/addDrink")
	public String addGame(Model model, @ModelAttribute Drink drink) {
		da.addDrink(drink);
		model.addAttribute("drink", new Drink());
		return "addDrink.html";
	}
	
	@GetMapping("/view")
	public String viewDrink(Model model) {
		//da.addDrink();
		model.addAttribute("drinks", da.getDrinks2());
//		ArrayList<Drink> drinks = da.getDrinks2();
		for (Drink d : da.getDrinks2()) {
			System.out.println(d);
		}
		return "viewDrinks.html";
	}
}
