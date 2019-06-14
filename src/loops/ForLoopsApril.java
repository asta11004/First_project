package loops;

import java.util.Scanner;

public class ForLoopsApril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in)	;

	 
    // TASK 2.1 
    /*
     * USING FOR LOOP 
     * 
     * from 1 to 50 
     * 
     * 1, print out all the odd numbers
     * 
     * TASK 2.2
     * 
     * 2, count all the number divisible by 4
     * 
     * TASK 2.3
     * OPTIONALLY : 
     * 3, skip all numbers divisible by 3 and 5
     *    at the same time 
     * 4, get the sum of above numbers 
     * 
     * */
    
    
    // TASK 2.1
    
//    for (int i = 1; i < 50; i = i + 2) {
//      
//      System.out.print(i + " ");
//      
//    }
    System.out.println();
    
//    for (int i = 0; i < 50; i++) {
//      
//      if( i%2 ==1 )  
//        System.out.print(i + " ");
//      
//    }

//    for (int i = 0; i < 50; i++) {
//      
//      if( i%2 ==0 ) {
//        continue;
//      }
//      
//      System.out.print(i + " ");
//      
//    }
    
//    
//    int count=0;
//    for (int i = 0; i < 50; i++) {
//     
//    if(i%4==0) {
//    	count++;  //or count=count+1;
//    }
//    System.out.println("count is "+count);
//    
//    
//    
//
//  }
//                        SOLUTION #2
    
//    
//    int count=0;
//  for (int i = 1; i < 50; i++) {
//   
//  if(i%4!=0) {
//  	continue;
//  }
//    count++;
//  } 
//  System.out.println("count is "+count);
//    
    
    
    ////////////////////////////////////////////////////////////////////////////////
    
    int count=0;
  for (int i = 1; i < 50; i++) {
   
  if(i%3==0  && i%5==0) {
  	continue;
  
  } 
 // count++;
  System.out.println("count is "+i + count);
  count+=i;
  }   
    
    
    
    
    
    
    
	}
}
	
	
	