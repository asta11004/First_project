package inheritance_Akbar;

import java.util.Scanner;
import java.util.Scanner;
public class Akbar_Notes_Inheritance {

/*	

Class is a blueprint for object 

What can we have inside a Class 

public Person{
	
	// instance fields can be used to define properties of objects , instance fileds belong to object  
	int age ; 
	String name ; 
	
	// static fields belong to the class 
	// there is only one copy of this value among all objects created out of this class 
	static String race = "Human"; 

	// constructor 
		// has same name as class name and no return type
		// it run automatically when object is being created 
		// mostly used for creating object with initial state
			// or setting the value of instance fields 
			// it can be overloaded
	public Person(){
		/// no arg constructor 
	}

	public Person(String name., int age){
		/// 2 args constructor 
	}


	// instance methods 
		// we need an object to access insatance method 
		// personObj.printPersonInfo()
		// mostly used to read or modify instance field value 

	public void printPersonInfo(){
		// print name and age 
	}

	// there are special purpose instance methods called 
		// getters and setters 
		// are best practice of encapsulating private fileds
			// to protect data 
		public int getAge(){
			return age; 
		}
		public void setAge(int age){
			this.age = age ; 
		}	


	// static methods 
		static members (fields, methods) should be accessed
		in static way  : 
			Classname.staticField
			Classname.staticMethod(args...)
		when is the good time to use static method 
			if your method have actions that not related to 
			properties of the objects / instance fields 
			then it's always good to just make it static 

	public static void showMeTheRace(){
		// print race 
	}

	initilizer block :  it has no name (static){ }

			static block 

 			it will only run once when class is loaded 
			when does the class actually load
			 any of it's static members being accesed for the first time 
			 print Person.race
			 or 
			 Person p = new Person() ;  
			
			static {
				It will only run once when class is loaded
			}

	instance block : 
			
			{
				// this will run every time an object is created
			}
			this is almost like having above code
			in each and every constructor 

			This is the piece of code that run right before you enter constructor of that class 

}


Inheritance : 
    
  IS-A Relationship 
  a sub class can inherit all visible fields and methods from super class 
  we use extends keyword to build this relationship 
  visibility 
    public     -- everywhere 
    protected   -- same package + subclasses outside package 
            YOU MUST HAVE SUB CLASS OBJECT TO ACCESS THESE MEMBERS   
    default   -- same package 
    private   -- same class 
  We dont't inherit anything we dont see 
  Constructor in inheritance relationship 
    ITS NOT INHERITED 
    it can be called in sub class by using super(args...)
  What's the first statement of any constructor if no constructor call this(arg) super(arg) is already made 
    ----> super()  a call to super classes no argument constructor
    
    super(args)  or this(args) can only be called once and can not show up together
    It has to be the first statement all the time 
  Method overridng 
    we have option to override the super class method with new implementation to provde sub class version of the method 
    IT's exclusively for INSTANCE METHODS !!! 
    -- we can just overrdide the method to have same implemention 
    example. in super class : 
        public void doSomething(){
          print("do something ");
        }
         in sub class : 
        @Override
        public void doSomething(){
          //print("do something ");
          super.doSomething(); 
          print("do something more"); 
        }
  super. ---> is used to access super class's field and methods 
  public class Course{
    int capacity = 150; 
    
    public static void doStatic(){
      //
    }
  }
  public class OnlineCourse extends Course{
    int capacity = 300; 
    
    public static void doStatic(){
      //
    }
  }
  Hiding fields : 
    if sub class define a visible field that already exits in super class 
    it hides super class version of the field 
  hiding methods : 
    if sub class define a visible static methid that already exits in super class 
    it hides super class version of the method 
  
*/	
}
