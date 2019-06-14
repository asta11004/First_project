package arrayIntro;

import java.util.*;
import java.util.Arrays;
import java.util.Random;
public class ArrayUtil {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in) ; int[] nums = new int[]{1,45,33,100,8}
		 * ;
		 * 
		 * System.out.println(nums);
		 * 
		 * // Array is object that store multiple items of same type
		 * 
		 * // // Arrays is Utility class that comes with JDK just like scanner // Arrays
		 * class in in java.util package // it provide lots of pre-defined methods to
		 * work with // array objects String str = Arrays.toString(nums) ;
		 * System.out.println( str );
		 * 
		 */

		///// how many over 100 count

		int[] nums = { 1, 55, 7, 898, 9, 55, 676 };

		System.out.println(Arrays.toString(nums));

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > 100) {
				count++;
			}

		}
		System.out.println(count);
		
		//////////////////////////////////////////////////////////////////////
		
		//         Random Rand  ( random number within a range
		


  
    
    Random rand = new Random() ; 
    int[] number = new int[10] ; 
    
    for (int x = 0; x < 10; x++) {
      // 0- 100-1
      number[x] = rand.nextInt(100);
      
    }
    
    System.out.println( Arrays.toString(number) );

  }


		
		
		
	}


