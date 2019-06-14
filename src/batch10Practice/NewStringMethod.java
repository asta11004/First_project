package batch10Practice;

import java.util.Arrays;
import java.util.Scanner;



public class NewStringMethod {

	public static void main(String[] args) {
	
	shoppingList("bannana","milk","vodka", "butter");

}

	public static void shoppingList(String ...list) {
		for(String each : list) {
			
		
		System.out.print(each+" ");
		}
	}
}
