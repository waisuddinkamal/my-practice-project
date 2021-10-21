package InheritanceCarProject;

public class BMW extends Car{
	boolean hasHUD;
	public BMW() {
		super();
		this.hasHUD = false;
	}
	public BMW(boolean hasHUD, String color, String model, String make, int year, int numberOfDoors, double price,
			String vinNumber) {
		super(color, model, make, year, numberOfDoors, price, vinNumber);
		this.hasHUD = hasHUD;
	}
	public String toString() {
		return super.toString() + " / HUD: " + hasHUD;
	}
}
