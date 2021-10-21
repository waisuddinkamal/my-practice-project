package School_InterviewQuestions;

public class FindingThe_LargestNumber_In_Array {

	public static void main(String[] args) {
		int[] number = { 42, 454, 658, 24, 1, 4, 54, 656, 34, 67 };

		System.out.println("Largest element: " + findLargestNum(number));
		System.out.println("Smallest element: " + samllestNumber(number));
		System.out.println("Sum: " + sumOfvalue(number));
		System.out.println("Avrage: " + getAvrageValue(number));
		System.out.println("second Largest: " + secomdLargestNumber(number));
		System.out.println("second Smallest: " + seondSmallest(number));
	}

	// finding the largest element on the array
	public static int findLargestNum(int[] number) {
		int largest = number[0];
		for (int i = 0; i < number.length; i++) {
			if (largest < number[i]) {
				largest = number[i];
			}
		}

		return largest;
	}
	// finding the smallest element on the array

	public static int samllestNumber(int[] num) {
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < smallest) {
				smallest = num[i];

			}
		}

		return smallest;
	}

	// finding the sum of elements on the array
	public static int sumOfvalue(int[] sums) {
		int sum = 0;
		for (int i = 0; i < sums.length; i++) {
			sum += sums[i];

		}

		return sum + sum / sums.length;
	}
	// finding the Average value of Array using the sum of value method;

	public static double getAvrageValue(int[] sums) {
		return (double) sumOfvalue(sums) / sums.length;
	}

	// find the second Largest value
	public static int secomdLargestNumber(int[] nums) {
		int secondLargest = nums[0];
		int largest = findLargestNum(nums);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > secondLargest && nums[i] < largest) {
				secondLargest = nums[i];

			}
		}

		return secondLargest;

	}

	// finding the second smallest value
	public static int seondSmallest(int[] nums) {
		int smallest = samllestNumber(nums);
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > smallest && nums[i] < secondSmallest) {
				secondSmallest = nums[i];
			}
		}

		return secondSmallest;
	}

}
