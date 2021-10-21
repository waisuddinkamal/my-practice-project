package ClassPractice;

public class WileLoop_2 {

	public static void main(String[] args) {

		int x1 = 1;
		while (x1 <= 5) {
			System.out.println(x1++);

		}
		System.out.println("decrement:......................");
		int x2 = 5;
		while (x2 >= 1) {
			System.out.println(x2--);

		}
		System.out.println("................................");

		int x3 = 1;
		while (x3 <= 5) {
			System.out.print(x3++ + "\t");
		}

		System.out.println();
		System.out.println();
		int x4 = 5;
		while (x4 > 0) {
			System.out.print(x4-- + "\t");

		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");

		}
		System.out.println();
		System.out.println("------------------------------------------------------");

		for (char d = 'Z'; d >= 'A'; d--) {
			System.out.print(d + " ");

		}
	}
}
