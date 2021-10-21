package InterviewQuestuon;

public class Swap_integers_without_using_third_variable {

	public static void main(String[] args) {
		// Swap two integers with using temporary/third variable
		// expected value for X=10 and for Y=5
		int x = 5;
		int y = 10;
		int t;

		t = x; // 5
		x = y; // 10
		y = t; // 5
		System.out.println("The X Value: " + x);
		System.out.println("The Y value: " + y);

		// Swap two integers without using temporary/third variable==> using + and -
		// operator
		System.out.println("<================>");
		int x1 = 5;
		int y1 = 10;
		
		x1 = x1 + y1; // 15
		y1 = x1 - y1; // 5
		x1 = x1 - y1; // 10
		System.out.println("The X Value: " + x1);
		System.out.println("The Y value: " + y1);

		// Swap two integers without using temporary/third variable==> using * operator
		System.out.println("<================>");
		int x2 = 5;
		int y2 = 10;

		x2 = x2 * y2; // 50
		y2 = x2 / y2; // 5
		x2 = x2 / y2; // 10
		System.out.println("The X Value: " + x2);
		System.out.println("The Y value: " + y2);

		// Swap two integers without using temporary/third variable==> using XOR ^
		// operator
		System.out.println("<================>");
		int x3 = 5;
		int y3 = 10;

		x3 = x3 ^ y3; // --> 1111
		y3 = x3 ^ y3; // --> 1010
		x3 = x3 ^ y3; // --> 0101
		System.out.println("The X Value: " + x3);
		System.out.println("The Y value: " + y3);
	}

}
