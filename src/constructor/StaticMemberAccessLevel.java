package constructor;

public class StaticMemberAccessLevel {

	static int staticVar;
	int instanceVar; // instance varriable needs new object to access it

	public static void main(String[] args) {
		System.out.println(staticVar++);

		int num2 = 0;
		System.out.println(num2++);

		// System.out.println(num3); can't access instance varriable in static method

		StaticMemberAccessLevel s1 = new StaticMemberAccessLevel();
		System.out.println("The value of instance varriable num3 is : " + s1.instanceVar);

		s1.doSomething();
	}

//what can we acess inside instance method
public  void doSomething () {
	System.out.println("Inside instance method we can access : "+ instanceVar + staticVar);// we can access all
}
public  static void doStaticThing() {
	System.out.println("Inside static method we can access : "+  staticVar );// access ONLY static Members ( fields, methods)
	
}
}
