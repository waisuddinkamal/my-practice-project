package ClassAndobject;

public class MethodOverLoading {

	int a = 10;
	int b = 20;

	void sum() {
		System.out.println(a + b);
	}

	void sum(int x, int y) {
		System.out.println(x + y);
	}

	void sum(int x, int y, int z) {
		System.out.println(x + y + z);

	}

	void sum(int x, double y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		MethodOverLoading mo = new MethodOverLoading ();
		mo.sum();
		mo.sum(100, 200);
		mo.sum(100, 200, 300);
		mo.sum(100, 200.5);
		
		
	}

}
