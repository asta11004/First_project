package loops;

public class DoWhileLoopsAkbar {

	public static void main(String[] args) {
/*	
	String star ="*";
	int x=1;
	
	while(x<10) {
		System.out.println( star);
		
		star=star+"*";
		x++;
	}
	
	
		String word= "java";
		
		String word1=word.substring(0, 1).toUpperCase();
		System.out.println(word1+word.substring(1));
		
	*/	
		boolean hungry = true;
		
		int apples =1;
		
		while(hungry) {
			System.out.println("Eatting "+apples);
			apples++;
			if(apples==5)
			hungry=false;
			
		}
		
	}

}
