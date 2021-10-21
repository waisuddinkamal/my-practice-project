package ClassPractice;

public class Test2 {
	int a;
	String b;

	public Test2() {
		super();
		this.a = 0;
		this.b = "";

	}

	public Test2(int a, String b) {
		this();
		this.a = a;
		this.b = b;

	}

	void show(int a, String b) {

	}

	public String toString() {
		return " A value: " + a + "B Value :" + b;
		
	}

}
