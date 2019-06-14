package java8thEdition;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
   Scanner scan=new Scanner(System.in);
	String word = scan.nextLine();
   String last =word.substring(word.lastIndexOf(" ")+1,word.length() );
   System.out.println(word.substring(word.lastIndexOf(" ")+1,word.length())+word);//+word.substring((0),word.indexOf(" ")));
   
 //  System.out.println(word.substring(word.lastIndexOf(" ")+1,word.length() ));
   
   
	}

}
