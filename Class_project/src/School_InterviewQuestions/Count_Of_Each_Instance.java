package School_InterviewQuestions;

import java.util.HashMap;

public class Count_Of_Each_Instance {

	public static void main(String[] args) {
		String[] data = { "test", "take", "nice", "test", "nice", "test", "nice" };
		printDuplicatesInArray(data);

	}

	public static void printDuplicatesInArray(String[] data) {

		HashMap<String, Integer> temp = new HashMap<String, Integer>(); // this map is counting each words
		HashMap<String, Integer> duplicates = new HashMap<String, Integer>(); // this map is separate the duplicates

		for (int i = 0; i < data.length; i++) {
			if (temp.containsKey(data[i])) {
				temp.put(data[i], temp.get(data[i]) + 1);

			} else {
				temp.put(data[i], 1);

			}

		}
		for (String key : temp.keySet()) {// Goes through the first map and find the ones that have count of more one
			if (temp.get(key) > 1) {
				duplicates.put(key, temp.get(key));
			}
		}
		System.out.println(duplicates);

	}
}
