package Polymorphism;

public class C extends A {
	@Override
	public void printInfo() {
		System.out.print(" ");
		super.printInfo();
	}

	public void printOBJ(A obj) {
		System.out.println(obj);
	}
}
