package BankApplication;

import java.util.Scanner;

public class BankingApplication {

	int balance;
	int perviousTransaction;
	String customerName;
	String customerId;

	BankingApplication(String cname, String cid) {
		customerName = cname;
		customerId = cid;

	}

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			perviousTransaction = amount;

		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			perviousTransaction = amount;

		}
	}

	void getPerviousTransaction() {
		if (perviousTransaction > 0) {
			System.out.println("Deposited: " + perviousTransaction);

		} else if (perviousTransaction < 0) {
			System.out.println("Withdraw: " + Math.abs(perviousTransaction));

		} else {
			System.out.println("No Transaction Occured");
		}
	}

	void showMenu() {
		char option = '\0';
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Welcome: " + customerName);
		System.out.println("Your ID: " + customerId);
		System.out.println("\n");
		System.out.println("C : Check your Balance");
		System.out.println("D : Deposit");
		System.out.println("W : Withdraw");
		System.out.println("P : Previouse Transaction");
		System.out.println("E : Exit the system");

		do {
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("Enter you option");
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			option = Scanner.next().charAt(0);

			switch (option) {
			case 'C': // Check the Balance
				System.out.println("--------------------------------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("--------------------------------------------------------");
				break;

			case 'D': // Deposit the money
				System.out.println("--------------------------------------------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("--------------------------------------------------------");

				int amount = Scanner.nextInt();
				deposit(amount);
				break;

			case 'W': // Withdraw the money
				System.out.println("--------------------------------------------------------");
				System.out.println("Enter an amount to Wthdraw");
				System.out.println("--------------------------------------------------------");

				int amount2 = Scanner.nextInt();
				withdraw(amount2);
				break;

			case 'P': // Check the Previous Transaction
				System.out.println("--------------------------------------------------------");
				getPerviousTransaction();
				System.out.println("--------------------------------------------------------");

				break;
			case 'E': // Exit from the system
				System.out.println("====================================================");
				break;
			default:
				System.out.println("Invalid Option! Please Enter correct option");
				System.out.println("\n");
				break;

			}

		} while (option != 'E');
		System.out.println("Thank you for using our services........!!");

	}

}
