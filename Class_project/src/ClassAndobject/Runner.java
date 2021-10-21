package ClassAndobject;

public class Runner {

	public static void main(String[] args) {
		// how to create object of a class
		// data type name 
		// data type name; =======> declaration
		// name = new data-type(); <<<<<< initialization

		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st5 = new Student();
		Student st4 = new Student("ahamd", 26, 4, 'M');
		Student st6 = new Student("Jack");

		st1.name = "kamal";
		st1.age = 18;
		st1.id = 1;
		st1.gender = 'M';

		st2.name = "wais";
		st2.age = 25;
		st2.id = 2;
		st2.gender = 'M';

		st3.name = "Emran";
		st3.age = 34;
		st3.id = 3;
		st3.gender = 'M';

		st5.name = "John";
		st5.age = 45;
		st5.id = 5;
		st5.gender = 'M';
		

		System.out.println("Object st1: " + "Name:   " + st1.name);
		System.out.println("Object st1: " + "Age:    " + st1.age);
		System.out.println("Object st1: " + "ID:     " + st1.id);
		System.out.println("Object st1: " + "Gender: " + st1.gender + "\n");

		System.out.println("Object st2: " + st2.name);
		System.out.println("Object st2: " + st2.age);
		System.out.println("Object st2: " + st2.id);
		System.out.println("Object st2: " + st2.gender + "\n");

		System.out.println("Object st2: " + st3.name);
		System.out.println("Object st2: " + st3.age);
		System.out.println("Object st2: " + st3.id);
		System.out.println("Object st2: " + st3.gender + "\n");

		System.out.println("Object st4 " + st4.name);
		System.out.println("Object st4 " + st4.age);
		System.out.println("Object st4 " + st4.id);
		System.out.println("Object st4 " + st4.gender + "\n");

		System.out.println("Object st5 " + st5.name);
		System.out.println("Object st5 " + st5.age);
		System.out.println("Object st5 " + st5.id);
		System.out.println("Object st5 " + st5.gender+"\n");
		
		System.out.println("Object st5 " +st6.name);
		st4.printInfo();
		
	}

}
