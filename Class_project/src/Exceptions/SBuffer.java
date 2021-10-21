package Exceptions;

public class SBuffer {

	public static void main(String[] args) {

		// String, StringBuilder and StringBuffer are all considered to be sub classes of CharSequence
		// these classes are used to work with text in java
		// string is immutable - which basically means that if you change the value of a string
		// it is going to create a new variable in the memory and refer to that that
		// the old variable will be eventually garbage collected
		
		// StringBuilder and StringBuffer are both mutable - which means that if you change the value of the
		// object, the modification will happen in the same location in the memory and no new reference
		// will be created.
		// the main difference between StringBuilder and StringBuffer is that StringBuffer
		// is thread safe and StringBuilder is not thread safe
		
		// thread safe -
		
		String str = "test";  // 001
		str = str + "end";  // 002
	
		str = str.toUpperCase(); // 004
		System.out.println(str.toUpperCase());
		
		
		StringBuilder sb = new StringBuilder("test"); // 003
		sb.append("end"); // 003
		
		sb.reverse();
		
		
		
		String str2 = String.valueOf(sb);
		System.out.println(str2);
		
		
	}
	

	}


