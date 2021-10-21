package GroupPractice;

import java.util.Stack;

public class Practice1 {

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		System.out.println("before the opration " + x + " and " + y);
		x = x + y;// 6
		y = x - y;// 4
		x = x - y;

		System.out.println(x + " and " + y);
		int num = 10025;
		System.out.println(revNo(num));
		int no = 5;
		System.out.println(factNum(no));

		String simple1 = "(){}[]";

		System.out.println(paranticBalance(simple1));
		String name = "kamal";
		System.out.println(StrRev(name));
		String name2 = "waisuddin";
		System.out.println(strRev2(name2));
	
	}

	public static int revNo(int num) {
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		return rev;
	}

	// 1*2*3*4*5
	public static int factNum(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;
	}

	public static boolean paranticBalance(String str) {
		Stack<Character> chars = new Stack<Character>();
		if (str == null) {
			return false;
		}
		for (Character c : str.toCharArray()) {

			if (c == '(' || c == '{' || c == '[') {
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
					return false;
				}
			}
		}

		return chars.size() == 0;

	}

	public static StringBuffer StrRev(String name) {

		StringBuffer nameRev = new StringBuffer(name);
		nameRev.reverse();
		return nameRev;
	}
	
	public static StringBuilder strRev2 (String str) {
		
		StringBuilder nameRev2 = new StringBuilder(str);
		nameRev2.reverse();
		
		
		
		return nameRev2;
	}

	}

