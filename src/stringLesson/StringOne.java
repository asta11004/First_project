package stringLesson;

import java.util.Scanner;

public class StringOne {

	public static void main(String[] args) {
		
                //Reverse the String
		
		Scanner scan =new Scanner(System.in);
		
//		String word = scan.nextLine();
//		
//		String reverse;
//		
//		for( int i=word.length()-1;i>=0; i--) {
//			 reverse = word.charAt(i)+"";
//		System.out.print(reverse);
//	}
		
		 /*
	     * write a program to get unique characters from a string  
	     * : aaabbccc —> abc
//	     * */
//	    String str = "aaabbccc" ; 
//	    String uniqueStr = "" ; 
//	    
//	    for (int i = 0; i < str.length(); i++) {
//	      
//	      String eachChar = str.substring(i, i+1) ; 
//	      
//	      if(! uniqueStr.contains(eachChar) ) {
//	        uniqueStr += eachChar ; 
//	        System.out.println(eachChar);
//	      }
//	      
//	      //System.out.println(eachChar);
//	      
//	    }
//		
	    // EXTRACTING LOWERCASE LETTERS, BUT IT WORKS FOR FINDING EVERYTHING 
	    
		   String str = "5 Little Monkey Jumping on The Bed"; 
		    
//		    char eachChar = 'H' ; 
//		    System.out.println( eachChar >= 'a' );
//		    System.out.println( eachChar <= 'z' );
		//    
//		    if( eachChar >= 'a' && eachChar <= 'z')  {
//		      System.out.println("IT'S lowercase");
//		    }
//		    System.out.println("THE END");
		    
//		    String allLowercaseStr = ""; 
//		    for (int i = 0; i < str.length(); i++) {
//		      /// storing each character inside variable each
//		      // each iteration it will store that char 
//		      char each = str.charAt(i); 
//		      // checking whether this character at this iteration 
//		      // is within the range of a-z
//		      if( each >= 'a' && each <= 'z')  {
//		        allLowercaseStr += each ;  // add on top of each other
//		        //System.out.println("IT'S lowercase : " + each );
//		      }
//		    }
//		    System.out.println( allLowercaseStr);
//		    
		    
		
		//        PRINT FROM "a"  TO "z"
		   
		   
		
		   
		    char a = 'a' ; 
		    
//		    System.out.println( a+1 );
//		    char next =  (char) (a + 1) ; 
//		    System.out.println(next );
		//    
//		    int asciiCode = 'a' ; 
//		    System.out.println(asciiCode);
		    
		    
		    for(int i = 'a' ; i<= 'z' ; i++ ) {
		      
		      char eachChar = (char) i ; 
		      System.out.print( eachChar);
		      
		    }
		   
		    
		    // write a program to print all the char from beginning char 
		    // to ending char 
		    // if beginning character is before ending character 
		    // just print in low to high order 
		    // if ending character is before beginning char 
		    // then print in high to low order
		    
		   
		   
		   
		
		
		
	    
	}


}
