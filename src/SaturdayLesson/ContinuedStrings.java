package SaturdayLesson;

import java.util.Scanner;

public class ContinuedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner scan= new Scanner(System.in);
	   String name;
		System.out.println("Please enter the name :" );
		name= scan.nextLine();
		
		System.out.println(name.startsWith("A")&& name.endsWith("x"));
		
		System.out.println(name.lastIndexOf("a"));
		
	 
	  int count = name.length() ; 
		
		if(count>2) {
			
			
			if(count % 2==1) {
				 //01234   5 character      a
				// Adaam   5/2=2 
				
				int midIndex = count/2 ; 
				System.out.println(  name.charAt(midIndex)  );
				
			}else {
				// 012345  6 chars   hm
				// mehmet  6/2 -->  3   
				int midIndex = count/2 ; 
				char midR = name.charAt(midIndex);
				char midL = name.charAt(midIndex-1);

				System.out.println(""+midL + midR );
				
		*/		
	/*			
		 String str = "    GOO      JAVA SPARTAN   " ; 
	        
	        System.out.println(str);
	        
	        //System.out.println(str.trim() );
	        
	        // get  JAVA SPARTAN from above String 
	        int indexO = str.lastIndexOf("O"); 
	        
	        String part = str.substring(indexO + 1) ; 
	        System.out.println( part.trim() );
	        
	        
	        System.out.println(  str.substring(indexO + 1)  );
	        System.out.println(  str.substring(indexO + 1).trim()  );
	        //str.length().trim() ;  BAD
	    */  
	        
	        ////// REPLACE METHOD//////////////
	        
	        
	        String str = "Date is 03_25_2019";
	         str = str.replace('_', '-');
	        
	        System.out.println(str);
	        
	        str = str.replace("is", "will be");
	        System.out.println(str);
	        
	        System.out.println(str.replace("Date will be ", ""));
	        
	        
	    }
	

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		}
		
			
			

