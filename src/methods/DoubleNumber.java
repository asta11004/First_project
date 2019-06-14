package methods;

public class DoubleNumber {

	public static void main(String[] args) {
		
		printTheDoubleNumber(20);
		checkForAge(22);
		
	}
   public static void printTheDoubleNumber(int x ) {
	 x= x*2;
	System.out.println(x);
}
   public static void checkForAge(int age) {
	   age=0;
	  if( age>=21) {
		  System.out.println("Adult");
	  }else {
		  System.out.println("Sorry, too young");
	  }
	   
   }
}
