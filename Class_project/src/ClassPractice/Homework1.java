package ClassPractice;

public class Homework1 {

	public static void main(String[] args) {

		String name = "testin";
		System.out.println(name.length());

		if (name.length() % 2 != 0) { // you are given the following Strings, reverse the string if the length of it is odd, 
			for (int i = name.length() - 1; i >= 0; i--) {

				System.out.print(name.charAt(i));
			}
		} else if (name.length() % 2 == 0) {
			
			String newname = name.substring(0, name.length() - 1);
			for (int i = newname.length() - 1; i >= 0; i--) {
				System.out.print(newname.charAt(i));
			}

		}

	}
}
