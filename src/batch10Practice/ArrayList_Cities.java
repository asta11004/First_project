package batch10Practice;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList_Cities {

	public static void main(String[] args) {
		
		
		 ArrayList <Integer> nums1=new ArrayList<>();
			
		   nums1.add(1);
		   nums1.add(1);
		   nums1.add(1);
		   
		   ArrayList <Integer> nums2=new ArrayList<>();
			
		   nums2.add(2);
		   nums2.add(2);
		   nums2.add(2);
		   
		
		   
		   System.out.println(numsList(nums1,nums2));
		   
	}
	
	public static int numsList(ArrayList<Integer>num1,ArrayList<Integer>num2) {
		
		
	int sum=0;
	for(int each1:num1) {
		sum+=each1;
	}
	
	for(int each2:num2) {
		sum+=each2;
	}
 
   
   
   
return sum;

   
   
	}
	
public static ArrayList<Integer> buildList(int count) {
	
	Random random = new Random();
	ArrayList<Integer> returnList = new ArrayList<>();
	
	for(int i=1; i<=count; i++) {
		returnList.add( random.nextInt(101) );
	}
	
	
	return returnList;
}
}
