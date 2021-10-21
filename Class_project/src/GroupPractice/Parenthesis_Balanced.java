package GroupPractice;

import java.util.Stack;

public class Parenthesis_Balanced {

	public static void main(String[] args) {
		String simple = "[]";
		System.out.println(Balanced(simple));
	}

	public static boolean Balanced(String str) {

		Stack<Character> charsStack = new Stack<>();

		for (char c : str.toCharArray()) {

			if (c == '(' || c == '{' || c == '<' || c == '[') {

				charsStack.add(c);
			} else {
				if (c == ')') {
					if (charsStack.size() == 0 || charsStack.pop() != '(') {
						return false;
					}
				}
				if (c == '}') {
					if (charsStack.size() == 0 || charsStack.pop() != '{') {
						return false;
					}
				}
				if (c == '>') {
					if (charsStack.size() == 0 || charsStack.pop() != '<') {
						return false;
					}
				}
				if (c == ']') {
					if (charsStack.size() == 0 || charsStack.pop() != '[') {
						return false;
					}

				}
			}

		}
		return charsStack.size() == 0;
	}

}
