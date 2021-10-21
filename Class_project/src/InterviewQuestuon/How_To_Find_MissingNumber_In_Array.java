package InterviewQuestuon;

public class How_To_Find_MissingNumber_In_Array {
	// how to find the missing number in array
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int sum1 = 0;
		for (int j = 1; j <= 5; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1 - sum);
	}

}
