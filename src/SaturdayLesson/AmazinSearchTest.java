package SaturdayLesson;

import java.util.Scanner;

public class AmazinSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc = new Scanner(System.in);
      
      // ask user to enter search
      // test if search tab appeared with the search name
      
    /*  
     
		System.out.println("Enter items to search for : ");
		String itemToSearchFor = sc.nextLine(); 
		
		System.out.println(  "You have entered : "+ itemToSearchFor);
		
		// Amazon.com : itemToSearchFor
		String expectedResult = "Amazon.com :iPad"  ; 
		String actualResult = "Amazon.com :"+itemToSearchFor ; 
		
		if(expectedResult.equalsIgnoreCase(actualResult) ) {
			System.out.println("Test pass for ipad");
		}else {
			System.out.println("Test Fail for ipad");
		}
	*/	
		
		String name= "About 813,000,000 results(0.56 seconds)";
		
		//how to get the part of the string
		
		if(name.indexOf("About")==0) {
			System.out.println("It started with "+name);
		}
		if(name.indexOf("result")>=0) {
			System.out.println("It contains ");
		}else {
			System.out.println("It doesn't contain");
		}
		
		// or different way
		
		if(name.contains("About")) {
		System.out.println(name);
		}	
		
		// or 
		
		//if(name.substring(0,5).equals("About") && name.contains("results")
		if(name.indexOf("About")==0) {
			System.out.println("It started with "+name);
		}
		if(name.indexOf("result")>=0) {
			System.out.println("It contains ");
		}else {
			System.out.println("It doesn't contain");
		}
		
		///////////////////////////////////////////////
		
		String word= "";
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


	
	
}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	


