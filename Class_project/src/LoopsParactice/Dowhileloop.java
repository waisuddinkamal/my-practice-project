package LoopsParactice;

public class Dowhileloop {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);

		System.out.println("+++++++++++++");

		int i1 = 10;
		do {
			System.out.println(i1);
			i1--;
		} while (i1 >= 1);

		System.out.println("++++++++++++++++");
		// at last one time running the loop even the condition is false
		int i2 = 10;
		do {
			System.out.println(i2);
			i2++;
		} while (i2 >= 20);

	}
}
