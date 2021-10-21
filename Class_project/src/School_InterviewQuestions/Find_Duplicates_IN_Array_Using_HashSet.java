package School_InterviewQuestions;

import java.util.HashSet;

public class Find_Duplicates_IN_Array_Using_HashSet {

	public static void main(String[] args) {
		String data [] = { "kamal", "wais", "java", "kamal" };
		duplicateElement(data);
	}

	public static void duplicateElement(String[] data) {
		HashSet<String> temp = new HashSet<String>();
		for (int i = 0; i < data.length; i++) {
			if (!temp.add(data[i])) {
				System.out.println("Duplicate found on index of: " + i + " and the vasle is: " + data[i]);
			}
		}
	}

}
