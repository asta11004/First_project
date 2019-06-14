package methods;

public class MethodsCalculator {

	public static void main(String[] args) {
	
		add(5,9);
		subtract(9,2);
		divide(60,4);
		multiply(33,3);
		mod(100,30);
		
		

	}
 public static void add(int a, int b) {
	 int sum=a+b;
	System.out.println(sum);
	
}
 public static void subtract(int a, int b) {
	 int sum=a-b;
	System.out.println(sum);
}
 public static void divide(int a, int b) {
	 int sum=a/b;
	System.out.println(sum);
}
 public static void multiply(int a, int b) {
	 int sum=a*b;
	System.out.println(sum);
}
 public static void mod(int a, int b) {
	 int sum=a%b;
	System.out.println(sum);
}






                   ////////////calculator2////////////////



public static void calculate2(char operator,int firstNum, int secNum) {
  
  switch (operator) {
  case '+':
    System.out.println("result of addition is : " + (firstNum+secNum));
    break;
  case '-':
    System.out.println("result of addition is : " + (firstNum-secNum));
    break;
  case '*':
    System.out.println("result of addition is : " + (firstNum*secNum));
    break;
  case '/':
    System.out.println("result of addition is : " + (firstNum/secNum));
    break;
  case '%':
    System.out.println("result of addition is : " + (firstNum%secNum));
    break;

  default:
    System.out.println("INVALID OPERATOR");
    break;
  }
  
  
}

}




