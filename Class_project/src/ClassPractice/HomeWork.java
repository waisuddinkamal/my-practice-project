package ClassPractice;

public class HomeWork {

	public static void main(String[] args) {
		// i want to loop 1 - 100
		// if the number is divisible by 3 print TEK
		// if the number is divisible by 5 print School
		// if the number is divisible by 3 and 5 print TEK School
		// if not divisible by 3 or 5 then print the number

		for (int k = 1; k <= 100; k++) {
			if (k % 3 == 0 && k % 5 == 0) {
				System.out.print("TEK School: " + k + " ===========> The Number is Even");

			} else if (k % 5 == 0) {

				System.out.println("TEK: " + k + " ===========> The Number is Even");

			} else if (k % 3 == 0) {
				System.out.println("School: " + k + " ========> The Number is Odd");

			} else if (k % 3 != 0 && k % 5 != 5) {
				System.out.println(k);
			}
			
		int x = 1;
		x = x %10;
		System.out.println(x);
				

		}

	}
}
