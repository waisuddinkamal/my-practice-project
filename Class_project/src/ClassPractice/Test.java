package ClassPractice;

public class Test extends Test2{
	
	int a ;
	int b;
	
	
	
	void sum() {
		a = 10;
		b = 10;
		System.out.println(a+b);
	}
	void sum(int a, int b) {
		System.out.println(a+b);
		
		
	}
	void sum(int a , double b) {
		System.out.println(a+b);
		
		
	}
	void sum(double x , int y) {
		System.out.println(x+y);
		
	}
	
	void sum(int x , int y, int z) {
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.sum();
		obj.sum(10, 20);
		obj.sum(20, 10.5);
		obj.sum(10.5, 50);
		obj.sum(10, 60, 100);
	}
}

	

