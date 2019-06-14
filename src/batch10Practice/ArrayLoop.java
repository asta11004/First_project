package batch10Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoop {

	public static void main(String[] args) {

		int[] nums = { 2, 39, 88, 107, 1, 39, 67, 88, 22, 44 };
		int lookFor = 100;
		boolean found = false;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == lookFor) {
				System.out.println(lookFor + " was found at " + i);
				found = true;
				break;
			}

		}
		if (found == false) {

			System.out.println(lookFor + " not found");
		}

//////////////////////////////////////////////////////////////////////////////

		double[] prices = { 33.80, 44.78, 1.45, 578.44, 49.52, 769.43, 33.44, 66.23, 2.33, 21.12 };
		int count = 0;
		
		for(int i=0; i<prices.length;i++) {
			
			if( prices[i]>20) {
				count++;
			
		 }
		}
		if(count==0) {
			System.out.println("No item is more than $20");
				
		}else {
			System.out.println(count+ " items with more than $20");
		}
	
		//////////////////////////////////////////////////////////////////	
		
		
		///           Create  arrays using scanner
		
	    Scanner scan =new Scanner(System.in);
		
		System.out.println("How many items in the array?");
		int count1= scan.nextInt();
		
		// create the array with that capacity called nums1
		
		int [] nums1 =new int[count1];
		
		//using loop enter values one by one
		
		for(int i= 0; i<count1;i++) {
			
			System.out.println("Enter the number");
			
			nums1[i] = scan.nextInt();
			
		}
		System.out.println(Arrays.toString(nums1));
	}

}
