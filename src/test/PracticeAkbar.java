package test;

import java.util.Scanner;

public class PracticeAkbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
		    
String SMSmessage = "Sender:<Mike Smith>. From number:[202-123-3456].Message:{I love programing and problem solving}";
		
String sender, phoneNumber, message;		 
		 


 sender= SMSmessage.substring(8,18);//SMSmessage.substring(SMSmessage.indexOf("<")+1,SMSmessage.indexOf(">");
 phoneNumber = SMSmessage.substring(34,46);
 message = SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
 
	System.out.println("Sender's name is "+sender); 
	System.out.println(phoneNumber);
	System.out.println(message);
	}
}