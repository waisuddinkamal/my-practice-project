package PolimorphismParactice;

public class A {

	String firstName;
	String lastName;
	int age;

	public A() {
		super();
		firstName = "";
		lastName = "";
		age = 0;

	}

	public A(String firstName, String lastName, int age) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;

	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + " Last Name: " + lastName + " Age: " + age;

	}

}
