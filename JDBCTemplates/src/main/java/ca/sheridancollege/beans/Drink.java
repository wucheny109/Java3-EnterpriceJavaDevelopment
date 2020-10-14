package ca.sheridancollege.beans;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Drink implements java.io.Serializable{

	private static final long serialVersionUID = -2088048753500001504L;
	private String name;
	private String main;
	private double amount1;
	private String second;
	private double amount2;
	private String directions;
	
}
