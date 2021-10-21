package ClassPractice;

public class NameReverseWithCondation {

	public static void main(String[] args) {
		String name = "tisting";
		System.out.println(name.length()); // This statement is to know the odd and even number Of String length

		if (name.length() % 2 == 0) {
			for (int i = name.length() - 1; i >= 0; i--) {
				System.out.print(name.charAt(i));
			}

		} else if (name.length() % 2 != 0) {
			String newname = name.substring(0, name.length() - 1);
			for (int i = newname.length() - 1; i >= 0; i--) {
				System.out.print(newname.charAt(i));
			}

			System.out.println("================");
			System.out.println();

			// Reverse the integer
			int num = 12345;
			int rev = 0;
			while (num != 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;

			}
			System.out.println(rev);
		}
		// reverse the String name
		String name1 = "kamal";
		for (int i = name1.length() - 1; i >= 0; i--) {
			System.out.print(name1.charAt(i));

		}
		System.out.println();
		// Integer reverse using StringBuffer
		int num = 12345789;

		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}

}
