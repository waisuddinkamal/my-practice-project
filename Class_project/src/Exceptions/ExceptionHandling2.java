package Exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// run-time exception - the exceptions that happens during the run time of the
		// app
		// run-time exceptions will stop the execution of the code
		int a = 10;
		int b = 2;
		String x = "";
		System.out.println(x.length());
		try {
			// this is the area that you will add the code you are trying to run
			// this is the code that you suspect might cause an exception
			printDiv(a, b);
		} catch (ArithmeticException e) {
			// the catch will only get executed if and only if the exception occurs
			System.out.println("You tried to divide by zero and we can not do that.");
			e.printStackTrace();
			// throw - execute the exception
//					throw e;
		} catch (Exception e) {
		} finally {
			// finally will get executed at the end of the try/catch
			// regardless of you catching any exception
			System.out.println("----------- >> this is inside the finally block");

		}
		// try >> check catch blocks >> finally

		System.out.println("end of the app, after the try catch");
	}

	public static void printDiv(int a, int b) {
		// throws
		System.out.println(a / b);
	}

}
