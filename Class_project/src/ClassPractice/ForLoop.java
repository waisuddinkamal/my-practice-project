package ClassPractice;

public class ForLoop {

	public static void main(String[] args) {

////		for (int i = 1; i <= 5; i++) {
////			for (int j = 1; j <= i; j++) {
////
////				System.out.print("*");
////			}
////			System.out.println();
//
//		}
		System.out.println("-----------------------");

		for (int L = 1; L <= 5; L++) {
			for (int e = 5; e >= L; e--) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 10; i >= 0; i--) {
				System.out.println(i);

			}

			for (int r = 0; r <= 10; r++) {
				System.out.println(r);
			}
			System.out.println("-----------------------");
			for (int j = 0; j <= 17; j += 3) {
				System.out.println(j);
			}

			System.out.println("-----------------------");

			for (int i = 0; i <= 100; i++) {
				if (i % 2 == 0) {

					System.out.println(i + " is Even");

				} else
					System.out.println(i + " is odd ");

				// i want to loop 1 - 100
				// if the number is divisible by 3 print TEK
				// if the number is divisible by 5 print School
				// if the number is divisible by 3 and 5 print TEK School
				// if not divisible by 3 or 5 then print the number
			}

			for (int i = 0; i <= 100; i++) {
				if (i % 5 == 0 && i % 3 == 0) {
					System.out.println(i + " is Divisible by 5 and by 3");
				} else if (i % 5 == 0) {
					System.out.println(i + " is divisible by 5 and by 3");
				} else if (i % 3 == 0) {
					System.out.println(i + " is divisible by by 3");
				} else {
					System.out.println(i);

				}
				System.out.println("*********************************************************************");
				for (int k = 0; k <= 100; k++) {
					if (k % 3 == 0) {
						System.out.println("TEK: "+k);

					} else if (k % 5 == 0) {
						System.out.println("School: "+k);

					} else if ((k % 3 == 0 && k % 5 == 0)) {
						System.out.println("TEK school: "+k);

					} else if (k%3!=0 && k%5!=0) {
						System.out.println(k+ "condationis not match");
					}

				}

			}
		}
	}
}
