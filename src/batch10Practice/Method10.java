package batch10Practice;

public class Method10 {

	public static void main(String[] args) {

		askHowRU();
		reply();
		sayBye();
		System.out.println(countTimes2("javavaaca","a"));
	}

	public static void sayHello() {

		System.out.println("Hello");
		System.out.println("MY best friend");
	}

	public static void askHowRU() {

		System.out.println("How are you doing?");

	}

	public static void reply() {
		System.out.println("I'm doing well, how about you?");

	}

	public static void sayBye() {

		System.out.println("Buy! Have a good day");
	}
	
	///////////////            with return
	
	
	public static int countTimes(String one, String two) {   ///version 1
		
		int count = 0;
		for(int i =0; i < one.length();i++) {
			if(one.substring(i, i+1).contentEquals(two)) {
				count++;
			}
		}
	
		return count;
	}
	
	public static int countTimes2(String one, String two) {   ///version 2
		String [] arr = one.split(two);
		
		return arr.length;
		
}
}