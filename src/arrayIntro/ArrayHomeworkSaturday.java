package arrayIntro;

import java.util.Arrays;

public class ArrayHomeworkSaturday {

	public static void main(String[] args) {

		// print true if all are numbers are more than 10
		// print false if not

		// print false as long as one number are false
		

		int[] num = { 25, 28, 23, 12, 53, 67 };

		boolean result = true;

		for (int i = 0; i < num.length; i++) {

			if (num[i] <= 10) {
				result = false;
				break;
			}
		}

		System.out.println(result);
		
		
		
		 /*
	     * /Task 2 :
	      given : 
	      String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	      
	      use the method your learned to get each words
	      and store it into String array: 
	      
	      loop through each items -- 
	        in each iteratrion loop : 
	           turn each word into char array 
	           print each char out with seperated by -
	      output : 
	        C-y-b-e-r-t-e-k-
	        B-a-t-c-h-
	        S-p-a-r-t-a-n-
	        i-s-
	        m-o-s-t-
	        h-a-r-d-w-o-r-k-i-n-g-
	        o-n-e-
	        e-v-e-r-

	     * */
		
		
		
	    String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	    String[] words = str.split(" "); // what seperates the words
	    System.out.println( Arrays.toString(words)  );
	    //[Cybertek, Batch, Spartan, is, most, hardworking, Batch, ever]
	    

	    
	    for (int i = 0; i < words.length; i++) {
	      //System.out.println(words[i]);
	    
	      String one = words[i] ; //"Cybertek" ;  //C-y-b-e-r-t-e-k-
	      char[] cyberChars = one.toCharArray() ; 
	      
	      for(int j = 0 ; j < cyberChars.length ; j++) {
	        System.out.print(cyberChars[j] + "-");
	      }
	      System.out.println();
	    
	    }
	    
	  /*  
	    String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	    String[] words = str.split(" ");  
	    String reversedSentence = "";
	    
	    for (int j = 0; j < words.length; j++) {
	     
	    
	      String one = words[j] ;  // in each iteration this will be a new word
	      char[] wordChars = one.toCharArray(); // this create char array for words
	      int lastIndex = wordChars.length-1 ; 
	      
	      for (int i = 0; i < wordChars.length/2; i++) {
	        /// create a temp char variable so we can temp store the value we want to swap
	         char temp = wordChars[i]; 
	         wordChars[i] =  wordChars[lastIndex-i] ; 
	         wordChars[lastIndex-i] = temp ; 
	      }
	      // how to change char array to a String 
	      String reversed = new String(wordChars);
	      
	      reversedSentence = reversedSentence + reversed + " " ; 
	     
	    
	    }
	    
	    System.out.println(reversedSentence);

	    
	    
	    
	    
	    
//	    String revString="";
//	    
//	    for(int k=0;k<cyberTek.length;k++)
//	    {
//	      String word=cyberTek[k];
//	      
//	      String revWord="";
//	      for(int l=word.length()-1;l>=0;l--)
//	      {
//	        revWord=revWord+word.charAt(l);
//	      }
//	      revString=revString+revWord+" ";
//	    }
//	    System.out.println();
//	    System.out.println(revString);
//	
 * 
 */
	  }

	}
