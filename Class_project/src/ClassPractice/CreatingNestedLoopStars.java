package ClassPractice;

public class CreatingNestedLoopStars {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) { // outer l
			for (int p = 1; p <= i; p++) {
				System.out.print("*");

			}
			System.out.println();
		}
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}

