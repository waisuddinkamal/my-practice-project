package ClassAndobject;

public class Calculater {

	public Calculater() {
		
	}

	public double getSum(double a, double b) {
		System.out.println(a + " + " + b + " = " + (a + b));
		return a + b;
	}

	public double getDiv(double a, double b) {
		System.out.println(a + " / " + b + " = " + (a / b));
		return a / b;
	}

	public double getSubtraction(double a, double b) {
		System.out.println(a + " - " + b + " = " + (a - b));
		return a - b;
	}

}
