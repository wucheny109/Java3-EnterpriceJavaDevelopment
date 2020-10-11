package ca.sheridancollege.beans;

import lombok.*;


@NoArgsConstructor

@Data
public class VideoGame implements java.io.Serializable{

	
	private static final long serialVersionUID = -7495212678164818571L;
	private int isbn;
	private String name;
	private double price;
	private String producer;
	private String category;
	
	private String[] categories = {"Strategy", "FPS", "Action", "RPG", "Horror"};

	public VideoGame(int isbn, String name, double price, String producer, String category, String[] categories) {
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.producer = producer;
		this.category = category;
		this.categories = categories;
	}
	
	
}
