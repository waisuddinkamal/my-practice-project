package ClassPractice;

public class LogicalGates {

	public static void main(String[] args) {
		int age = 25;
		double creditScore = 800;
		boolean inDebt = false;
//		 if(age > 21) {
//			 System.out.println("can apply for loan");
//		 }
		// and && - both conditions must be true for the result to be true
		if (age > 21 && creditScore > 650) {
			System.out.println("AND -- can apply for loan");
		}
		// or || - only one side must be true for the result to be true
		if (age > 21 || creditScore > 650) {
			System.out.println("OR -- can apply for loan");
		}
		// not ! - is going to reverse the logic
		// != not equal to
		// if age is more than 21 and score is more 650 and they are not inDebt
		if (age > 21 && creditScore > 650 && inDebt != true) {
			System.out.println("NOT -- can apply for loan");
		}
		System.out.println(!(true || false));
		System.out.println(!(false && false));
		// true or anything is true
		// false and anything is false
		// xor - if both sides are the same = false -- if both sides are different =
		// true
		// true ^ false = true
		// false ^ true = true
		// false ^ false = false
		// true ^ true = false
		System.out.println("XOR: " + (true ^ false));
		System.out.println("XOR: " + (false ^ true));
		System.out.println("XOR: " + (false ^ false));
		System.out.println("XOR: " + (true ^ true));
		int x = 1;
		int y = 2;
		System.out.println(x != y);
		char a = 'a';
		char b = 'b';
		System.out.println(a > b);
		System.out.println((int) a);

		boolean w = 57 < 17 || !(true) && 'c' != 'd' || (true ^ false);
		System.out.println("the answer: " + w);

	}

}
