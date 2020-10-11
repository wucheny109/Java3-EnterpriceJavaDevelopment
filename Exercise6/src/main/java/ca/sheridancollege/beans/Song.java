package ca.sheridancollege.beans;
import lombok.*;


@NoArgsConstructor
@Data
public class Song implements java.io.Serializable{

	private static final long serialVersionUID = 2348019854863043132L;
	private String title;
	private String artist;
	private String genre;
	private double runtime;
	
	private String[] genres = {"Jazz", "Hip-Hop", "R&B", "Pop", "Country"};

	public Song(String title, String artist, String genre, double runtime, String[] genres) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.runtime = runtime;
		this.genres = genres;
	}
	
	
}
