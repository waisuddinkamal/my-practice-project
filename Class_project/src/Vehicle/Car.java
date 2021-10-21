package Vehicle;

public class Car extends Vehicle {
	void showInfo(){
		System.out.println("car info");
	}

	@Override
	void Strart() {
		System.out.println("abstract method");
		
	}

	@Override
	public int sum() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		return a+b;
	}
	
}
