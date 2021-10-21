package Inheritance;

public class A {

	private String name;
	private int age;
	private int id;
	
	// default contractor

	public A() {
		this.name = "";
		this.age = 0;
		this.id = 0;

	}

	public A(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id =id;
	}
}
