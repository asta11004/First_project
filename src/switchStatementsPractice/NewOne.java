package switchStatementsPractice;

import java.util.Scanner;

public class NewOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	 	 Scanner scan1=new Scanner(System.in);
			 double checkAmount; double tipAmount=0
					 ; String serviceQuality;
			 int peopleNumber; String peopleSplit; 
			 
			   System.out.println("Split:");
			   String split=scan1.next();
			   if (split.equalsIgnoreCase("yes") ){
				   
			     System.out.println("Number of people:");
			   peopleNumber=scan1.nextInt();
			  /* switch (peopleNumber){
			     case 1:
			       peopleSplit="&";
			       break;
			    case 2:
			       peopleSplit="&&";
			       break;
			     case 3:
			       peopleSplit="&&&";
			       break;
			     case 4:
			       peopleSplit="&&&&";
			       
			   }
			   */
			   if(peopleNumber==4) {
				   peopleSplit="&&&&";
			   }else {
				   peopleSplit="&&&&&";
			   }
			   
			   
			   
			   
			   System.out.println("Check amount:");
			    checkAmount=scan1.nextDouble();
			    
			   
			   System.out.println("Service Quality:");
			    serviceQuality=scan1.next();
			   // String serviceQuality=serviceQuality.equalsIgnoreCase;
			   // serviceQuality=serviceQualitytipAmount;
			   
			    if (serviceQuality.equalsIgnoreCase("poor")){
			      
			        tipAmount=checkAmount*5/100;
			   } if (serviceQuality.equalsIgnoreCase("fair")){
			       
			        tipAmount=checkAmount*10/100;
			   } if (serviceQuality.equalsIgnoreCase("good")){   
			       tipAmount=checkAmount*15/100; 
			   }   if (serviceQuality.equalsIgnoreCase("great")){
			         tipAmount=checkAmount*20/100;
			   }if (serviceQuality.equalsIgnoreCase("excellent")){
			        tipAmount=checkAmount*25/100; 
			       
			    }
			 double totalTip=tipAmount;
			 // checkAmount
			//  double totalPerPerson=checkAmount+;
			//  tipPerPerson
			 System.out.println("Number of people entered: "+peopleSplit);
			  System.out.println("Total to pay: "+checkAmount);
			   System.out.println("Total tip: "+tipAmount);
			    System.out.println("Total per person: "+((checkAmount+tipAmount)/peopleNumber));
			    System.out.println("Tip per person: "+ totalTip/peopleNumber);
		
			  }
			}
}

		
	/*	int dayNum; 
		String dayWord="";
		
		System.out.println("Enter the day number:");
		dayNum=scan.nextInt();
		
		switch(dayNum) {
		
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
		break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
		break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
		break;
		default:
			System.out.println("Try again");
		
		
			System.out.println(dayNum);
	*/		
		

	/*	

		System.out.println("Please enter number between 1-7");
		int dayNum = scan.nextInt();

		String wordDay;

		switch (dayNum) {
		case 1:
			wordDay = "Monday";
			break;
		case 2:
			wordDay = "Tuesday";
			break;
		case 3:
			wordDay = "Wednesday";
			break;
		case 4:
			wordDay = "Thursday";
			break;
		case 5:
			wordDay = "Friday";
			break;
		case 6:
			wordDay = "Saturday";
			break;
		case 7:
			wordDay = "Sunday";
			break;
		default:
			wordDay = "Invalid Entry!!!";
			break;

		}
		System.out.println("Today is "+wordDay);

		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


