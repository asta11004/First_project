package aaaaa;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String model = scan.next();
	    int year = scan.nextInt();
	    boolean recalled = false;


		if(model.equals("Extravagant")&& year>=2010 || year<=2012 || (model.equals("Guzzler")&& year>=2015 || year<=2018)){
		  recalled=true;
		  
		//else if(model.equals("Guzzler")&& year>=2015 || year<=2018){
		 // recalled=true;
		  
		} else {
		  recalled=false;
		 
		}
		  }
}