package Polymorphism;

public class A {

	private String name;
	private int age;
	// static polymorphism - method overloading
	// we create multiple versions of the constructor to give options to the next
	// classes that are going to use this class/template
	// the number of constructors that we make is totally up to us/developers
	// method overloading is having a number of the same methods in the same class
	// with different signatures

	// Overriding is changing the implementation of a method that you inherited in
	// this class
	public A() {
		super();
		this.name = "";
		this.age = 0;
	}

	public A(String name) {
		this();
		this.name = name;
	}

	public A(int age) {
		this();
		this.age = age;
	}

	public A(String name, int age) {
		this(name);
		this.age = age;
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

	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}

	public void printInfo() {
		System.out.println(name + " " + age);
	}

	public void printInfo(String title) {
		System.out.println(title + ": " + name + " " + age);
	}

	

}
