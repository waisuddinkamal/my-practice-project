package InterviewQuestuon;

public class PlindromeNumber {
	// finding the integer plindrome number 
	public static void main(String[] args) {
		int num = 121;
		int reverse = 0, temp, remainder;
		temp = num;

		while (num != 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}

		if (temp == reverse) {
			System.out.println("Yes, it is palindrome");
		} else {
			System.out.println("No, it is not palindrome");
		}
	}
}
