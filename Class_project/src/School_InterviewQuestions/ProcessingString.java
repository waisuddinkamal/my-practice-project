package School_InterviewQuestions;

import java.util.HashSet;

public class ProcessingString {

	public static void main(String[] args) {
		// a-z => all lower case chars
		// A-Z => all upper case chars
		// 0-9 => all numbers
		// ^ => this is the not operator
		String sample = "Freedom Mortgage%Freedom";
		System.out.println(procString(sample));
		System.out.println(processWord("Mortgage"));
	}

	public static String procString(String str) {
		String signs = str.replaceAll("[a-zA-Z]", "");
		System.out.println(signs);
		int signCounter = 0;
		String[] words = str.split("[^a-zA-Z]");
		String tempReturn = "";
		char tempSign = signs.charAt(0);
		for (int i = 0; i < words.length; i++) {

			if (signCounter >= signs.length()) {
				tempSign = ' ';
			} else {
				tempSign = signs.charAt(signCounter++);
			}
			tempReturn += processWord(words[i]) + tempSign;
		}
		System.out.println(signs);
		return tempReturn;
	}

	public static String processWord(String word) {
		HashSet<Character> tempHS = new HashSet<Character>();
		if (word == null || word.length() < 2) {
			return word;
		}
		for (int i = 1; i < word.length() - 1; i++) {
			tempHS.add(word.charAt(i));
		}
		return "" + word.charAt(0) + tempHS.size() + word.charAt(word.length() - 1);
	}
}
