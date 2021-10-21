package School_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class LongestSetofNum {

	public static void main(String[] args) {
		int[] samples = { 2, 3, 5, 6, 1, 2, 3, 3, 2, 1, 4, 3, 2, 1, 1000, 2000, 47 };
		// 1,2,3,4,5,6
		System.out.println(findLongestConscSeqNums(samples));
	}

	// O(log n)
	// O(n)
	public static Stack<Integer> findLongestConscSeqNums(int[] numbers) {
		TreeSet<Integer> tempNumbers = new TreeSet<>(); //
		for (int i = 0; i < numbers.length; i++) {
			tempNumbers.add(numbers[i]);
		}

		// sorted unique set of numbers

		// a list of a collection that stores the numbers
		List<Stack<Integer>> sequences = new ArrayList<Stack<Integer>>();

		int counter = 0;
		for (Integer num : tempNumbers) { // going through the set
			if (sequences.size() == 0) { // its the first number
				sequences.add(new Stack<Integer>());// initialize the stack in the list
				sequences.get(counter).add(num); // add the number to the stack in taht index of the list
				continue; // go to the next iteration
			}

			// compare the num to the value on the top of the stack
			// 1 2 3
			if (sequences.get(counter).peek() + 1 == num) { // the num is in sequence
				sequences.get(counter).add(num); // add the number to the stack in that index
			} else { // if the number is not in a sequence
				counter++; // increase my counter
				sequences.add(new Stack<Integer>()); // initialize the stack in this new index of the list
				sequences.get(counter).add(num);// add the number to this new stack taht was just initialized

			}
		}

		int largest = 0, index = 0;

		for (int i = 0; i < sequences.size(); i++) {
			if (sequences.get(i).size() > largest) {
				largest = sequences.get(i).size();
				index = i;
			}
		}

		return sequences.get(index);

	}

}
