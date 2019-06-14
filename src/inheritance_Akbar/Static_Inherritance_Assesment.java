package inheritance_Akbar;

public class Static_Inherritance_Assesment {
	
	
	int questionCount;
	int score;
	String type;
	
	// all Assesment has ONE SHARED  timeLimit
	static int timeLimit= 99;

   //static method can ONLY access STATIC members
	public static void printTimeLimit() {
		
		System.out.println("Time limit  :   " + timeLimit);
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Static_Inherritance_JavaAssesment [questionCount=" 
	+ questionCount + ", score=" + score + ","
			+ " type=" + type + "]";
	}
	
	
}
