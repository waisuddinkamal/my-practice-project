package School_InterviewQuestions;

public class FizzBuzzProblem {

	public static void main(String[] args) {

		// if the number is divisible by 3 - print Fizz.
		// if the number is divisible by 5 - print Buzz.
		// if the number is divisible by 3&5 - print FizzBuzz.
		printFizzBuzz(1, 30);
	}

	public static void printFizzBuzz(int start, int end) {
		for (int i = start; i <= end; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i+"=FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println(i+"=Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i+"=Buzz");
			} else {
				System.out.println(i);
			}

		}

	}
}
