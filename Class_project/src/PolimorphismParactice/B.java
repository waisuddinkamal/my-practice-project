package PolimorphismParactice;

public class B extends A {

	int id;
	char gender;

	public B() {
		super();
		id = 0;
		gender = ' ';

	}

	public B(int id, char gender) {
		super();
		this.id = id;
		this.gender = gender;

	}

	public void setId(int id) {
		this.id = id;

	}

	public void setGender(char gender) {
		this.gender = gender;

	}

	public int getId() {
		return id;
	}

	public char gender() {
		return gender;
	}
	
	public String toString() {
		
		return "ID: " + id + " Gender: " + gender;
		
	}

}
