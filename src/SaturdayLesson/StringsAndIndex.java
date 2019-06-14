package SaturdayLesson;

import java.util.Scanner;



public class StringsAndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Scanner scan = new Scanner(System.in);
  	
		
  	String word = "Sunday is Java Day";
  	String word1= word.toUpperCase();
  	
  // if you don't know the word	
  /*	
  	int count = word.length();
  	
  	char last = word.charAt(count-1); 
	char oneBefore = word.charAt(count-2); 
  	System.out.println(oneBefore+""+last);
  	
  //(another way)--->	word.substring(count-2,count)
   *     or----->       word.substring(word.length()-2)
  */	
  	
    System.out.println(word1);
    System.out.println("Last two characters are:  "+ word.substring(16));
    System.out.println("The position of 'is' is : "+ word.indexOf("is"));
    System.out.println(word.contains("Java"));
   //other way  ----> System.out.println(word.indexOf("Java")>-1);
    /////////
 
    // for second word "is"
                   //01234567890123456789
                   //Ahmad Omar Al Alousi 
      int indeOfFirstSpace = word.indexOf(" ");
    String word2 = word.substring(indeOfFirstSpace+1, indeOfFirstSpace+3);
    System.out.println( word2  );
    
    
    int space1 = word.indexOf(" ");
    int space2 = word.indexOf(" ", space1+1);
    int space3 = word.indexOf(" ", space2+1);
    

	String name = word.substring(space1+1 , space2); 
	System.out.println(word);
	String name2 = word.substring(space2+1, space3); 
	System.out.println(word2);
	
    
    //  can use-->  word.lastIndexOf(" ");
	

	// str.lenth()>0   ====>>> isEmpty() 

		String str = "";

		System.out.println(str.isEmpty());

    
    
    
    
	}

}
