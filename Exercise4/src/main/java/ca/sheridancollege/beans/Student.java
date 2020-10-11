package ca.sheridancollege.beans;

import lombok.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student implements Serializable {
	

	private static final long serialVersionUID = -6889820797550147871L;
	
	private String name;
	private int id;
	private List<String> courses;
	
	private boolean isCoop;
	private boolean isFulltime;
	private boolean isPaid;
	
	
	public String toString() {
		return "Student [Name=" + name + ", ID=" + id + ", Courses=" + courses + ", isCoop=" + isCoop + ", isFulltime="
				+ isFulltime + ", isPaid=" + isPaid + "]";
	}
	
	
}
