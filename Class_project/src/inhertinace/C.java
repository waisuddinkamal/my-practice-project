package inhertinace;

public class C extends B{

	public static void main(String[] args) {
		System.out.println("======= A class =========");
		A obj = new A();
		obj.show();
		B obj1 = new B ();
		System.out.println("===== B class ======");
		obj1.print();
		obj1.show();
		C obj2 = new C();
		System.out.println("======== C calss =========");
		obj2.show();
		obj2.print();
		obj2.show1();
		

	}
	public void show1() {
		System.out.println("this is C class");
	}

}
