package ClassReview_9_2_2021;

public class Employee {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String dob;

	public Employee() {
		super();
		this.firstName = "";
		this.lastName = "";
		this.userName = "";
		this.password = "";
		this.dob = "";
	}

	public Employee(String firstName, String lastName, String userName, String password, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password="
				+ password + ", dob=" + dob + "]";
	}

}
