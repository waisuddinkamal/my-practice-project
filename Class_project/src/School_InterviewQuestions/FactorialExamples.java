package School_InterviewQuestions;

public class FactorialExamples {

	public static void main(String[] args) {

		System.out.println(getFactorial(5));
		System.out.println(getFactorial2(5));
		System.out.println(getFactorial3(5));
	}

	public static int getFactorial(int n) {
		int temp = 1;
		// 3*2*1
		for (int i = 0; i <= 3; i++) {
			temp *= n;
			n--;
		}
		return temp;
	}

	public static int getFactorial2(int n) {
		int temp = 1;
		while (n > 0) {
			temp *= n--;
		}
		return temp;
	}

	public static int getFactorial3(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return n * getFactorial3(n - 1);
	}
	// n = 1
	// 5 * 4 * 3 * 2 * 1
	// n n-1*n-1*n-1*n-1
	// 3 * 2 * 1
	// 2 * 1
	// n n-1
}
