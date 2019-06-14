import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Akbar_Review_Everything {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(6); // --> list1.add( new Integer(6)) ;
		list1.add(12);
		list1.add(65);
		list1.add(9);
		list1.add(73);

		// updating first item to double of original value
		// getting first item
		Integer item1 = list1.get(0);
		Integer updated1stItem = item1 * 2;
		// updating first item with doubled value
		list1.set(0, updated1stItem);

		System.out.println(list1);

		// doing above in one shot
//		    list1.set(0,  list1.get(0) * 2 ) ; 
//		    list1.set(1,  list1.get(1) * 2 ) ; 
//		    list1.set(2,  list1.get(2) * 2 ) ; 
		for (int i = 0; i < list1.size(); i++) {

			list1.set(i, list1.get(i) * 2);

		}

		System.out.println(list1);

		// Arrays.asList return a fixed size list and return type is List
		// so it has to be stored in List variable

		List<Integer> nums2 = Arrays.asList(10, 2, 33, 24, 15);

		// creating an ArrayList object with another list object
		ArrayList<Integer> list3 = new ArrayList<Integer>(nums2);

		// creating an ArrayList object with another list object in one shot
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10, 2, 33, 24, 15));

	}
}
	

	/*
	 * Day 42
	 * 
	 * Task 1 Create an ArrayList object and add 5 whole numbers
	 * 
	 * try out adding one by one and also try adding in one shot
	 * 
	 * update each number to doule of that number 1,3,5,6,7 --> 2 6 10 12 14
	 * 
	 * // reverse this ArrayList using one of the utility method that we learned
	 * from Collections class
	 * 
	 * OPTIONALLY Reverse this ArrayList not using above method
	 * 
	 * OPTIONALLY use random class to randomly assign value to your arraylist object
	 * 
	 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	                                   // FOR EACH LOOP

/*
	ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10, 2, 33, 24, 15));

	int i = 10;
    int j = i ;
    j=100;

	System.out.println(i);

	for(
	Integer each:list4)
	{
		each = 100;
		System.out.println("Item : " + each);
	}

	for(
	int x = 0;x<list4.size();x++)
	{

		Integer each = list4.get(x);
		each = 100;
		System.out.println("Item : " + each);

	}

//for (int x = 0; x <list4.size(); x++) {
//
//  System.out.println();
//
//}
	 int[] nums = {1,4,6,7,2} ; 
	    // updating using for each loop  will not work 
	    for (int each1 : nums) {
	      each1 = 100 ; 
	    }
	    
	    // because for each loop get the copy of value inside collection
	    // rather than original value 
	    for (int i = 0; i < nums.length; i++) {
	      int each1 = nums[i];
	      each = 100; 
	    }
	    
	    System.out.println(Arrays.toString(nums));
	    
	    
	    
	    
	    
	    
	    
	    

	  }

	}


}

}
*/