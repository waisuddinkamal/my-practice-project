package ClassAndobject;

public class SDETClass {

	// creating a list to store students
		Student[] listOfStudent;
		public SDETClass() {
			// we are in the constructor, so we should initialize our variables
			
			listOfStudent = new Student[50]; // we initialize the variable list we have in this 
			//class to default size of 50 that we defined
		}
		public SDETClass(int size) {
			// we are in the constructor, so we should initialize our variables
			
			listOfStudent = new Student[size]; // so we initialize the array that we have to the size that 
			//is provided to us in the arg of this method
		}
		
		public boolean enroll(Student newStudent) {
			// check to see if there is an empty index in the array
			for (int i = 0; i < listOfStudent.length; i++) {
				if(listOfStudent[i] == null) {
					listOfStudent[i] = newStudent; // we add the new student to the list
					System.out.println("Congrats, you are added to the class!"); // we print the message that you got added
					return true; // we get out of the method and return true
				}
			}
			// we went through the list and could not find any empty index
			
			System.out.println("Class is full and we could not add you!"); // we print the message that class is full
			return false; // the method return false
		}
		
		public void printListOfStudents() {
			System.out.println("*******************");
			
			for (int i = 0; i < listOfStudent.length; i++) {
				// we know that we can not print name of something that does not exist, so
				if(listOfStudent[i] == null) { // we check to see if the index has value of null
					break; // we stop the loop and get out
				}
				// if we reach this point, it meant that the index was not null, so
				// we are going to use the method we created in class student to print the info of the student
				listOfStudent[i].printInfo(); // we print the info of the student
			}
			
			
			System.out.println("*******************");
	}

}
