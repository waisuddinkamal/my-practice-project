package Abstraction;

public class Runner {

	public static void main(String[] args) {
		//Vehicle v = new Vehicle(); // Cannot instantiate the type Vehicle
		// we can not create abstract class object
		
		Car c = new Car();
		c.start();
		Scooter s = new Scooter();
		s.start();
		
	}

}
