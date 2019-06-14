package arrayIntro;

import java.util.*;

public class ArrayReview {

	public static void main(String[] args) {
		
		
		 /*
	     *  3 ways to create an array 
	     * */
	    String names[] = new String[5] ; // --> default value is null for each items
	       names[0] = "abc" ; 
	       names[1] = "ef" ; 
	       names[2] = "gh" ; 
	     
	     System.out.println(Arrays.toString(names) );    
	     
	     String[] names2 = new String[] {"aaa","bbb", "" , "ccc"} ; 
	     
	     int x = 0 ; 
	     while(x< names2.length) {
	       
	       System.out.println(  names2[x] );
	       x++ ; 
	     }
	     
	     // This must happen in one statenment 
	     String[] names3  =  {"asdads","ssss0"} ; 
	     
	     
           /////////////Reverse the array/////////////////////////////////
		
	     /// reverse this array so the value of numbers array    
	     //  will be in reverse order
	     
	     int[] numbers = { 11,2,39,18,7,4,15};
	     System.out.println( Arrays.toString(numbers) );
	      
	     int count = numbers.length ; 
	     int lastIndex = count -1 ; 
	     
	     for (int i = 0; i < count/2; i++) {
	       
	        int temp = numbers[i] ; 
	        numbers[i] =  numbers[lastIndex - i] ; 
	        numbers[lastIndex-i] = temp ;  
	       
	     }
	     
//	     int temp ; 
//	      temp = numbers[0] ; 
//	      numbers[0] =  numbers[5] ; 
//	      numbers[5] = temp ;  
	 //    
//	      temp = numbers[1] ; 
//	      numbers[1] =  numbers[5-1] ; 
//	      numbers[5-1] = temp ;  
	 //    
//	      temp = numbers[2] ; 
//	      numbers[2] =  numbers[5-2] ; 
//	      numbers[5-2] = temp ;  
	 //    
//	      
//	      
	      
	      
	      System.out.println( Arrays.toString(numbers) );
	      
	      
	      ////////////////  Char to String Array   /////////////////////////////

	      
//	      
//	     String str = "Spartan" ;  // 7 
//	     
//      int size = str.length() ; 
//	     
//	      char[] myChars = new char[ size ]; 
//	     
//	      for(int i=0 ; i< myChars.length ; i++) {
//        
//	        myChars[0] =  'A' ; 
//        myChars[i] = str.charAt(i) ; 
//        
//	      }
//	    
//	      // toCharArray method is a method form String class 
//	      // and it will take no external data when being called 
//	      // and it will return character array that have each char of String object
//	     	      char[] myChars = str.toCharArray(); 
//	      System.out.println(Arrays.toString(myChars)   );
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
