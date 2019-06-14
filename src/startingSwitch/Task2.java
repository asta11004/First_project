package startingSwitch;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double iphone = 599.99, ipad = 899.00, budget;

		int phoneCount, ipadCount;

		System.out.println("How many phones do you want to buy?");
		phoneCount = scan.nextInt();
		System.out.println("How many ipads would you like to buy?");
		ipadCount = scan.nextInt();

		System.out.println("What is your budget?");
		budget = scan.nextInt();

		double total = (iphone * phoneCount) + (ipad * ipadCount);

		if (total<budget) {
			System.out.println("You can buy it!!!!");
		} else {
			System.out.println("Save some more...");

		}
	}

}
