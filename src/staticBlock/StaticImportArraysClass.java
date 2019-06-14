package staticBlock;

import static java.util.Arrays.sort;
//import static instance_Methods.Bike.showCurrentCount;
import static instance_Methods.Bike.*;


public class StaticImportArraysClass {

  public static void main(String[] args) {
    
    int[] nums = {1,4,6,8,9,0,12}; 
    
    sort(nums);
    
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+", ");
    }
    
    showCurrentCount();
  //  System.out.println( countOfBike ); different package
    

  }

}
