package officeHour;

public class ArrayComparison {

	public static void main(String[] args) {

//		double[] nums2 = { 3.6, 6.2, 78.45 };
//		Arrays.sort(nums);
//		Arrays.sort(nums2);

		int[] nums = { 3, 5, 54, 65 };
		int[] numsToCompare = { 3, 5, 56, 65 };
		//we are calling our method to verify if arrays are equal 
		boolean result = compareArrays(nums, numsToCompare);

		System.out.println("Are these arrays are equals? " + (result ? "Yes" : "No"));

	}
	//custom method
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		//we are filtering arrays if they have different amount of elements 
		if (arr1.length != arr2.length) {
			return false;
		}
		//since we verified that 2 arrays have same ammount of elements
		//we can specify length of either array
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Comparing value # " + i + " : " + arr1[i] + " - " + arr2[i]);
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}