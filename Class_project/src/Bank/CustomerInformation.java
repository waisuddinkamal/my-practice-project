package Bank;

public class CustomerInformation {
	String firstname;
	String lastname;
	int age;
	double ssn;
	double dob;
	double phone;
	String email;
	String add;
	int checkigAccNumber;
	String checkingPass;
	double balance;

	public CustomerInformation() {
		firstname = "";
		lastname = "";
		age = 0;
		ssn = 0;
		phone = 0;
		email = "";
		add = "";
		checkigAccNumber = 0;
		checkingPass = "";
		balance = 0;
	}

	public CustomerInformation(String newFirstName, String newLastName, int newAge, double newSnn, double newDob,
			double newPhone, String newEmail, String newAdd, int newcheckigAccNumber, String newcheckingPass) {
		firstname = newFirstName;
		lastname = newLastName;
		age = newAge;
		ssn = newSnn;
		phone = newPhone;
		email = newEmail;
		add = newAdd;
		checkigAccNumber = newcheckigAccNumber;
		checkingPass = newcheckingPass;
		balance = 0;
	}

	public String toString() {

		return "****************************************************\n" + "Customer: " + firstname + " " + lastname
				+ ", SSN: " + ssn + "\n" + "Age: " + age + ", Date Of Birth: " + dob + "\n" + "Phone: " + phone
				+ ", Email: " + email + "\n" + add + "\n---------------------\n" + "Checking Account Number: "
				+ checkigAccNumber + ", Password: " + checkingPass + "\n" + "Current Balance: $" + balance
				+ "\n****************************************************\n";
	}

	public boolean deposit(double amount, String pass) {
		if (checkingPass.equals(pass)) {
			balance += amount;
			System.out.println("Deposit: The amount of $" + amount + " has been added to your account successfully!");

			return true;
		} else {
			System.out.println("Deposit: The password provided does not match. Deposit failed!");
			return false;
		}
	}

	public boolean withdraw(double amount, String pass) {
			if (checkingPass.equals(pass))
				if(amount >balance) {
					System.out.println("Withdraw: Amount requested $" + amount + " is more than you have available $"
							+ balance + ". Withdraw Failed!");
					return false;
				}else {
					
					double balBeforeDeduction = balance;
					balance -=amount;
					System.out.println("Withdraw: The amount of $" + amount + " has been deducted from your balance ($"
						+ balBeforeDeduction + "). Your Current Balnace is $" + balance);
					return true;
				}else {
					System.out.println("Withdraw: The password provided does not match. Withdraw failed!");
					return false;
					
				}
	
			
					
				
			}
}
