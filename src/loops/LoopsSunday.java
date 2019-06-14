package loops;

import java.util.Scanner;

public class LoopsSunday {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 * String name =""; String pass ="";
		 * 
		 * do { System.out.println("Enter user name : "); name = scan.next();
		 * System.out.println("Enter your password : "); pass= scan.next();
		 * 
		 * }while( ! (name.equals("abc")&& pass.equals("123") ) );
		 * 
		 * 
		 * System.out.println("END");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * String name =""; String pass ="";
		 * 
		 * 
		 * while( ! (name.equals("abc")&& pass.equals("123") ) ) {
		 * 
		 * System.out.println("Enter user name : "); name = scan.next();
		 * System.out.println("Enter your password : "); pass= scan.next();
		 * 
		 * 
		 * System.out.println("END"); }
		 */

		/*
		 * String name = "Asta";
		 * 
		 * char x = 0;
		 * 
		 * do { System.out.print(name.charAt(x) +" "); x++; } while(x<name.length());
		 */

		/////////////////// BREAK STATEMENT ////////////////////

		// Used in Switch or Loop
/*
		int x = 10;
		do {
			System.out.println(x);
			x++;
			if (x > 50) {
				break;
			}

		} while (x < 100);
*/
		
		
		
		
		int x= 1;
		
		int sum = 0;
		
		do {
			System.out.println(x+" "+sum);
			sum+=x;
			x++;
			if(x>10) {
				break;
			}
			
		} while (sum<=50);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
