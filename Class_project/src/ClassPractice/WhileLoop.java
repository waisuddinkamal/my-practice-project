package ClassPractice;

public class WhileLoop {

	public static void main(String[] args) {
		int num = 5;
		while (num > 0) {
			num--;
			System.out.println(num);

		}
		System.out.println("*****************");
		int x = 1;
		while (x <= 5) {
			x++;
			System.out.println(x);

			int i = 1;
			while (i <= 5) {
				System.out.println(i++);

				// question 1
				int a = 1;
				while (a <= 10) {
					System.out.println(a++);
				}
				System.out.println("******************************************");
				// question 2

				int a1 = 1;
				while (a1 <= 10) {
					System.out.println(a1);
					a1 += 2;
				}
				System.out.println("******************************************");
				// question 3
				int a2 = 1;
				while (a2 <= 5) {
					System.out.print(a2++ + "\t");

				}

				int a3 = 5;
				while (a3 <= 0) {
					System.out.print(a3-- + "\t");

				}

				/*
				 * Questions 1 1 2 3 4 5 6 7 8 9 10
				 */
				System.out.println("******************* Question 1 *******************");
				int num1 = 1;
				while (num1 <= 10) {
					System.out.println(num1++);
				}
				/*
				 * Questions 2 1 3 5 7 9
				 */
				System.out.println("******************* Question 2 *******************");
				int num2 = 1;
				while (num2 <= 10) {
					System.out.println(num2);
					num2 += 2;
				}
				/*
				 * Questions 3 - 1 2 3 4 5
				 */
				System.out.println("******************* Question 3 *******************");
				int num3 = 1;
				while (num3 <= 5) {
					System.out.print(num3++ + "    ");
				}

				/*
				 * Questions 4 - 5 4 3 2 1
				 */
				System.out.println("******************* Question 4 *******************");
				System.out.println();
				int num4 = 5;
				while (num4 > 0) {
					System.out.print(num4-- + "    ");
				}

			}
		}

	}

}
