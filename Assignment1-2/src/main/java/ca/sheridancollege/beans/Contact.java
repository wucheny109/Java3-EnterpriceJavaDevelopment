package ca.sheridancollege.beans;
import lombok.*;

@NoArgsConstructor

@Data

public class Contact implements java.io.Serializable{


	private static final long serialVersionUID = 3951291594705609896L;
	private String name;
	private String phone;
	private String address;
	private String email;

	public Contact(String name, String phone, String address, String email) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	
}
