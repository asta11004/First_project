package officeHour;

import java.util.Scanner;

public class VasyReverseNumber {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		    reverseNumber(3456765);
		  }
		  
		  public static void isPalindrome(int num){
		
		
		// WRITE YOUR CODE HERE
        int reversedNum = 0;
        int originalNum = num;
        while (num > 0) {
            // 1 iteration (0 * 10)+ 1 , reversedNum = 1, num/10 -> 100
            // 2 iteration 1 * 10 + 0, reversedNum = 10, num/10 -> 10
            // 3 iteration (10 * 10) + 0, revesedNum = 100, num/10 -> 1
            // 4 iteration (100 * 10) + 1, revesedNum = 1001
            // 8%10 = 8, 1%10 = 1, 10%10 = 0
            reversedNum = reversedNum * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(reversedNum == originalNum);	
		
		
	}
		  public static int reverseNumber(int num) {
		        int reversedNum = 0;
		        while (num > 0) {
		            reversedNum = reversedNum * 10 + num % 10;
		            num = num / 10;
		        }
		        return reversedNum;
		    }
}
