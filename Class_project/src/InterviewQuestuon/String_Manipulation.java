package InterviewQuestuon;

public class String_Manipulation {

	public static void main(String[] args) {
		String str = "the rains have started here";
		String str1 = "the rains have Started here";

		// finding the string length
		System.out.println(str.length());

		// finding the character of index
		System.out.println(str.charAt(8));

		// finding the index of character 1st occurrence of s
		System.out.println(str.indexOf('s'));// // 1st occurrence of s

		// finding the index of character 2st occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s') + 1));

		// index of String word
		System.out.println(str.indexOf("have"));

		// index of String word which is not exist on the text
		System.out.println(str.indexOf("hello"));

		// String Comparing
		System.out.println(str.equals(str1));

		// String Comparing ignorecase
		System.out.println(str.equalsIgnoreCase(str1));

		// subString
		System.out.println(str.substring(0, 9)); // the rains

		// trim - removing the first and last spice of the String.EX: " wais kamal "
		String s = "   wais kamal   ";
		System.out.println(s.trim());

		// replace the space between the tow word
		System.out.println(s.replace(" ", ""));

		// replace the date format Ex 01-01-2020 to 01/01/2020
		String date = "01-10-2020";
		System.out.println(date.replace("-", "/"));

		// split method is removing the underscore( _ ) from String
		String test = "the_program_will_start_in_this_month";
		String testSp[] = test.split("_");
		for (int i = 0; i < testSp.length; i++) {
			System.out.println(testSp[i]);
			
		// Concate the word in String 
			String s2 = "these are pen";
			System.out.println(s2.concat("s"));
			
			
			String x = "heloo";
			String y = "world";
			int a = 10;
			int b = 20;
			System.out.println(x+y+a+b);// only concatenation
			System.out.println(a+b+x+y);// first sum and then concatenation
					
		}

	}

}
