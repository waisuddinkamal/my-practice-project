package Review;

public class ClassReview {

	private String firstName;
	private String lastName;
	private int age;

	public ClassReview() {
		super();
		this.firstName = "";
		this.lastName = "";
		this.age = 0;

	}

	public ClassReview(String firstName, String lastName, int age) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

	}

	public String getFirstName() {
		return firstName;

	}

	public String getlastName() {
		return lastName;

	}

	public int getAge() {
		return age;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public void setLastName(String lastName) {
		this.firstName = lastName;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(ClassReview obj) {

		if (this.firstName.equals(obj.firstName)) {
			if (this.lastName.equals(obj.lastName)) {
				if (this.age == obj.age) {
					System.out.println("Equals Example");
					return true;
				}
			}

		}
		return false;
	}

	public String toString() {
		return "First Name: " + firstName + " LastName: " + lastName + " Age: " + age;
	}

}
