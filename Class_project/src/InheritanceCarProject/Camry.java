package InheritanceCarProject;

public class Camry extends Toyota {
	private String trim;
	public Camry() {
		super();
		this.trim = "";
	}
	public Camry(String trim, boolean hasFiveStarSafety, String color, String model, int year, int numberOfDoors,
			double price, String vinNumber) {
		
		super(hasFiveStarSafety, color, model, year, numberOfDoors, price, vinNumber);
		this.trim = trim;
	}

}
