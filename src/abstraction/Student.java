package abstraction;


//abstract class are not meant to be instantiated --NO OBEJCT !!!!
//abstract class are meant to be a super class 
//to provide a general idea, without providing implemetation details 
// using abstract method 

//OTHER THAN ABOVE 
//YOU CAN HAVE EVERYTHING ELSE A NORMAL CLASS CAN HAVE 

public abstract class Student {

int id; 
String name; 
public static final String SCHOOL = "Cybertek"; 

public Student(int id, String name) {
  this.id = id;
  this.name = name;
}
public void study() {
  System.out.println("Study hard to get the job");
}
public static void showSchool() {
  System.out.println(SCHOOL);
}

public abstract void attendClass(); 

//public void attendClass() {
//  
//  System.out.println("IMPLEMENT IN SUB CLASSES");
//  
//}

}

