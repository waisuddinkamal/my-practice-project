package School_InterviewQuestions;

import java.util.Stack;

public class Confirm_Parenthesis_Are_Balanced {

	public static void main(String[] args) {
		String sample1 = "()()()()()()()";
		String sample2 = "(((()()()(()))))";
		String sample3 = ")((()()()(()))))";
		String sample4 = "<({[()()]})>";
		String sample5 = "<{[(test)(test2)]}>";
		String sample6 = null;
		
		System.out.println("Simple 1: " + isBalanced(sample1));
		System.out.println("Simple 2: " + isBalanced(sample2));
		System.out.println("Simple 3: " + isBalanced(sample3));
		System.out.println("Simple 4: " + isBalanced(sample4));
		System.out.println("Simple 5: " + isBalanced(sample5));
		System.out.println("Simple 6: " + isBalanced(sample6));
		
	}

	public static boolean isBalanced(String str) {
		// validation - make sure that the str is not null
		if (str == null) {
			System.out.println("input was null");
			return false;
		}
		//stack for chars
		Stack<Character> chars = new Stack<Character>();
		for (Character c : str.toCharArray()) {
			// if its an opening = add it to the stack
			if (c == '('|| c == '{'|| c=='['||c=='<') {
				chars.add(c);

			} else {
				// at this pint , there must be at least one char in the stack
				if (chars.size() < 1) {
					return false;
					// else its closing - compare that with the last value added to the stack
				} // check for (
				if (c == ')' && chars.pop() != '(') {
					return false;
				} // check for {
				if (c == '}' && chars.pop() != '{') {
					return false;
				} // check for [
				if (c == ']' && chars.pop() != '[') {
					return false;
				} //check for <
				if (c == '>' && chars.pop() != '<') {
					return false;
				}
			}

		}

		return chars.size() == 0;

	}
}
