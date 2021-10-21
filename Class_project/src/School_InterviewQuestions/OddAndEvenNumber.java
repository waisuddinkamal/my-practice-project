package School_InterviewQuestions;

public class OddAndEvenNumber {
	// for loop is printing number form 1 to 100
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			OddAndEven(i);
		}

	}
	
	public static void OddAndEven (int num) {
		// find the Odd and even number
		if (num % 2 == 0) {
			System.out.println(num+ " is an Even Number");
		}else {
			System.out.println(num+ " is an Odd Number");
		}
		
		
	}
	
	

}
