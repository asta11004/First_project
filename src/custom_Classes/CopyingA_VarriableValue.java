package custom_Classes;

public class CopyingA_VarriableValue {

	public static void main(String[] args) {

		Dog puppy =new Dog();
		puppy.name = "puppy";
		puppy.breed ="pitbull";
		
		Dog roma =puppy;
		roma.name ="roma";
		
		System.out.println( puppy.name );
	}

}
