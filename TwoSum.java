import java.util.Arrays;

public class TwoSum {

	// Method to find pair with given numbers and values
	public static void twoSum(int[] num, int sum) {
		for (int i = 0; i < num.length -1; i++) {
			for (int j = i + 1; j < num.length; j++) {

				//If found the sum, print the indices
	 			if (num[j] + num[i] == sum) {
	 				System.out.println("Output: [" + i +","+ j +"]");
	 				return;
	 			}
	 			//If find matching numbers in the array, no solution is available 
	 			else if (num[j] == num[i]) {
	 				System.out.println("No solution found!");
	 				return;
	 			}
	 		}
	 	}
	 }

	public static void main(String[] args) {

		// Example 1 with given values and target:
		int[] num = {2, 12, 8, 7};
		int sum = 9;

		System.out.println("Example 1: ");

		twoSum(num, sum);

		// Example 2 with given values and target:
		int[] num2 = {1, 13, 18, 20, 20, 30};
		int sum2 = 40;

		System.out.println("Example 2: ");

		twoSum(num2, sum2);
	}

} 
