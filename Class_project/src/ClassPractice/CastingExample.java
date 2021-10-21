package ClassPractice;

public class CastingExample {

	public static void main(String[] args) {
		double x = 10.9;
		int y = 5;

		System.out.println(x + y);

		double z = x / y;

		System.out.println(z);
		double x1 = 10 / 3;
		double x2 = 10 / 3.0;
		int x3 = 10 / 3;
		int x4 = (int) (10 / 3.0);

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);

	}

}
