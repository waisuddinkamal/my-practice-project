package ClassPractice;

public class Multiplication_Table_ForLoop {

	public static void main(String[] args) {

		// Program to Print Multiplication Table
		String s = "Multiplication Table:";
		System.out.println(s);
		System.out.println("|```````````````````|");
		int t = 2;
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("     "+i + " * " + t + " = " + t * i);
		}

	}

}
