package arrayIntro;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		///////      REVERSE WORDS    ///////
		
		
		 
	    String str = "Sunday Perfect Day to start coding" ; 
	    // Reverse above sentence to generate below  
	    // coding start to Day Perfect Sunday
	    String[] strArr = str.split(" "); 
	    
	    for (int i = strArr.length-1 ; i >= 0 ; i--) {
	    
	      //System.out.print(strArr[i] + "-");
	    
	    }
	    
	    String strRev = "" ; 
	    int lastIndex = strArr.length-1 ; 
	    
	    for (int i = 0; i < strArr.length/2; i++) {
	      //System.out.print(strArr[i] );
	      String temp = strArr[i] ;
	      strArr[i] = strArr[lastIndex - i] ; 
	      strArr[lastIndex - i] = temp ;      
	    }
	    System.out.println(  Arrays.toString(strArr));
	    
	    
	    
	    
	    
	    /*
	     * Arrays Class methods to work with array object 
	     * 
	     * toString(arrObject) --->> return string rep of array items 
	     * sort(arrObject) ; --->  sort the array 
	     * copyOf(arrObject , lengOfNewArr) ---> new array with length defined 
	     *               and everything copied from original 
	     * copyOfRange(arrObject, from,to)  --> works like subString
	     * equals(arr1, arr2) ---> true false if all elements are the same and in same order
	     * 
	     * binarySearch
	     * */
	    
	    
	    
	    String[] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"}; 
	     
	     Arrays.sort(words);
	     System.out.println( Arrays.toString(words) );
	     
	     String[] first2words = Arrays.copyOf(words, 2) ;
	     System.out.println( Arrays.toString(first2words) );
	     
	     String[] tenItem = Arrays.copyOf(words,10) ;
	     System.out.println( Arrays.toString(tenItem) );
	     
	     
	     
	     
	     // Create a program to add items to an array by users input 
	     // {1,23,4,5,6}  , 17  ---> {1,23,4,5,6, 17}  
	     
	     Scanner scan = new Scanner(System.in);
	     
	     System.out.println("Enter your word");
	     String usersWord = scan.next();
	     
	    String [] newWords =Arrays.copyOf(words,  words.length+1);
	    System.out.println(Arrays.toString(newWords));
	    
	    int lastSpotIndex = newWords.length-1;
	    newWords [lastSpotIndex] = usersWord;
	    
	    System.out.println(Arrays.toString(newWords));
	    
	    
	    
	    
	    
	    
		
	
		
		
		
	}

}
