package ClassAndobject;

public class ConstructorOverLoading {

	int a = 0;
	int b = 0;
	double c = 0;

	ConstructorOverLoading() {
		a = 10;
		b = 20;
		c = 10.5;

	}

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	ConstructorOverLoading(int x, int y) {
		a = x;
		b = y;

	}

	ConstructorOverLoading(int x, double y) {
		a = x;
		c = y;

	}

	ConstructorOverLoading(int x, int y, double z) {
		a = x;
		b = y;
		c = z;
	}

	ConstructorOverLoading(int x, double y, int z) {
		a = x;
		b = z;
		c = y;

	}

	public static void main(String[] args) {

		ConstructorOverLoading co = new ConstructorOverLoading();
		co.display();

		ConstructorOverLoading co1 = new ConstructorOverLoading(10, 20);
		System.out.println("-------");
		co1.display();

		ConstructorOverLoading co2 = new ConstructorOverLoading(10, 20.5);
		System.out.println("-------");
		co2.display();

		ConstructorOverLoading co3 = new ConstructorOverLoading(10, 20, 10.5);
		System.out.println("-------");
		co3.display();

		ConstructorOverLoading co4 = new ConstructorOverLoading(10, 10.5, 20);
		System.out.println("-------");
		co4.display();

		// we can make overload the main method
		// have to change the parameter like this
		// public static void main(int a ,int b)

	}

}
