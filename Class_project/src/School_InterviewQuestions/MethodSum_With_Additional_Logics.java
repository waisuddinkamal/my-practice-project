package School_InterviewQuestions;

public class MethodSum_With_Additional_Logics {

	public static void main(String[] args) {

		System.out.println(freedomSum(1, 1, 4));
		// 1,2,3 = 6
		// 1,2,10 = 3
		// 1,10,2 = 1 

	}
	// find the sum of element of the 
	public static int freedomSum(int a, int b, int c) {
		if (a == 10) {
			return 0;

		} else if (b == 10) {
			return a;
		} else if (c == 10) {
			return a + b;
		} else {
			return a + b + c;
		}

	}

}
