package ca.sheridancollege.beans;

import java.io.Serializable;

//Requirements for a Java Bean
//-Zero Argument Constructor
//-Fields are private and accessed through getters/setters/constructors
//-Implements Serializable

public class Student implements Serializable {


	private static final long serialVersionUID = 923010487751246063L;
	
	private String name;
	private int id;
	private double grade;

	
	public Student(String name, int id, double grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
		
	}
	public Student() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name +", id=" + id +", grade=" + grade + "]";
	}
	
	
}
