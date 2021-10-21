package ClassAndobject;

public class Student {

	// these information is variables
	String name;
	int age;
	int id;
	char gender;

	// default constructor the constructor that dose not have any arguments
	// parameters is called default constructor
	// the job of the constructor is to initializer all of the variable of the class
	// signature ==> called name and args of a method
	// definition ==> anything before the body called definition.
	// implementation ==> the code inside the body of the method.

	// these are the default constructed
	public Student() { // ==> Signature
		name = "";
		age = 0;
		id = 0;
		gender = 'M';
	}

	// Parameterized constructors - the constructors that have some arguments
	public Student(String newName, int newAge, int newID, char newGender) {
		name = newName;
		age = newAge;
		id = newID;
		gender = newGender;
	}

	public Student(String newName) {
		name = newName;
		age = 0;
		id = 0;
		gender = ' ';
	}
	public void printInfo() {
		String g = "";
		if (gender == 'M') {
			g = "Male";
		} else if (gender == 'F') {
			g = "Female";
		} else {
			g = "NA";
		}
		System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id + ", Gender: " + g);

	
	}
}
