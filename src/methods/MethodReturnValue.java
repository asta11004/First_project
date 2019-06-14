package methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodReturnValue {

	public static void main(String[] args) {
	     
		  Scanner scan = new Scanner(System.in);
		    
		    int size = scan.nextInt();
		    
		    int[] nums = new int[size];
		  int  last=0;
				for(int i =0; i < size; i++) {
					nums[i] = scan.nextInt();
				}
				//WRITE YOUR CODE HERE
					
					int len = size*2;
					int[] arr = new int[len];
					arr[len-1] = nums[nums.length-1];
					System.out.println(Arrays.toString(arr));		
					
					
					
					
					
					
//					
//			for(int j=0; j<=nums[i]; j++){
//			 last=nums[i]; 
//			}  
//			}
//				//int empty[]=  new int [size*2-1+mine] ;
//				int mine[]=	{last} ;           //[size*2-1]	;	
//				int empty[]=  new int [size*2-1] ;
//				System.out.println(Arrays.toString(Arrays.copyOfRange(nums, nums[size-1], nums[size-1])));
//				System.out.println(Arrays.toString(mine));
		  
}
	    
	}
	