package batch10Practice;

import java.util.Scanner;

public class ForLoop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan= new Scanner(System.in);	

	System.out.println();
	int start=scan.nextInt();
	int end = scan.nextInt();
	
	if(start<end) {
		for(int x=start; x<=end;x++) {
		System.out.println(x);	
		
		}
	}if(start>end) {
		for(int y=0;y<=start;y--) {
			System.out.println(y);
		}
		
		
	}
	
	
	
	
	
	
}

	}
