package ClassAndobject;

public class SDETrunner {

	public static void main(String[] args) {
		
			
				// how to create objects of a class
				// datatype name = value
				// data-type name; <<< declaration
				// name = new data-type(); <<< initialization
				// data-type(Class Name) name = new data-type(Class Name)();
				SDETClass hawks = new SDETClass(6);
				
				SDETClass phoenix = new SDETClass(95);
				
				Student st1 = new Student("Jack");
				Student st2 = new Student("Ben");
				Student st3 = new Student("Ahmad");
				Student st4 = new Student("Ana");
				Student st5 = new Student("Roy");
				Student st6 = new Student("David");
				
				hawks.enroll(st1);
				hawks.enroll(st2);
				hawks.enroll(st3);
				hawks.enroll(st4);
				hawks.enroll(st5);
				hawks.enroll(st6);
				
				hawks.printListOfStudents();
		
		
	}

}
