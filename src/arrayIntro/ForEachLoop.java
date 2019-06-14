package arrayIntro;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		

		  int[] nums = {1,33,567,11,22} ; 
		    
		    for (int i = 0; i < nums.length; i++) {
		      
		      int eachItem = nums[i] ; 
		      System.out.println(eachItem);
		      
		    }
		    
		    // for each loop sytax 
		    /*
		     * for ( eachItemDataType variable name : collectionVariable ) {
		     *     your action in here
		     * }
		     * for each loop  or enhanced for loop  
		     * 
		     * for each loop can only be used for looping through collection type
		     * */
		    for( int eachItem  : nums ) {
		      System.out.println(eachItem);
		    }
		    	
		String[] str = {"I", "love", "Cybertek", "school"};
		for(String word : str) {
			System.out.println(word);
			
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the word");
		String word = scan.next();
		char [] w =word.toCharArray();
		for(char x   : w  ) {
			System.out.print(x+"-");
			
			//Enter the word
			//astuliukas
			//a-s-t-u-l-i-u-k-a-s-
		}
		
		
		
		
		
		
//	    String word = scan.next();

//	    char[] characs = word.toCharArray();
	//
//	    for (char yes : characs) {
//	      System.out.print(yes + "-");
//	    }
//	    System.out.println();
	//    
	//    
//	    String[] splitted = word.split(""); 
//	    for( String each :splitted ) {
//	      System.out.print(each + "-");
//	    }
	    
	      /*
	     * ask user for a sentence split it to get each word use for each loop to print
	     * out each word
	     */
		System.out.println();
		
	    System.out.println("Enter a sentence");
	    
	    String sentence = scan.nextLine(); 
	    String[] words =  sentence.split(" "); 
	    
	    for(String eachWord : words) {
	      System.out.println(eachWord);
	    }
		
		
		
		
		
		
		
		
		
		
		
	}

}
