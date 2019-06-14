package hiding_Method;


public class EBook extends Book{

  // SUB CLASS CAN HIDE SUPER CLASS'S FILED BY REDECLARING IT 
  // THE ONLY THING MATTER IS THE <NAME> !!!!!
  float name = 12.11f; 
  long page = 100;   
  //@Override ONLY FOR INSTANCE METHOD 
  private static double weight = -1 ; 
  
  
  public static void main(String[] args) {
    
    EBook e = new EBook(); 
    System.out.println(e.name);
    e.showValues();
  }
  
  public void showValues() {
    System.out.println(  super.name  + " --- "  + this.name);
    System.out.println(  super.page  + " --- " + this.page );
    // static fields can be accessed directly in instance method 
    // or we can make it obvious to call in static way EBook.weight
    System.out.println(  super.weight + " ---  " + weight);
    
  }

}
// -------------------
// We can have more than one class in one source file 
// however only one should be public 












class Book {
  
  String name = "BookName"; 
  int page = 10; 
  double weight = 5.0; 
  
  
}


                                         //                             NOTES!!!!!!!!!!!!!!!




///*
// * 
// * Inheritance :
// * 
// * IS-A Relationship a sub class can inherit all visible fields and methods from
// * super class we use extends keyword to build this relationship visibility
// * public -- everywhere protected -- same package + subclasses outside package
// * YOU MUST HAVE SUB CLASS OBJECT TO ACCESS THESE MEMBERS default -- same
// * package private -- same class We dont't inherit anything we dont see
// * Constructor in inheritance relationship ITS NOT INHERITED it can be called in
// * sub class by using super(args...) What's the first statement of any
// * constructor if no constructor call this(arg) super(arg) is already made ---->
// * super() a call to super classes no argument constructor
// * 
// * super(args) or this(args) can only be called once and can not show up
// * together It has to be the first statement all the time Method overridng we
// * have option to override the super class method with new implementation to
// * provde sub class version of the method IT's exclusively for INSTANCE METHODS
// * !!! -- we can just overrdide the method to have same implemention example. in
// * super class : public void doSomething(){ print("do something "); } in sub
// * class :
// * 
// * @Override public void doSomething(){ //print("do something ");
// * super.doSomething(); print("do something more"); } super. ---> is used to
// * access super class's field and methods public class Course{ int capacity =
// * 150;
// * 
// * public static void doStatic(){ // } } public class OnlineCourse extends
// * Course{ int capacity = 300;
// * 
// * public static void doStatic(){ // } } THERE IS NO OVERRIDING CONCEPT FOR
// * FIELDS AND STATIC METHODS THEY CAN ONLY BE HIDDEN NOT OVERRIDDEN SO @OVERRIDE
// * WILL FAIL WHEN DECLARED ON TOP OF FIELD OR STATIC METHOD Hiding fields : if
// * sub class define a visible field that already exits in super class it hides
// * super class version of the field super. can only access directly parents
// * members
// * 
// * ONLY THE NAME MATTER WHEN WE HIDE SUPER CLASS'S FILED ! you can have
// * different data type , visibility , instance/static
// * 
// * GENERALLY SHOULD BE AVOIDED since it cause confusion
// * 
// * hiding methods : if sub class define a visible static method that already
// * exits in super class it hides super class version of the method
// * 
// */
