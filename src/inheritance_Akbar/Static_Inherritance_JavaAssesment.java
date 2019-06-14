package inheritance_Akbar;

public class Static_Inherritance_JavaAssesment    extends     Static_Inherritance_Assesment {

	int level;
	//what we have but can't see
//	
//	int questionCount;
//	int score;
//	String type;
	
	//static int timeLimit;

//	   
//		public static void printTimeLimit() {
//			
//			System.out.println("Time limit  :   " + timeLimit);
//			
//		}
//		
//		@Override
//		public String toString() {
//			return "Static_Inherritance_JavaAssesment [questionCount=" 
//		+ questionCount + ", score=" + score + ","
//				+ " type=" + type + "]";
//		}
//		
		
	
	public static void main(String[] args) {
		
		
		//static way to access .timeLimit
		System.out.println(   Static_Inherritance_Assesment.timeLimit    );
		
		//accessisng inherited static field directly in static method
		System.out.println(   timeLimit    );
		
		//accessing inherited static field in static way using class name
		System.out.println(   Static_Inherritance_JavaAssesment.timeLimit  );
		
//		timeLimit = 20;  everything will change frim this point on
//		99
//		99
//		Time limit  :   20
//		Time limit  :   20
//		Time limit  :   20

		
		
		
		Static_Inherritance_Assesment.printTimeLimit () ;
		
		printTimeLimit () ;
		
		Static_Inherritance_JavaAssesment.printTimeLimit ();
	}
}