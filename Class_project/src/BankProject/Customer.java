package BankProject;

public class Customer {

	// personal Info
	String firstName;
	String lastName;
	int age;
	int ssn;
	String dob;
	int phone;
	String email;
	// we need address
	Address add;
	// checking account number and password
	int checkingAccNum;
	String checkingPass;
	// balance
	double balance;

	// default constructor
	public Customer() {
		firstName = "";
		lastName = "";
		age = 0;
		ssn = 0;
		dob = "";
		phone = 0;
		email = "";
		add = new Address();
		// checking account # and pass
		checkingPass = "";
		checkingAccNum = 0;
		balance = 0;
	}

	// Parameterized constructor
	public Customer(String newFirstName, String newLastName, int newAge, int newSSN, String newDOB, int phoneNumber,
			String newEmail, Address newAdd, String newAccountPass, int newCheckingAccNum) {
		firstName = newFirstName;
		lastName = newLastName;
		age = newAge;
		ssn = newSSN;
		dob = newDOB;
		phone = phoneNumber;
		email = newEmail;
		add = newAdd;
		// checking account # and pass
		checkingPass = newAccountPass;
		checkingAccNum = newCheckingAccNum;
		balance = 0;
	}

	// toString method so we can print the values of the a customer object the way
	// we want
	public String toString() {
		// 123-12-1234
		String strSSN = "" + ssn;
		// 101224444
		// 012345678
		String formattedSSN = strSSN.substring(0, 3) + "-" + strSSN.substring(3, 5) + "-" + strSSN.substring(5, 9);
		String strPhone = "" + phone;
		// 2027546585
		// 0123456789
		String formattedPhone = "+1 (" + strPhone.substring(0, 3) + ")" + strPhone.substring(3, 6) + "-"
				+ strPhone.substring(6, 10);
		return "****************************************************\n" + "Customer: " + firstName + " " + lastName
				+ ", SSN: " + formattedSSN + "\n" + "Age: " + age + ", Date Of Birth: " + dob + "\n" + "Phone: "
				+ formattedPhone + ", Email: " + email + "\n" + add + "\n---------------------\n"
				+ "Checking Account Number: " + checkingAccNum + ", Password: " + checkingPass + "\n"
				+ "Current Balance: $" + balance + "\n****************************************************\n";
	}

	// create a method deposit that will add some balance to the user
	public boolean deposit(double amount, String pass) {
		// lets compare the pass and see if it matches user pass
		if (checkingPass.equals(pass)) {
			// the password matches and we want perform the deposit
			balance += amount;
			System.out.println("Deposit: The amount of $" + amount + " has been added to your account successfully!");
			return true;
		} else {
			// the password provided does not match user pass
			System.out.println("Deposit: The password provided does not match. Deposit failed!");
			return false;
		}
	}

	// create a method withdraw that will deduct some balance from the user
	public boolean withdraw(double amount, String pass) {
		// lets compare the pass and see if it matches user pass
		if (checkingPass.equals(pass)) {
			// the password matches and we want perform the withdraw
			if (amount > balance) {
				// we are trying to withdraw more than what we have
				System.out.println("Withdraw: Amount requested $" + amount + " is more than you have available $"
						+ balance + ". Withdraw Failed!");
				return false;
			} else {
				// the amount requested is less than or equal to the balance we have available
				double balBeforeDeduction = balance;
				balance -= amount;
				System.out.println("Withdraw: The amount of $" + amount + " has been deducted from your balance ($"
						+ balBeforeDeduction + "). Your Current Balnace is $" + balance);
				return true;
			}
		} else {
			// the password provided does not match user pass
			System.out.println("Withdraw: The password provided does not match. Withdraw failed!");
			return false;

		}
	}
}
