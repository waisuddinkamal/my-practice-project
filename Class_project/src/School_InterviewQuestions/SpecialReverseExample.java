package School_InterviewQuestions;

public class SpecialReverseExample {

	public static void main(String[] args) {
		// you are given a string
		// reverse the string based on words
		// and reverse each word separately
		// jamil is a tester
		// limaj si a retset
		// tester a is jamil
		String s = "jamil is a tester";
		System.out.println(revWords(s));
		// StringBuffer
		System.out.println("the String\t\t" + s);
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Complete reverse\t" + sb.reverse());
		System.out.println("reverse each word\t" + revEachWord(s));
		System.out.println("----------------------");
		System.out.println(revEachWord("str is the name of the variable in the method"));
	}

	public static String revEachWord(String str) {
		String[] words = str.split(" "); // split the str to words
		String tempRev = ""; // create temp string to return
		String revWord = ""; // create temp string for each word to be reversed
		for (int i = 0; i < words.length; i++) { // go through all of the words
			revWord = ""; // reset the str for the words
			for (int j = words[i].length() - 1; j >= 0; j--) { // is reversing a word words[i]
				revWord += words[i].charAt(j);
			}
			tempRev += revWord + " "; // keep adding the reversed word and one space to
										// the temp string that is going to get returned
		}
		return tempRev; // return the temp str
	}

	public static String revWords(String str) {
		String[] words = str.split(" "); // Splitting my string to words
		String rev = ""; // creating this temp string
		for (int i = words.length - 1; i >= 0; i--) { // i go through all of my words in reverse order
			rev += words[i] + " "; // i add each word and a space to the temp string
		}
		return rev; // i return the temp string
	}

}
