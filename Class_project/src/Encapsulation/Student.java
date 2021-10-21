package Encapsulation;

public class Student {
	private String firstName;
	private String lastName;
	
	public Student () {
		firstName = "";
		lastName = "";
		
		
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public void setFistName(String firsttName) {
		this.firstName = firsttName;
	}
	
	public void setLastName(String lastName) {
		this.firstName = lastName;
	}
	// this keyword it
}
