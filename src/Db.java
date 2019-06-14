

import java.util.*;

class Main {
  
  public static int[] addElements(int[] ints1, int[] ints2) {
    int[] result=new int[ints1.length];
    
    for(int i=0; i<ints1.length;i++){
      for(int j=0; j<ints2.length;j++){
         result[i]=result[i+j];
      }
    }
   // System.out.println(Arrays.toString(result));
	return result;
    
  }
  
  
}