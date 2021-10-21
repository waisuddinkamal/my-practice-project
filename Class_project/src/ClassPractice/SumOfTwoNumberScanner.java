package ClassPractice;

import java.util.Scanner;

public class SumOfTwoNumberScanner {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);

		System.out.println("please inter the number");

		int firstnumber = Scanner.nextInt();
		System.out.println("inter second number");

		int secondNumber = Scanner.nextInt();
		
		Scanner.close();

		System.out.println("the sum of " + firstnumber + " and " + secondNumber + " is " + firstnumber + secondNumber);

	}

}
