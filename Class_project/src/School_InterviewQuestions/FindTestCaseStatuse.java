package School_InterviewQuestions;

public class FindTestCaseStatuse {

	public static void main(String[] args) {
		// finding the test case element from 2D array
		String[][] testStatuse = { { "tc001", "pass" }, { "tc002", "faild" }, { "tc003", "pass" } };
		for (int i = 0; i < testStatuse.length; i++) {
			if (testStatuse[i][1].equals("pass")) {
				System.out.println(testStatuse[i][0] + "  " + testStatuse[i][1]);
			}
		}
	}

}
