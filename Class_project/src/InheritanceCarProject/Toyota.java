package InheritanceCarProject;

public class Toyota extends Car {

	boolean hasFiveStarSafety;

	public Toyota() {
		super();
		hasFiveStarSafety = false;
		super.setMake("Toyota");
	}

	public Toyota(boolean hasFiveStarSafety, String color, String model, int year, int numberOfDoors, double price,
			String vinNumber) {
		super(color, model, "Toyota", year, numberOfDoors, price, vinNumber);
		this.hasFiveStarSafety = hasFiveStarSafety;
	}

	public boolean getHasFiveStarSafety() {
		return hasFiveStarSafety;
	}

	public void setHasFiveStarSafety(boolean hasFiveStarSafety) {
		this.hasFiveStarSafety = hasFiveStarSafety;
	}

	public String toString() {
		return super.toString() + " / FiveStarSafety: " + hasFiveStarSafety;
	}

}
