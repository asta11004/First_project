package loops;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
				///////////////FOR LOOPP/////////////////
		
		
//		//(initilazation; termination;increasement)
//		for(int i=0; i<5;i++) {
//			System.out.println("Happy "+i);
//		}
//		
//		
//	
		
//		
//		for(int x= 0; x<=10 ;x++) {
//			System.out.print(x+", ");
//		}
//		System.out.println();
//		
//		for(int y= 10; y>=0; y--) {
//			
//			System.out.print(y +", ");
//		}
		
		
		
		
		
		
		           //    NAME SPACED AND BACKWARDS
		  
	    String name = "Muhammad Hayrulla Cisem" ; 
	    
	    int count = name.length(); 
	    
	    for (int i = 0; i <count ; i++) {
	      System.out.print( name.charAt(i) + " "  );
	    }
	    
	    System.out.println();
	    
	    	
		for(int i=count-1;i>=0; i--) {
			System.out.print(name.charAt(i)+" ");
		}
		
		
		
		
		
		

//		// how many letter a showed up in this String
//		String str = "Ali K Durhan";
//
//		// go through each and every character
//		// if i see a , i will increment my counter by 1
//
//		int count = 0;
//		int x = 0;
//
//		do {
//
//			char c = str.charAt(x);
//			if (c == 'a' || c == 'A') {
//				System.out.println("BINGO at " + x);
//				++count; // count = count + 1;
//			}
//			// System.out.println( + " ");
//			x++;
//
//		} while (x < str.length());
//
//		System.out.println(count);
//		
		///// CHECK THE FIRST CHARACTER

		// java20awesome---->> javaawesome 20
//	    
//	    String mix = "Aonline132x";
//	    
//	    char c = mix.charAt(0); 
//	    
//	    // check whether c is between 0 - 9 
//	    //if( c>= 32 && c<= 41 ) {
//	      
//	    if( c>= '0' && c<= '9' ) {
//	      System.out.println("NUMBER!!");
//	    }else {
//	      System.out.println("NOT NUMBER!!");
//	    }
//	    
//	    if( c>= 'A' && c<= 'Z' ) {
//	      System.out.println("UPPERCASE!!");
//	    }else {
//	      System.out.println("NOT UPPERCASE!!");
//	    }
//	    

		///////////////// CHECK ALL CHARACTERS
//		
//		String mix = "asta667rt";
//		
//		int i = 0;
//		
//		while(i<mix.length())   {
//			char c = mix.charAt(i);
//			System.out.println(c);//(i) just how many numbers
//			i++;
//		}
//		

//
//	    String mix = "Aonline132x";
//	    String numberStr = "";  
//	    
//	    int i = 0 ; 
//	    
//	    while(i< mix.length()) {
//	      
//	      char c = mix.charAt(i); 
//	      
//	      if( c>= '0' && c<= '9' ) {
//	        //System.out.println(c);
//	        numberStr = numberStr + c ; 
//	      }
//	      
//	      i++ ; 
//	    }
//	    
//	    int y = 0 ; 
//	    do {
//	      
//	      char c = mix.charAt(y);
//	      
//	      
//	      if(c  >= 'a' && c  <= 'z') {
//	        System.out.println(c);
//	        
//	      }
//	      y++; 
//	      
//	    } while (y< mix.length());
//	    
//	    
//	    System.out.println(  numberStr );
//	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
