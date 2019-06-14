package arrayIntro;

import java.util.Arrays;

public class CharArrayToString {

	public static void main(String[] args) {
		
		
		
	String groceries = "bananna, orange, apple, kiwi, mango" ;
	
	String []fruits = groceries.split(",");
	System.out.println(fruits.length);
		System.out.println(Arrays.toString(fruits));
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].trim()+" : "+fruits[i].length());
			
			
		}
		
		
		
		
		
		

	}

}
