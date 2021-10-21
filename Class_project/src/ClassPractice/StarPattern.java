package ClassPractice;

public class StarPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int p = 1; p <= i; p++) {
				System.out.print("*");
			}

			System.out.println();

		}

		System.out.println("--------------------------");
		for (int p = 1; p <= 7; p++) {
			for (int k = 7; k >= p; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// full Triangle star for loop
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int z = 2; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
