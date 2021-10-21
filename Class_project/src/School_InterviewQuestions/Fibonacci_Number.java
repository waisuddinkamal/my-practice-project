package School_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_Number {
	// finding the fibNocci Number 
	// the concept is first number + second Number = third number 
	// 0,1,2,3,4,5 .....
	// 0+1 = 1/ 1+1 = 2/ 2+3 =5/ 5+3=8 .....
	// All the way up to optional number we and to end 
	public static void main(String[] args) {
		System.out.println(fibNumber(10));
	}

	public static List<Integer> fibNumber(int end) {
		List<Integer> fibNum = new ArrayList<Integer>();
		fibNum.add(0);
		fibNum.add(1);
		for (int i = 0; true; i++) {
			if (i > end) {
				break;

			}
			fibNum.add(fibNum.get(fibNum.size() - 1) + fibNum.get(fibNum.size() - 2));

		}
		return fibNum;

	}
}
