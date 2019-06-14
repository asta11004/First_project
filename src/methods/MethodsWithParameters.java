package methods;

public class MethodsWithParameters {

	public static void main(String[] args) {
		
		
//		String s = "abc";
//		System.out.println(s.substring(1,3));
		
	    printTheSum(10.89,28.64);
	    printTheSum(342.3,20.88);
	    printTheSum(13.76,7.6);
	    reportName("Asta", "Shaheen");
	}

	public static void printTheSum(double a, double b) {
		
		double sum= a + b;
		System.out.println("The sum of numbers is "+sum);
	}
	
	public static void reportName(String firstName, String lastName) {
	int first = firstName.length();
	int last = lastName.length();
	int total = first+last;
	System.out.println("Your name is "+firstName+" "+ lastName);	
	System.out.println("Your first name is "+first+" characters long");
	System.out.println("Your last name is "+last+" characters long");
	String  reversed="";
	for(int i=firstName.length()-1;i>=0;i--) {
	reversed=reversed+firstName.charAt(i);
	}
	
	System.out.print("Your first name reversed is "+reversed);
	
	
	String  reversed1="";
	for(int i=lastName.length()-1;i>=0;i--) {
	reversed1=reversed1+lastName.charAt(i);
	}
	System.out.println();
	System.out.print("Your last name reversed is "+reversed1);
	
	
	
	}
	
}
