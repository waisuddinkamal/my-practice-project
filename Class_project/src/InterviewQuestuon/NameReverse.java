package InterviewQuestuon;

public class NameReverse {

	public static void main(String[] args) {
		String str = "mom";
		System.out.println(strPlindrome(str));

		// Name Reverse
		String name = "kamal";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));

		}
		// Name Reverse using StringBuffer
		System.out.println();
		System.out.println("==================");
		StringBuffer sb = new StringBuffer("waisuddin");
		System.out.println(sb.reverse());

		// Name reverse
		String s = "john";
		int len = s.length() - 1;
		String rev = "";
		for (int i = len; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.print(rev);

	}

	// String plindrome
	public static boolean strPlindrome(String str) {
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (str.equals(str)) {
			System.out.println("is plindrome");
		} else {
			System.out.println("no plindrome");
		}

		return str.equals(str);

	}
}
