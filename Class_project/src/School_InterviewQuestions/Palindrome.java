package School_InterviewQuestions;

public class Palindrome {

	public static void main(String[] args) {

		String str = "mom";
		System.out.println(plindrome(str));

	}

	public static boolean plindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(str + "=====" + rev);

		return str.equals(str);

	}

}
