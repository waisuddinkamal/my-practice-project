package InterviewQuestuon;

public class factorial {

	public static void main(String[] args) {
		// factorial
		int no = 5;
		int fact = 1;

		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		
		System.out.println("==================");
		
		int num = 5;
		int factor = 1;
		for (int i = num; i >= 1; i--) {
			factor = factor * i;
		}
		System.out.println(factor);

	}
}
