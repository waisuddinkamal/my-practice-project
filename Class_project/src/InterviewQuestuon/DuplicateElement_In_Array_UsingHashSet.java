package InterviewQuestuon;

import java.util.HashSet;

public class DuplicateElement_In_Array_UsingHashSet {
	// finding the duplicate element from array 
	// the time complicity is O(n)
	public static void main(String[] args) {
		String [] nameRev = {"fatima","emran","ramin","fatima","emran"};
		System.out.println(nameReverse(nameRev));

	}
	
	public static String nameReverse(String[] str) {
		HashSet<String> rev = new HashSet<String>();
		// to iterate the data using the for Each loop 
		for(String s:str) {
			if(rev.add(s)==false) {
				System.out.println(s);
			}
		}

		return "";

	}

}
