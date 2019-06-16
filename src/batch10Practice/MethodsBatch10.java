package batch10Practice;

public class MethodsBatch10 {

	public static void main(String[] args) {
		
		cook("Turkey");
		youWillNeed( "turkey, butter, spices, heat");
		cookFor(200);
		ready();
		
		
	}

	public static void cook(String food) {
		System.out.println("Today we are cooking "+ food);
	}
	public static void youWillNeed(String items) {
		System.out.println("You will need folowing: "+items);
	}
	public static void cookFor(int minutes) {
		System.out.println("You neeed to cook for "+minutes+" minutes");
	}
	public static void ready() {
		System.out.println("Meal is ready! Enjoy!");
	}
}
//new edit
