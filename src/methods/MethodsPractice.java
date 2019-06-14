package methods;

public class MethodsPractice {

	public static void main(String[] args) {
		
		countFrom1to10();
		countfrom1toN (22);
		countDown (15);
	}
public static void countFrom1to10() {
	
	for(int i= 1; i<=10; i++)
	System.out.print(i+" ");
	System.out.println();
}
public static void countfrom1toN(int N) {
	for(int i=1; i<=N;i++)
	System.out.print(i+ " ");
System.out.println();
}
public static void countDown(int end) {
	for(int i=end; i>=1; i--)
	System.out.print(i+" ");
}

}
