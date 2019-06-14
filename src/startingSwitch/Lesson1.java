package startingSwitch;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		  
		  Scanner input= new Scanner(System.in);
		   int areaCode=input.nextInt();
		   int localNumber=input.nextInt();
		   
		   String phoneNumber= "(+ areaCode+)"+localNumber;
		   System.out.println("Calling number"+phoneNumber);
		 
	}

	

}
