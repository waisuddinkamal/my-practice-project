package LoopsParactice;

public class Loop {

	public static void main(String[] args) {

		int k = 1;
		int j2 = k++;
		System.out.println("K value: " + k);
		System.out.println("J value: " + j2);
		System.out.println("============");

		int k4 = 1;
		int j5 = ++k;
		System.out.println("K value: " + k4);
		System.out.println("J value: " + j5);
		System.out.println("============");

		int k1 = 1;
		int j3 = k1--;
		System.out.println("K value: " + k1);
		System.out.println("J value: " + j3);
		System.out.println("============");

		int k2 = 1;
		int j4 = --k2;
		System.out.println("K value: " + k2);
		System.out.println("J value: " + j4);
		System.out.println("============");

		// integer reversing
		int number = 1234567890;
		int intRev = 0; // run loop until num becomes 0
		int digits = 0;
		while (number != 0) {
			// get last digit from num
			digits = number % 10;
			intRev = intRev * 10 + digits;
			// remove the last digit from num
			number /= 10;

		}
		System.out.print(intRev);
		System.out.println();
		System.out.println("-------------\n");

		// square patterns
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				System.out.print("* ");
			}
			System.out.println();

		}
		// Triangle patterns
		System.out.println("========================");
		int n1 = 5;
		for (int i1 = 1; i1 <= n1; i1++) {
			for (int j1 = 1; j1 <= i1; j1++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		// Flip Triangle patterns
		System.out.println("=====================");

		// Iteration from 1 to 5
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

		}
		// name reverse
		System.out.println("-------------------");
		String name = "kamal";
		int rev = name.length() - 1;
		while (rev >= 0) {
			System.out.print(name.charAt(rev--));

		}
		// Iteration number from 5 to 1
		System.out.println();
		System.out.println("------------------");
		int i3 = 5;
		while (i3 >= 0) {
			System.out.println(i3);
			i3--;
		}
		// name reveres by for loop
		System.out.println("----------------------");
		String name1 = "wais";
		for (int i4 = name1.length() - 1; i4 >= 0; i4--) {
			System.out.print(name1.charAt(i4));

		}
		// - number Iteration by for loop
		for (int i5 = 1; i5 >= -5; i5--) {
			System.out.println(i5);
		}
		// Iteration by even number
		System.out.println("===============");
		int i = 2;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("program exited");

	}

}
