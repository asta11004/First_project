package varArgs;

import java.util.Arrays;

/**
 * @author NewUser
 *
 */
public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * passing 123 as argument for the method that have one int parameter
		 * 
		 * 
		 * method signature ---> method name + parameter list
		 */

		// 123 is argument
		// doSomething(123);
		// doSomething();

		String name = "Barry";
		char[] nameChars = name.toCharArray();
		System.out.println(Arrays.toString(nameChars));

		// getting a each char as String array
		String[] nameCharsStr = name.split("");
		System.out.println(Arrays.toString(nameCharsStr));

		Arrays.sort(nameCharsStr);
		System.out.println(Arrays.toString(nameCharsStr));

	    // ANY literal non-fractional numbers will be seen as int 
	    // ANY literal fractional numbers will be seen as double 

	    int i = 10 ; 
	    // 
	    add(i) ; 
	    
	    //add(10L) ;
	    add( (int)10L  ); 
	    
	  
	  }
	  
	  // this method can take any argument of type int 
	  // or anything that can be stored inside int variable 
	  // for example short and bytes are allowed 
	  // but not long or double 
	  
	

	// public static int doSomething(int x) {
//	    System.out.println("do something 2");
//	    return 0 ;
	// }
	// method parameter
	public static void doSomething(int y) {
		System.out.println("do something 2");
	}

	public static void doSomething() {
		System.out.println("do something  234142");

	}




	public static void add(int x) {

// int x = 10L ; 
		System.out.println(" int x " + x);
	}

//public static void add(long x) {
//System.out.println( " long x " + x  );
//}

}