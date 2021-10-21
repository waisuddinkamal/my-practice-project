package InterviewQuestuon;

public class IntegerReverse {

	public static void main(String[] args) {
		// Integer Reverse

		int num = 12345;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println(rev);
		System.out.println("===========");
		
		// Integer Reverse using String Buffer
		int num1 = 12345;
		StringBuffer sb = new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(sb);
		
	}
	

}
