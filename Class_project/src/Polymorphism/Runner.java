package Polymorphism;

public class Runner {

	public static void main(String[] args) {

	
		A obj1 = new A("Jack", 25);
		B obj2 = new B(10, "David", 45);
		C obj3 = new C();
		obj3.setName("Mike");
		obj3.setAge(25);
		obj1.printInfo();
		obj2.printInfo();
		obj3.printInfo();
		// up-casting is the idea of declaring and object of the parent class and
		// initializing any of the child classes
		A obj4 = new B();
		A obj5 = new C();
		Object obj6 = new A();
		Object obj7 = new B();
		int[] nums = new int[5];
		nums[0] = 50;
		Object[] variables = new Object[5];
		variables[0] = "test";
		variables[1] = 15;
		variables[2] = false;
		variables[3] = 15.89;
		variables[4] = new A();
		// assign name and age to the object A on the index 4 of this array ^^^^
		// we have to assign a new object of the class A to that index of the array with
		// values
		variables[4] = new A("david", 15);
		// Note: when you are performing up-casting - you can only access the members of
		// the variables that you declared / the parent.
//			for (int i = 0; i < variables.length; i++) {
//				System.out.println(variables[i]);
//			}

		A[] objsOfA = new A[5];
		objsOfA[0] = new A();
		objsOfA[1] = new A();
		objsOfA[2] = new A();
		objsOfA[3] = new A();
		objsOfA[4] = new A();

		objsOfA[0].setName("Ana");

		for (A a : objsOfA) {
			System.out.println(a);
		}
		String test = "someValue";
		StringBuilder x = new StringBuilder("some");
		StringBuffer y = new StringBuffer("Value");
		CharSequence z = new String("test");

		System.out.println(x);

		// -----------------------------------

		C obj10 = new C();
		// because it expects an object of class A,
		// you can pass an object of class A
		// Or and object of class B
		// or and object of class C
		//

		obj10.printOBJ(obj3);
	}

}
