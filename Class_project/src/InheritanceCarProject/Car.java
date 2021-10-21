package InheritanceCarProject;

public class Car {
	private String color;
	private String model;
	private String make;
	private int year;
	private int numberOfDoors;
	private double price;
	private String vinNumber;

	// default constructor
	public Car() {
		super();
		this.color = "";
		this.model = "";
		this.make = "";
		this.year = 0;
		this.numberOfDoors = 0;
		this.price = 0;
		this.vinNumber = "";
	}

	// Parameterized constructor
	public Car(String vinNumber, String make, String model) {
		this();
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
	}

	// Parameterized constructor 2
	public Car(String color, String model, String make, int year, int numberOfDoors, double price, String vinNumber) {
		this(vinNumber, make, model);
		this.color = color;
		this.year = year;
		this.numberOfDoors = numberOfDoors;
		this.price = price;
	}

	// getters / setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	// toString method
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", make=" + make + ", year=" + year + ", numberOfDoors="
				+ numberOfDoors + ", price=" + price + ", vinNumber=" + vinNumber + "]";
	}
}
