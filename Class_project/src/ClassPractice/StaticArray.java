package ClassPractice;

public class StaticArray {

	public static void main(String[] args) {
		// array : to store smiler data type values in a array variable
		// I .int array
		// lowest bound / index = 0
		// upper bound / index = n-1 ( n is size if array)
		// dis - advantages of array
		// 1- size is fixed -- that is way called static array
		// 2- store only similar data type -- to overcome of this problem , we use
		// object array
		
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);
		System.out.println(i.length);
		// you can not print the full size of array values because gave you an error on
		// the console

		// for printing the all values of array we using the for loop

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);

			// 2 double array

			double d[] = new double[4];
			d[0] = 20.33;
			d[1] = 30.44;
			d[2] = 50.10;
			d[3] = 10.20;

			System.out.println(d[2]);

			for (int p = 0; p < d.length; p++) {
				System.out.println(d[p]);
			}

			// 3 char array

			char c[] = new char[4];
			c[0] = 'a';
			c[1] = 'b';
			c[2] = 'd';
			c[3] = 'f';
			System.out.println(c[2]);
			// for printing the all values of char array we using the for loop

			for (char t = 0; t < c.length; t++) {
				System.out.println(c[t]);

			}

			// boolean array

			boolean b[] = new boolean[2];
			b[0] = true;
			b[1] = false;
			System.out.println(b[1]);

			// String array

			String s[] = new String[3];
			s[0] = "Hi";
			s[1] = "Welcome";
			s[2] = "world";

			System.out.println(s[0] + " " + s[1] + " " + s[2]);
			System.out.println(s.length);

			// Object array
			// object array is use to store different data type values
			Object ob[] = new Object[4];
			ob[0] = "kamal";
			ob[1] = 25;
			ob[2] = 30.34;
			ob[3] = true;
			System.out.println(ob.length);
			System.out.println(ob[0]);
			System.out.println(ob[1]);
			System.out.println(ob[2]);
			System.out.println(ob[3]);
		}
		}

	}

