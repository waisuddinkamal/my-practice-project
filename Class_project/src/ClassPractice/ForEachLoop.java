package ClassPractice;

public class ForEachLoop {

	
		public static void main(String[] args) {
			int[] d = { 546, 45, 441, 21, 5, 4, 51, 857, 8, 4, 5, 48, 4, 5, 45, 45, 85 };
			System.out.println("for loop ");
			for (int i = 0; i < d.length; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.println();
			// pointer vs index number d[i]
			// pointer -- will point at the index value - so i in the foreach loop is the
			// value of that index
			// index number d[i] -- will be used to refer to that index, so d[i] will point
			// to the value of that index
			System.out.println("for each");
			for (int i : d) {
				System.out.print(i + " ");
			}
//			for(datatype(int) pointer: nameOfArray) {
//			// the only difference is that you pointer in here is not the index number, it is the value in that index	

	}
}
