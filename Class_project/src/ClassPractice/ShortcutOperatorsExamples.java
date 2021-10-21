package ClassPractice;

public class ShortcutOperatorsExamples {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x * 5);
		x = 5;
		System.out.println(x + 1);
		System.out.println(x);
		System.out.println("*************************");
		int w = 5;
		int e = 10;
		w = e;
		e = w;
		System.out.println(10 + e);
		System.out.println("*************************");
		int x1 = 5;
		double y = 2.0;
		int z = 3;
		double j = x1 / y + z;
		x1 = (int) j + z;
		y = z * x1;
		System.out.println("The end value of x: " + x1);
		System.out.println("The end value of y: " + y);
		System.out.println("The end value of z: " + z);
		System.out.println("The end value of j: " + j);

	}

}
