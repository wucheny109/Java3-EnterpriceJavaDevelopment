package ca.sheridancollege.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.sheridancollege.beans.Contact;
import ca.sheridancollege.storage.ContactStorage;


@Controller
public class HomeController {

	@Autowired
	private ContactStorage cs;
	
	@GetMapping("/")  //localhost:8080
	public String goHome(Model model) {
		model.addAttribute("contact", new Contact());
		return "NewContact.html";
	}

	@GetMapping("/add") // localhost:8080/add
	public String add(Model model, @ModelAttribute Contact contact) {
		cs.addContact(contact);
		model.addAttribute("contact", new Contact());
		return "NewContact.html";
	}
	
	@GetMapping("viewContacts") // localhost:8080/viewContacts
	public String viewContacts(Model model) {
		model.addAttribute("contacts", cs.getContacts());
		return "ViewContact.html";
	}
}
