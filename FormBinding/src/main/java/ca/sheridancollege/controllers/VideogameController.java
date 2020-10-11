package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.sheridancollege.beans.VideoGame;
import ca.sheridancollege.storage.VideoGameStorage;

@Controller
public class VideogameController {

	@GetMapping("/")
	public String goAddPage(Model model) {
		model.addAttribute("videoGame", new VideoGame());
		return "addGame.html";
	}
	
	@GetMapping("/addGame")
	public String addGame(Model model, @ModelAttribute VideoGame videoGame) {
		//System.out.println(videoGame.toString());
		VideoGameStorage.games.add(videoGame);
		
		model.addAttribute("videoGame", new VideoGame());
		return "addGame.html";
	}
	
	@GetMapping("/view")
	public String viewGames(Model model) {
		model.addAttribute("games", VideoGameStorage.games);
		return "viewGames.html";
	}
}
