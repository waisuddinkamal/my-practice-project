package ClassPractice;

public class Z {
	public static void main(String[] args) {
		String str = "this is my first program";
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) % 2 != 0) {
				System.out.print(" " + i);
			}
		}
	}
}
