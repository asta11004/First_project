package arrayIntro;

import java.util.Scanner;

public class SundayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		 
	    int[] nums2 = new int[] {1,2,3,4,5,65,6} ; 
	    System.out.println(nums2[5]);
	    
	    int[] nums3 =  {1,2,3,4,5,65,6} ; 
	    
	    // the declaration and initilization need to happen in same line 
//	    int[] nums4  ; 
//	     nums4 =  {1,2,3,4,5,65,6} ; 
	    
	    // getting the count of items 
	    System.out.println(  nums3.length  );
*/    
		
//		
//		String names[] = { "Asta", "Mario", "Jake", "Emily", "James" };
//		
//		System.out.println(names[2]);
//		System.out.println(names[names.length-1]) ;     //(names.length-1);------>4
//		
//		
//		names[2] = "Souad";
//		System.out.println(names[2]);
//		
////	
		
		  
	    // create an char array that contains your name characters
	    // create 3 array using the 3 different ways that you learned 
	    
	    // print out each items of your nameArray 
	    
	    char[] myNameChar = new char[6];
	    myNameChar[0] = 'M';
	    myNameChar[1] = 'E';
	    myNameChar[2] = 'H';
	    myNameChar[3] = 'M';
	    myNameChar[4] = 'E';
	    myNameChar[5] = 'T';
	    
	     System.out.print( myNameChar[0] );
	     System.out.print( myNameChar[1]);
	     System.out.print( myNameChar[2]);
	     System.out.print( myNameChar[3]);
	     System.out.print( myNameChar[4]);
	     System.out.print( myNameChar[5]) ; 
	     
	     System.out.println( );
	     for (int i = 0; i < 6; i++) {
	    System.out.print( myNameChar[i]  );
	     }
	     System.out.println( );
	     
	     
	     
	     
	     char[] myNameChar2 = new char[] {'G', 'u', 'l','j','a','h','a','n'} ; 
	     
	     //for (int i = 0; i <= myNameChar2.length-1 ; i++) {
	     for (int i = 0; i < myNameChar2.length ; i++) {
	      System.out.print( myNameChar2[i] + " " );
	     }
	     System.out.println();
	     
	     
	     
	     
	     
	                 // 0    1    2    3    4    5    6    7 
	     char[] myNameChar3 = { 'B', 'e', 'n', 'j', 'a', 'm', 'i', 'n'};
	     
	     /// how do we get last items 
	     int count = myNameChar3.length ; 
	     
	     System.out.println( "item in last index : " +  myNameChar3[count-1] );
	     // how do we get the one in the middle 
	     
	     int midIndex = count/2 ; 
	     
	     System.out.println( "item in mid index : " +  myNameChar3[midIndex] );
	     
	     
	     //              REVERSE
	     
	     

	     System.out.print( myNameChar3[7] + " " );
	     System.out.print( myNameChar3[6] + " " );
	     System.out.print( myNameChar3[5] + " " );
	     System.out.print( myNameChar3[4] + " " );
	     System.out.print( myNameChar3[3] + " " );
	     System.out.print( myNameChar3[2] + " " );
	     System.out.print( myNameChar3[1] + " " );
	     System.out.print( myNameChar3[0] + " " );
	     
	     
	     //    n i m a j n e B      -->Benjamin
	     
	     
	     
	     System.out.println();
	     
	     for(int i=7 ; i>=0 ; i--) {
	       System.out.print( myNameChar3[i] + " "   );
	     }
	      
	     
	     Scanner scan = new Scanner(System.in) ; 
	     
	     int[] arr = new int[3] ; 

	     for (int i = 0; i < arr.length; i++) {
	       
	       System.out.println("enter number " + (i+1) );
	       arr[i] = scan.nextInt();
	       System.out.println( arr[i] );
	     
	     }
	     
	}

	     
	     
	     
	     
	     // BAD WAY TO GET THE MAX 
	     // INITIAL VALUE PREFERRABLY THE FIRST ITEM 
	     
	     
	     
	     
	     
//	     int max = 0 ; 
//	     for (int i = 0; i < arr.length; i++) {
//	       
//	       if(arr[i]> max  ) {
//	         max = arr[i] ; 
//	       }
//	       
//	     }
//	     System.out.println(max);
	     
/*	     int min = arr[0] ; 
	     for (int i = 1; i < arr.length; i++) {
	       
	       if(arr[i]< min  ) {
	         min = arr[i] ; 
	       }
	       
	     }
	     System.out.println("min value is : "+ min);
*/	      
	     
	     
	     
	     
	     



	 
}




