package ClassPractice;

public class Array_New {

	public static void main(String[] args) {
		// [10,5,9,5,3]
		int[] data;
		data = new int[8];
		data[0] = 5;
		data[1] = 12;
		data[2] = 23;
		data[3] = 562;
		data[4] = 12;
		data[5] = 34;
		data[6] = 34;
		data[7] = 12;
		int data2[] = { 5, 12, 23, 562, 12, 34, 34, 12 };
		// i 0 - 7 < 8
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		int[][] a = new int[3][3];
		// 1,2,3
		// 4,5,6
		// 7,8,9
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		String b[] = { "SD", "AK", "CA" };
		String twoDimension[][] = { { "SD", "AK", "CA" }, { "AL", "MS", "EC" }, { "DE", "OK", "IL" } };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("------------------------------");
		for (int row = 0; row < twoDimension.length; row++) {
			for (int col = 0; col < twoDimension[row].length; col++) {
				System.out.print(twoDimension[row][col] + " ");
			}
			System.out.println();

		}

	}
}
