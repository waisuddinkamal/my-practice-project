package ClassPractice;

public class StaticVarible {

	public static void main(String[] args) {
		StaticVarible obj1 = new StaticVarible(101, "kamal", "TEK");
		StaticVarible obj2 = new StaticVarible(102, "ramez", "TEK");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println("==============");
		obj1.display();
		java();
		// class name + ojb name + = + new keyword+ class name();
		// access m + specifier + return + method name +(list of parameter ){

		String str = "this is my jav code";

	}

	int id;
	String name;
	static String company;

	public StaticVarible() {
		id = 0;
		name = "";
		company = "";

	}

	public static void test() {

	}

	public StaticVarible(int id, String name, String company) {
		this.id = id;
		this.name = name;
		this.company = company;

	}

	@Override
	public String toString() {
		return " ID: " + id + "Name: " + name + " Company: " + company;
	}

	public void display() {
		System.out.println(" ID: " + id + " Name: " + name + " Company: " + company);
	}

	public static void java() {
		int a = 10;
		System.out.println("java code");

	}

}
