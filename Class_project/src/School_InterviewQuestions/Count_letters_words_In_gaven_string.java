package School_InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Count_letters_words_In_gaven_string {

	public static void main(String[] args) {
		
		
		System.out.println("Counting Chars: " + countChars("this is a test of test"));
		
		System.out.println("Counting words: " + countWord("this is a test of test this is a test of test"));

	}

	public static Map<String, Integer> countWord(String str) {
		Map<String, Integer> words = new HashMap<String, Integer>();
		for (String w : str.split(" ")) {
			if (words.containsKey(w)) {
				words.put(w, words.get(w) + 1);

			} else {
				words.put(w, 1);
			}

		}
		return words;

	}

	public static Map<Character, Integer> countChars(String str) {
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);

			} else {
				chars.put(str.charAt(i), 1);

			}

		}
		return chars;

	}
}
