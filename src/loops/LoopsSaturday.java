package loops;

import java.util.Scanner;

public class LoopsSaturday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in)	;
	
	/*   
	    System.out.println("ENTER A WORD");
	    String str = scan.next();
	    // how to check whether string start with a-z
	    
	    char firstChar = str.charAt(0);

	    // CREATE A PROGRAM LIKE ABOVE 
	        // to check whether user input first character
	        // 1 , started with number
	        // 2 , end with uppercase
	        
	        
	    if (firstChar >= '0' && firstChar <= '9') {

	      System.out.println(" number ");

	    } else {

	      System.out.println("NOT number ");
	    }
	    
	    // 2 , end with uppercase
	    char lastChar = str.charAt(  str.length()-1  ) ; 
	    
	    if (lastChar >= 'A' && lastChar <= 'Z') {

	      System.out.println(" UPPER CASE ");

	    } else {

	      System.out.println("NOT UPPERCASE ");
	    }
	    ///////////////////////////////////////////////////////////
	    	
		System.out.println("Please enter the sentance");
		
		while(!sentence.contains("java")) {
			sentence=scan.nextLine();
		
			System.out.println("Please enter the sentance");
			
		}
		System.out.println("Great job");
		
		
		
		System.out.println("Enter the name");
	    
	    String name=scan.nextLine();
	  
	    int  x=0;
	    int count =name.length();
	    
	    
	    while(count>0) {   //NOT (count>=0)!!!!!!!!!!!
	    	System.out.print(name.charAt(count-1)+ "-");
	    	--count;
	    }
	    
	    //count--
		//System.out.print(name.charAt(count)+ "-");
		
		
		// or  System.out.print(name.charAt(count--)+ "-");
		
		// word PALINDROM---- reverse word  civic, gag, ana,
	*/
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////
	
	          //             REVERSE THE WORD
	
	
	/*   
	   
	   System.out.println("enter  the word");
	   String name = scan.next();
	   int count =name.length();
	String reversed ="";
	   
	while(count>0) {
		count--;
		//System.out.println(name.charAt(count));
		reversed =reversed +name.charAt(count);
		//reversed+=name.charAt(count);
		System.out.println(reversed);
		
	}
	
	System.out.println("PALINDROM "+name.equals(reversed));
	
	
	

    String star ="*";
	
	int x=1;
	
	while(x<=5) {
		System.out.println(star);
		star=star+"*";
		x++;
	}
	
/*
	int x = 1;
	String star ="*";
	String allStar ="";
	
	while(x<=5) {
		allStar = allStar+star;
		x++;
		
	}
	System.out.println(allStar);
*/	
	

    String star ="*";
	
	int x=1;
	
	while(x<=5) {
		System.out.println(star);
		star=star+ star;
		x++;
	}
	
	}

}
