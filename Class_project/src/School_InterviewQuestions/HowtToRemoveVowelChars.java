package School_InterviewQuestions;

public class HowtToRemoveVowelChars {

	public static void main(String[] args) {
		String str = "this is my the first time programs";
		String str1 = "this is my the first time programs";
		String str2 = "this is my the first time programs";
		String str3 = "this is my the first time programs of programs";
		System.out.println(countVawel(str3));
		System.out.println(countTheVawel(str2));
		System.out.println(removeAllVavuls(str));
		System.out.println(countTheVawelChars(str1));

	}

	// Removing the Vowel Chars from String
	public static String removeAllVavuls(String str) {
		return str.replaceAll("[aieou]", "");

	}

	// Count the Vowel Chars in String
	public static int countTheVawelChars(String str1) {
		return str1.replaceAll("[^aeiou]", "").length();

	}

	// count the Vowel Chars in String using for loop
	public static int countTheVawel(String str2) {
		int count = 0;
		for (int i = 0; i < str2.length(); i++) {
			if ("aeiou".contains("" + str2.charAt(i))) {
				count++;
			}

		}

		return count;
	}

	// count the Vowel Chars in String using for loop and if statement
	public static int countVawel(String str3) {
		int counts = 0;
		for (int i = 0; i < str3.length(); i++) {

			if (str3.charAt(i) == 'a' || str3.charAt(i) == 'e' || str3.charAt(i) == 'i' || str3.charAt(i) == 'o'
					|| str3.charAt(i) == 'u') {
				counts++;
			}
		}

		return counts;
	}

}
