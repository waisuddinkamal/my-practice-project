package School_InterviewQuestions;

public class StringArrayReverse {

	public static void main(String[] args) {
		// reverse the string
		String sample = "this is a test string";
		System.out.println(revStringMethod1(sample));
		System.out.println(revStringMethod2(sample));

		String[] words = { "test1", "test2", "test3", "test4", "test5" };

		for (String s : revStringArray(words)) {
			System.out.println(s);
		}

		// write a function that reverses the given Array of String and returns an array
		// of String
	}

	public static String[] revStringArray(String[] strArr) {
		String[] temp = new String[strArr.length];
		int x = 0;
		for (int i = strArr.length - 1; i >= 0; i--) {
			temp[x++] = strArr[i];
		}
		return temp;
	}

	public static String revStringMethod1(String str) {
		StringBuffer temp = new StringBuffer(str);
		return String.valueOf(temp.reverse());
	}

	public static String revStringMethod2(String str) {
		String rev = "";
		// this is a test string
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;

	}

}
