package ClassPractice;

public class StarNestedLoop {

	public static void main(String[] args) {
		// i = 5
		// j = 0
//		*
//		* *
//		* * *
//		* * * *

		for (int w = 0; w < 3; w++) { // this loop runs 3 times - so this loop will print the arrow 3 times
			// ------------------------------------------- this is START of printing the
			// arrow
			for (int i = 1; i < 5; i++) { // Outer Loop - rows
				for (int j = 0; j < i; j++) { // Inner Loop - cols
					System.out.print("* ");
				}
				System.out.println();
			}
			for (int i = 5; i >= 0; i--) {
				for (int j = i; j > 0; j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
			// ------------------------------------------- this is END of printing the arrow
			System.out.println();
		}

		// ------------------------------------------- this is START of printing the
		// arrow
		for (int i = 1; i < 5; i++) { // Outer Loop - rows
			for (int j = 0; j < i; j++) { // Inner Loop - cols
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 5; i >= 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// ------------------------------------------- this is END of printing the arrow

	}

}
