package ClassPractice;

public class OneDimensionalTwoDimensionalThreeDimensional {

	public static void main(String[] args) {

		int[] a = new int[4];

		a[0] = 20;
		a[1] = 30;
		a[2] = 40;
		a[3] = 50;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("********************************");

		String[][] x = new String[3][5];

		x[0][0] = "kamal";
		x[0][1] = "jhon";
		x[0][2] = "wais";
		x[0][3] = "ahmad";

		x[1][0] = "jose";
		x[1][1] = "bob";
		x[1][2] = "mahmod";
		x[1][3] = "kamal";

		x[2][0] = "jamal";
		x[2][1] = "wali";
		x[2][2] = "ali";
		x[2][3] = "emran";

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				System.out.print(x[row][col] + " ");
				System.out.print("\n");

			}
		}

		System.out.println("**************************************");

		int[][] num = new int[4][4];
		int number = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = number++;
				System.out.print(num[i][j] + " ");
				System.out.println();
			}
			System.out.println("***********************");
		}

		int[][][] threeD = new int[3][15][3];
		int no = 1;

		for (int table = 0; table < threeD.length; table++) {
			for (int row = 0; row < threeD[table].length; row++) {
				for (int col = 0; col < threeD[table][col].length; col++) {
					threeD[table][row][col] = no++;
				}
			}
		}
		for (int[][] table : threeD) {
			for (int[] row : table) {
				for (int cel : row) {
					System.out.print(cel+"\t");
				}
				System.out.println("");
			}
			System.out.println("********************");
		}

	}
}


