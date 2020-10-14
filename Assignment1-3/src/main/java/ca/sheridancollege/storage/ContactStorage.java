package ca.sheridancollege.storage;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.beans.Contact;

@Repository
public class ContactStorage {
	
	@Autowired
	protected NamedParameterJdbcTemplate jdbc;
	public void addContact() {
		String query = "INSERT INTO easy_contacts VALUES" +
				"('Jason', 132115486, 'McLaughlin Road', 'jason@sheridan.ca')";
		jdbc.update(query, new HashMap());
	}
	
	public void addContact(Contact contact) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String query = "INSERT INTO easy_contacts VALUES (:name, :phone, :address, :email)";
		parameters.addValue("name", contact.getName());
		parameters.addValue("phone", contact.getPhone());
		parameters.addValue("address", contact.getAddress());
		parameters.addValue("email", contact.getEmail());
		jdbc.update(query, parameters);
	}
	
	
	public ArrayList<Contact> getContacts(){
		String query = "SELECT * FROM EASY_CONTACTS";
		ArrayList<Contact> contacts = (ArrayList<Contact>)jdbc.query(query, 
				new BeanPropertyRowMapper<Contact>(Contact.class));
		
		return contacts;
	}
	
}
