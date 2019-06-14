package arrayIntro;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		
		
		  
	    int[] nums =  {11,20,4,6,54,19,6} ; 
	    
	    Arrays.sort(nums);
	    System.out.println( Arrays.toString(nums) );
	    // ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
	    
	    int item = Arrays.binarySearch(nums, 5) ;
	    System.out.println(item);
	    
	    int item20 = Arrays.binarySearch(nums, 20) ;
	    System.out.println(item20);
	    
	    
	    
		
		////////// fill in 0's with selected number////////////
	    
	    
//	    
//	    
//	    int[] nums100 = new int[100] ; 
//	    Arrays.fill(nums100, 5);
//	    System.out.println(Arrays.toString(nums100));
//	    
//		
		
		
		
		
		
		
		
		
		

	}

}
