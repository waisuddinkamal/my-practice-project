package SetExample;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		// set in collections is a going to take unique values
		// set is an un-ordered collection
		HashSet<String> data = new HashSet<String>();

		System.out.println(data.add("test"));
		System.out.println(data.add("test1"));
		System.out.println(data.add("test2"));
		System.out.println(data.add("test3"));
		System.out.println(data.add("test4"));
		System.out.println(data.add("test1"));
		
		System.out.println(data);

		// how to find duplicates in an array
		String[] values = { "Jack", "David", "Jack", "Anna" };

		// O(n^2)
		boolean f = true;
		outerLoop: for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				System.out.println(values[i] + " " + values[j]);
				if (values[i].equals(values[j])) {
					// if we find a duplicate, we stop the loop
					System.out.println("Dulicate Values Found: " + values[i] + " " + values[j]);
					break outerLoop;
				}
			}
			// two option to break the outer loop
			// option 1 = is to give the loop a name, and break the loop with that name
			// option 2 = to create boolean that keeps track of if we should stop the outer
			// loop
			// we call this boolean - flag
		}

		System.out.println("-------------------------------------");

		// n = 4
		// O(n) = > 4
		// O(n^2) = > 4*4

		HashSet<String> temp = new HashSet<String>();

		for (int i = 0; i < values.length; i++) {
			if (temp.add(values[i]) == false) {
				// if the method returns false, it means that the element already exist in the
				// set and its a duplicate
				System.out.println("Duplicate found with using a set: " + values[i] + " " + i);
//					break;
			}
		}
		for (String i : temp) {
			System.out.println(i);
		}

		// will be back at 9:23

		// O(2n)

	}

}
