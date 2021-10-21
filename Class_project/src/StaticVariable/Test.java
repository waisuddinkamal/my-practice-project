package StaticVariable;

public class Test {

	String name;
	int id;
	static String company = "TEK";

	public Test() {
		super();
		name = " ";
		id = 0;
		

	}

	public Test(String name, int id) {
		this();
		this.name = name;
		this.id = id;
		

	}

	public String toString() {
		return "Name: " + name + " id " + id + " Company: " + company;
	}
	
	


	public static void main(String[] args) {
		Test obj1 = new Test("Ahamd",1);
		Test obj2 = new Test("mahmod",2);
		Test obj3 = new Test("Ramiz jan",3);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		
	}

}
