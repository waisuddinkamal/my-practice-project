package ClassPractice;

public class temp {
	int a;
	int b;
	double c;

	temp() {
		a = 10;
		b = 20;
		c = 10.5;

	}

	temp(int x, int y) {
		a = x;
		b = y;
	}

	temp(int x, double y) {
		a = x;
		c = y;
	}

	temp(int x, int y, int z) {
		a = x;
		b = y;
		c = z;

	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
	public static void main(String[] args) {
		temp obj = new temp(30,20,40);
		obj.display();
		
	}

}
