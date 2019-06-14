package officeHour;

import java.util.Scanner;

public class VasylTuesday {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int sum = 0;
		// we are looping through the string
		for (int i = 0; i < str.length(); i++) {
			// then we are checking if character is is digit
			// Character - it's a class (wraper class for primitive char)
			// isDigit() it's a method, that takes char, and it returns true
			// if char is digit
			if (Character.isDigit(str.charAt(i))) {
				// if it's digit, we can retrieve it as String
				// and we can convert it into digit
				// but, we have to retrieve it as string
				// Integer it's a wraper class for int primitive
				// parseInt() method that can convert string into digit
				// also use can use valueOf()
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		System.out.println(sum);

		// repl 111

		/*
		 * Arrays.sort(nums); 
		 * // [1, 1, 2, 3, 4, 3, 4]
		 *  // [1, 1, 2, 3, 3, 4, 4] 
		 *  for (int i = 0; i < nums.length; i++) { 
		 *  if (i == 0) { if (nums[i] != nums[i + 1]) {
		 * System.out.println(nums[i]); 
		 * } 
		 * } else if (i == nums.length - 1) { if (nums[i]!= nums[i - 1]) { 
		 * System.out.println(nums[i]);
		 *  } 
		 *  } else { if (nums[i] !=nums[i - 1] && nums[i] != nums[i + 1]) { 
		 *  System.out.println(nums[i]);
		 *   }
		 */

		//   repl 111 different way
		
		/*
		 * int counter = 0;
		 *  int value = 0; 
		 *  // outer loop 
		 *  for(int i =0;i<nums.length;i++) {
		 * { // inner loop 
		 * for(int j =0; j<nums.length;j++) {
		 * 
		 * if(nums[i]==nums[j]) { 
		 * counter++; 
		 * }
		 * 
		 * } if(counter == 1) { 
		 * value = nums[i]; 
		 * break; 
		 * } 
		 * counter = 0; 
		 * }
		 * System.out.println(value);
		 * 
		 */

		/////////// Repl 118 split email
		
		
		
		
		
		
		
		
		
		
		
	}
}
