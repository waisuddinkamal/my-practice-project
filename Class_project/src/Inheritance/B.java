package Inheritance;

public class B extends A {

	private String address;
	private int phone;
	private char gender;
	private String email;

	public B() {
		this.address = "";
		this.phone = 0;
		this.gender = '\0';
		this.email = "";

	}

	public B(String name, int phone, char gender, String email) {
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.email = email;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
