package ca.sheridancollege.database;

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

import ca.sheridancollege.beans.Drink;

@Repository
public class DatabaseAccess {

	@Autowired
	protected NamedParameterJdbcTemplate jdbc;
	
	public void addDrink() {
		String query = "INSERT INTO easy_drinks VALUES" +
				"('Jons Drink', 'peach nectar', 3, 'orange juice', 5, 'mix with ice')";
		jdbc.update(query, new HashMap());
	}
	
	public void addDrink(Drink drink) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String query = "INSERT INTO easy_drinks VALUES (:name, :main, :a1, :sec, :a2, :dir)";
		parameters.addValue("name", drink.getDrink_name());
		parameters.addValue("main", drink.getMain());
		parameters.addValue("a1", drink.getAmount1());
		parameters.addValue("sec", drink.getSecond());
		parameters.addValue("a2", drink.getAmount2());
		parameters.addValue("dir", drink.getDirections());
		jdbc.update(query, parameters);
	}
	
	
	public ArrayList<Drink> getDrinks(){
		ArrayList<Drink> drinks = new ArrayList<Drink>();
		String query = "SELECT * FROM EASY_DRINKS";
		List<Map<String,Object>> rows = jdbc.queryForList(query, new HashMap<String,Object>());
		for (Map<String,Object> row : rows) {
			Drink d = new Drink();
			d.setDrink_name((String)row.get("drink_name"));
			d.setDrink_name((String)row.get("main"));
			d.setAmount1(((BigDecimal)row.get("amount1")).doubleValue());
			d.setSecond((String)row.get("second"));
			d.setAmount2((Double)row.get("amount2"));
			d.setDirections((String)row.get("directions"));
			drinks.add(d);
		}
		
		return drinks;
	}
	
	public ArrayList<Drink> getDrinks2(){
		String query = "SELECT * FROM EASY_DRINKS";
		ArrayList<Drink> drinks = (ArrayList<Drink>)jdbc.query(query, 
				new BeanPropertyRowMapper<Drink>(Drink.class));
		
		return drinks;
	}
}
