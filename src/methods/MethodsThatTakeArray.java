package methods;

import java.util.Arrays;

public class MethodsThatTakeArray {

	public static void main(String[] args) {
		
		  
	    /*
	     * methods : 
	     *   reusable code, maintainable code , write once and use it whenever needed
	     * 
	     * 3 questions to ask while creating a method : 
	     *    
	     *     does this method needs an object or not when being called 
	     *       -->> if not we use static keyword 
	     *    does this method take external data or not 
	     *        -->> if it doesn't we just end method name with empty ()
	     *        -->> if yes put data type and name : parameters seperated by comma
	     *    does this method return a value after being called 
	     *        --if not use void  
	     *        --if yes put the data type of the variable it return 
	     * 
	     * */
	    
//	    String s = "abc" ; 
//	    //System.out.println(  s.charAt(0)  );
//	    
//	    int[] arrObject = {1,2,5,6};
//	    //Arrays.sort(arr);
//	    
//	    // create a static method with no return type
//	    // take one int array as parameter and print them out in one line 
//	    // with - in between
//	    
//	   // arrayPrinterWithDash( new int[] {1,2,3,6,5,5,65});
//	    
//	  //  arrayPrinterWithDash(arrObject );
//	    
//	    //arrayPrinterWithDash(arrObject) ; 
	    
	    reportBiggerArray(new int[]{2,4,5,7},new int[]{8,3,1,9,9});
	    
	    
	    int[] a1 = {1,45,6}; 
	    int[] b1= {1,45,6,6}; 
	    
	    reportBiggerArray(a1,b1);
	    
	    
	  }

	  public static void arrayPrinterWithDash( int[] manyItems) {
	    
	    for(int each: manyItems) {
	      System.out.print(each + "-");
	    }
	    System.out.println();	
		

}
	  public static void reportBiggerArray (int[] a, int[] b) {
		  
		 for(int i    :  a   ) {
		 }
			for(int y: b ) {
		
			}
			
		if (a.length>b.length)	{
			System.out.println(Arrays.toString(a));
		}else {
			System.out.println(Arrays.toString(b));
		}
	  }
	  }

