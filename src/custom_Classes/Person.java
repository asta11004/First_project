package custom_Classes;


public class Person {

  // properties| attributes of 
  // the object are defined
  // by instance variable/field
  String name;
  int age;
  char gender;
  
  //public static void eat() {
  // any non-static method is called instance method 
  
  public void eat() {
    
    System.out.println(" eating ");
    
  }
  
  public void tellMeYourName() {
    System.out.println("My Name is " + name);
    
  }
 
  public void printPersonInfo (){
	  System.out.println("Name is "+ name+" Age : "+age +"gender "+gender);
  }
  
  
}


//public class ExplorePersonBehavior {
//
//	  public static void main(String[] args) {
//	    
//	    
//	    Person p = new Person(); 
//	    p.age = 19; 
//	    p.gender = 'M'; 
//	    p.name = "Abdul Khan"; 
//	    
//	    Person g = new Person(); 
//	    g.age = 19; 
//	    g.gender = 'F'; 
//	    g.name = "Alina"; 
//	    
//	    p.eat();
//	    p.tellMeYourName();
//	    p.printPersonInfo();

//	    g.eat();
//	    g.tellMeYourName();
//	    g.printPersonInfo();
//	    
//
//	  }
//
//	}
