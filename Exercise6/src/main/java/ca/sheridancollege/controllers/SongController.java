package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.sheridancollege.beans.Song;
import ca.sheridancollege.storage.SongStorage;



@Controller
public class SongController {

	@GetMapping("/")
	public String goAddPage(Model model) {
		model.addAttribute("song", new Song());
		return "addSong.html";
	}
	
	@GetMapping("/addSong")
	public String addGame(Model model, @ModelAttribute Song song) {
		SongStorage.songs.add(song);
		
		model.addAttribute("song", new Song());
		return "addSong.html";
	}
	
	@GetMapping("/view")
	public String viewGames(Model model) {
		model.addAttribute("songs", SongStorage.songs);
		return "viewSongs.html";
	}
}
