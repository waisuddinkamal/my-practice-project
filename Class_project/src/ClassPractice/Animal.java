package ClassPractice;

public class Animal {

	String name;
	String color;
	int age;
	char gender;

	

	public Animal() {
		name = "";
		color = "";
		age = 0;
		gender = ' ';

	}

	public Animal(String newName, String newColor, int newAge, char newGender) {
		name = newName;
		color = newColor;
		age = newAge;
		gender = newGender;

	}

	public static void main(String[] args) {

		Animal an1 = new Animal();
		Animal an2 = new Animal("tiger", "brown", 5, 'F');

		an1.name = "tom";
		an1.color = "black";
		an1.age = 3;
		an1.gender = 'M';
		System.out.println(an1.name);
		System.out.println(an1.color);
		System.out.println(an1.age);
		System.out.println(an1.gender + "\n");
		
		System.out.println(an2.name);
		System.out.println(an2.color);
		System.out.println(an2.age);
		System.out.println(an2.gender);

	}

}
