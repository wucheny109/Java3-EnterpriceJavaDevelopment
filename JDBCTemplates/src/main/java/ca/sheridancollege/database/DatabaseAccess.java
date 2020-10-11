package ca.sheridancollege.database;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseAccess {

	@Autowired
	protected NamedParameterJdbcTemplate jdbc;
	
	public void addDrink() {
		String query = "INSERT INTO easy_drinks VALUES" +
				"('Jons Drink', 'peach nectar', 3, 'orange juice', 5, 'mix with ice')";
		jdbc.update(query, new HashMap());
	}
}
