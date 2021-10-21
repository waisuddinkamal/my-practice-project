package ClassPractice;

public class ThisAndSupper {

}

class A {

	void m1() {
		System.out.println("i am in class A");

	}

	class B1 extends A {

		void m1() {
			System.out.println("i am in calss B");
		}
		
		void show () {
			m1();
			super.m1();
		}
	}

}
