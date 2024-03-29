package vasyl_Class;

public class StudentTester {

	public static void main(String[] args) {
		
		Student emine = new Student();
		emine.setSSN(123456789);
		//field is not visible because it's private instance 
		//emine.ssn
		emine.batchNumber = 11;
		emine.name = "Emine";
	}

}

/*

//public class ForeignStudentTesterClass {
//	public static void main(String[] args) {
//		///not available before import
//		Student idris = new Student();
//		idris.major = "JAVA GURU";
//		//default instance fields are not visible in the different package
//		//idris.name 
////		not visible in the different package, unless inherit that class
////		even though we imported this class, instance fields will not be visible
////		idris.batchNumber
//	}
//}
//
Class it's a blueprint.

instance variables: variables that were created on the class level.
local variable: variable that is inside a method. Thus, it doesn't exists out of method.


instance variables or fields:
stands for defining properties| attributes| states of object.

How we can access instance fields?

Inside a same class any instance can access these variables.
Outside: create an object of this class in order to access instance variables.
Computer mac = new Computer();
(mac.OS = "", mac.type)

instance methods: 
we need them in order to define behavior of object
also we need methods in order to manipulate with instance variables
so how to access them?
Inside a same class: any instance method can call any other instance method

Outside a class: we need to create an object in order to call instance methods

//our custom class doesn't have a main method
//and we are not expecting to have main method in this class

//POJO API Testing 

//static methods

if we remove static keyword from the main method

Error: Main method is not static in class day41_2_evening_session.ACFactory, please define the main method as:
   public static void main(String[] args)

static methods belong to the class
//they are not instance methods

static means shared -> so any one who is using static members, is using same methods/variables

how you are accessing variables/methods?

with instance members( variables , methods) we need object.instance member

with static methods: ClassName.methodName();


break till: 9:17


// 2 constants that don't belong to any object. The belong to the AirConditioner
//final it's a keyword that makes variable immutable (non-changeable)

final static float MAX_TEMPERATURE = 100;
final static float MIN_TEMPERATURE = 50;

This is how we suppose to access static members

AirConditioner.MAX_TEMPERATURE


OBJECT ORIENTED PROGRAMING CONCEPTS/PRINCIPALS or (OOP)

A - ABSTRACTION
P - POLYMORPHISM
I - INHERITANCE
E - ENCAPSULATION
 A PIE
 API E...

Good practice of OOP is to make instance variables private. And provide access to the instance fields through the methods.
Usually, we have 2 methods for every instance variable. First method calls setter, second method call getter.

For example:
we have a instance called name

		4 levels of access

public --> protected --> default --> private

but 3 keywords: public, protected, private.


REMEMBER: WE CANNOT USE ACCESS MODIFIERS FOR LOCAL VARIABLES.
class person{
	private String name;

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}
}

///set will always be void
//get will always have return type, that is matching instance data type.

// access modifiers applies on variables and methods too.

************************************************************
HOMEWORK
//FINISH TEACHER CLASS
//CRATE CLASS TEACHER TESTERS WITH AT LEAST 2 objects
//CRATE ARRAY LIST OF TEACHERS

public class Teacher {
	private String name;
	private int age;
	private long ssn;
	private int batchNumber;
	private String specialty;
	// provide setters and getters
	// create method print info

}
*/