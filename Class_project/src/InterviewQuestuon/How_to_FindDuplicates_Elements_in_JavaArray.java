package InterviewQuestuon;

public class How_to_FindDuplicates_Elements_in_JavaArray {

	public static void main(String[] args) {
		// how to find duplicates elements in Array
		// Complicity is O(n^2)
		String s[] = { "kamal", "wais", "java", "kamal" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println(s[i]);
				}

			}
		}
		
	}

}
