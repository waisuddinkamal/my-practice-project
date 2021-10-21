package ClassPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PracticeAndClean {

	public static void main(String[] args) {

		String str = "[{(<>)}]";
		String str2 = "()(){}[]<>";
		String str3 = "this is my first program and this is sencond program";
		String str4 = "this is my first programs";
		System.out.println(charsCount(str4));
		System.out.println(wordCount(str3));
		System.out.println(Character(str));
		System.out.println(Character(str2));
		int num = 5;
		for (int i = 0; i <=num; i++) {
			oddAndEven(i);
		}
	}

	public static boolean Character(String str) {
		Stack<Character> chars = new Stack<Character>();
		if (str == null) {
			System.out.println("The valuse is Null...!");
			return false;
		}
		for (Character c : str.toCharArray()) {

			if (c == '(' || c == '{' || c == '[' || c == '<') {
				chars.add(c);

			} else {
				if (chars.size() < 1) {
					return false;
				}
				if (c == ')' && chars.pop() != '(') {
					return false;
				}
				if (c == '}' && chars.pop() != '{') {
					return false;
				}
				if (c == ']' && chars.pop() != '[') {

				}
				if (c == '>' && chars.pop() != '<') {
					return false;
				}
			}
		}
		return chars.size() == 0;

	}

	public static Map<String, Integer> wordCount(String str) {
		Map<String, Integer> word = new HashMap<String, Integer>();
		for (String w : str.split(" ")) {
			if (word.containsKey(w)) {
				word.put(w, word.get(w) + 1);
			} else {
				word.put(w, 1);
			}

		}

		return word;
	}

	public static Map<Character, Integer> charsCount(String str) {
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

	public static int oddAndEven(int num) {
		
		if (num % 2 == 0) {
			System.out.println(num + "  number is even");
		} else {
			System.out.println(num + "  number id odd");
		}

		return num;
	}
}
