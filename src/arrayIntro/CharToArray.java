package arrayIntro;

import java.util.Arrays;
import java.util.Scanner;

public class CharToArray {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Please enter name ");
	String name= scan.next();
	
	char [] nameTo = name.toCharArray();
	
	System.out.println(Arrays.toString(nameTo));
	
	int counter =0;
	
	for (int i = 0; i < nameTo.length; i++) {
		
		if(nameTo[i]=='a') {
			counter++;
		}
		
	}
	System.out.println("The count is "+counter);
	
	
		}
	}

