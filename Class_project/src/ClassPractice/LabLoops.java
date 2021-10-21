package ClassPractice;

public class LabLoops {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
		String[] d = new String[5];
		d[0] = "test";
		d[1] = "if";
		d[2] = "kamal";
		d[3] = "understand";
		d[4] = "this";
		
		// for each loop
		for (String x : d) {
			System.out.print(x + " ");
		}
		// for loop
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		// while loop
		System.out.println();
		int x = 0;
		while (x < d.length) {
			x++;
			System.out.print(d[x] + " ");
		}
		System.out.println();
	}

}
