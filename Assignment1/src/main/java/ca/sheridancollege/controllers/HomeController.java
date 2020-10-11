package ca.sheridancollege.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.beans.Contact;


@Controller
public class HomeController {

	public static ArrayList<Contact> contactList = new ArrayList<>();
	
	@GetMapping("/")  //localhost:8080
	public String goHome() {
		return "NewContact.html";
	}

	@GetMapping("/add") // localhost:8080/add
	public String add(@RequestParam String name, @RequestParam String phone, @RequestParam String address, @RequestParam String email) {
		
		Contact newContact = new Contact(name,phone,address,email);
		contactList.add(newContact);
		return "NewContact.html";
	}
	
	@GetMapping("viewContacts") // localhost:8080/viewContacts
	public String viewContacts() {
		for (Contact newC : contactList) {
			System.out.println(newC);
		}
		return "NewContact.html";
	}
}
