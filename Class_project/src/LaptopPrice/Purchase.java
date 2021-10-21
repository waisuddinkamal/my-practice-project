package LaptopPrice;

import java.util.Scanner;

public class Purchase {

	double price;
	double screenSize;
	String cpuType;
	String ramSize;
	String storageType;
	String resolution;

	public Purchase() {
		super();
		this.price = 0.0;
		this.screenSize = 0.0;
		this.cpuType = "";
		this.ramSize = "";
		this.storageType = "";
		this.resolution = "";

	}

	public Purchase(double price, double screenSize, String cpuType, String ramSize, String storageType,
			String resolution) {
		super();
		this.price = price;
		this.screenSize = screenSize;
		this.cpuType = cpuType;
		this.ramSize = ramSize;
		this.storageType = storageType;
		this.resolution = resolution;
	}
	Scanner keyboard = new Scanner(System.in);
	
	public void screenSize() {
		
		if (screenSize == 13.3) {
			price = 1000 + 200;

		} else if (screenSize == 15.0) {
			price = 1500 + 300;

		} else if (screenSize == 17.3) {
			price = 2000 + 400;
		} else {
			System.out.println("Please Enter your valide screen size");
		}
		System.out.println(price);
	}

}
