package InterviewQuestuon;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println(primeNumber(2));
		System.out.println(primeNumber(10));
		System.out.println(primeNumber(7));
		getPrimeNumber(7);
		getPrimeNumber(13);

	}

	// finding the prime number
	public static boolean primeNumber(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void getPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {
			if (primeNumber(i))
				
			System.out.print(i + " ");
		}
	}

}
