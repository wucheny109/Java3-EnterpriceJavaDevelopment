package ca.sheridancollege.beans;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Contact implements java.io.Serializable{


	private static final long serialVersionUID = 3951291594705609896L;
	private String name;
	private String phone;
	private String address;
	private String email;

}
