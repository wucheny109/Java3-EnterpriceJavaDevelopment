package ca.sheridancollege.beans;

public class Contact {

	private String name;
	private String phone;
	private String address;
	private String email;
	public Contact() {
	}
	public Contact(String name, String phone, String address, String email) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [Name:" + name + ", Phone Number:" + phone + ", address:" + address + ", Email:" + email + "]";
	}
	
}
