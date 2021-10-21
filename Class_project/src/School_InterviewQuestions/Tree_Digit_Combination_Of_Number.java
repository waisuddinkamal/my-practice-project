package School_InterviewQuestions;

public class Tree_Digit_Combination_Of_Number {

	// write a function that print all the 3 digit combination of number
	// between 1 and 5
	// 1, 1, 1
	// 1, 1, 2
	// 5, 5, 5

	public static void main(String[] args) {
		printNums(1, 5);
	}
	
	public static void printNums(int start, int end) {
		int x = 0; // show the number of iteration of the loop 
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				for (int k = start; k <= end; k++) {
					System.out.println(i + ", " + j + ", " + k);
					x++;
				}
			
			}

		}
		System.out.println(x);
	}

}
