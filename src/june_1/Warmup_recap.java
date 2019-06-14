package june_1;

public class Warmup_recap {
int num=100;


//{
//  //num = 150; 
//  System.out.println( "init block 1 " );  // init block gets put in the constructor
//}
//{
//  //num = 150; 
//  System.out.println( "init block 2 " );
//}

public Warmup_recap() {
	 System.out.println( "init block 1 " );
	 System.out.println( "init block 2 " );
	
	num=200;
}

public Warmup_recap(int x) {
	 System.out.println( "init block 1 " );
	 System.out.println( "init block 2 " );
	
	
	num=500;
}

	public static void main(String[] args) {
		
	Warmup_recap w=new Warmup_recap();
	System.out.println(w.num);
	}

}
