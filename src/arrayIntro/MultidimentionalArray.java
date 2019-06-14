package arrayIntro;

import java.util.Arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		

	    /*
	     * 2 dimensional array can be visualized as excel sheet 
	     *   which has rows and columns
	     *  first dimension size of 2d array can be seen as row count 
	     * second dimension size of 2d array can be seen as column count
	     * 
	     * 12 17 3 40 44 27 23 12
	     */
//	    int[][] data = new int[4][2];
//	    data[0][0] = 12;
//	    data[0][1] = 17;
//	    data[1][0] = 3;
//	    data[1][1] = 40;
//	    data[2][0] = 44;
//	    data[2][1] = 27;
//	    data[3][0] = 23;
//	    data[3][1] = 12;
//
//	    int[][] data2 = new int[2][4];
//	    int[] data3[] = new int[3][2] ;  
//	    int data4[][] = new int[2][2] ; 
	    	
		

		//2 dim array is an array object that store one dim array in each slot
		 
	    int[] nums1 = new int[] {1,3,5} ; 
	    int[] nums2 = new int[] {1,13} ; 
	    
	    // 2 dimesional array is an array object that store 
	    // 1 dimensional array in each slot 
	    
	    int[][] numsOfnums = new int[2][] ;
	    // length method on an array will always return first dimension length
	    System.out.println( numsOfnums.length );
	    
	    numsOfnums[0] = nums1 ; 
	    numsOfnums[1] = nums2 ; 
	    
	    for (int i = 0; i < numsOfnums.length; i++) {
	      
	      System.out.println( Arrays.toString(numsOfnums[i])  );
	      System.out.println( numsOfnums[i].length  );
	      
	    }
	    
	    for( int[] eachRow :  numsOfnums ) {
	      
	      for( int eachCell : eachRow) {
	        
	        System.out.print( eachCell + " " );
	        
	      }
	      
	    }
	  
	  }

	}