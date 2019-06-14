package constructor;

public class DreamHouse {

	public static void main(String[] args) {
		House house1 = new House();
		System.out.println(house1);

		System.out.println("*************************************");
		House house2 = new House(10000, 7, 4000, "Single family");
	   System.out.println(house2);

	}

}
