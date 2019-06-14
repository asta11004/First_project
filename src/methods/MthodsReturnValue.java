package methods;

public class MthodsReturnValue {

	public static void main(String[] args) {
		
		
	System.out.println(meterToCm(1) );
		System.out.println(feetToInch(2));
	System.out.println(faToCelcius(81));
	}

	public static int meterToCm (int meter) {
		int centimeter=  meter*100;
		return centimeter;
		
	}
	public static double feetToInch (int feet) {
		double inch=  feet*12;
		return inch;
}
	public static double faToCelcius(double x) {
		//  (F -32)*5/9 = C
		return (x-32)*5/9;
	}
}