/**
 * 
 */
package june_1;

/**
 * Inheritance : why do we need it : a class can extends another class to
 * inherit fields and methods what's inherited all visible fields and methods
 * constructor is not inherited We can just use all inherited members just like
 * it's our own and we have option to add new fields or methods that does not
 * exists in super class We can also change what super class provided
 * 
 * fields if we declare a field that already exists in super class it will hide
 * super class's field IT JUST NEED TO HAVE SAME NAME IT CAN HAVE EVERYTHING
 * ELSE DIFFERENT How do we access a hidden field in sub class parent int
 * capacity Child long capacity super.capacity -->> parent version this.capacity
 * --->> current class version methods static method a sub class define same
 * method as super class, it hides super class's static method public class
 * Person{ public static void showRace(){ print ("Human") } } this. super. MUST
 * NOT SHOW UP IN STATIC METHOD instance members MUST NOT SHOW UP IN STATIC
 * METHOD public class Spartan extends Person{
 * 
 * @Override ---->> ERROR !!! public static void showRace(){ Person.showRace();
 *           print ("Spartan") } } instnace method --- we can define sub class
 *           version of the method to provide new implementation ---->>
 *           Overriding it's exclusively for instance method public class
 *           Person{ public void sleep(){ print ("Human") } } public class
 *           Spartan extends Person{
 * @Override -->>>ENFORCE OVERRIDING RULE public void sleep(){ super.sleep();
 *           super.sleep(); print ("Spartan dont sleep") super.sleep();
 * 
 *           } } Overloading VS Overriding
 *           //---------------------------------------- final keyword on class :
 *           public final class Spartan{ } public class Horse extends Spartan{}
 *           --->>> Error!!!!!! can not be extended
 *           //------------------------------- public class student{ } public
 *           final class LocalStundet extends student{ } as long as a class is
 *           not final it can be super class a final class can be sub class as
 *           well as long as it's super class is not final final methods
 *           instance method -- can not be overridden it will not compile if
 *           it's overriden static methdo -- can not be hidden it will not
 *           compile if it's hidden final variable can not be reassiged value
 *           once the value is set // a primitive type store value directly so
 *           final variable // x can not have new value here
 * 
 *           final int x = 10 ; //x = 12 ;
 * 
 *           // a reference variable store address of the object // once it's
 *           pointed to the object , it can not point to // different object
 *           final Building b1 = new Building(100); b1.num = 200 ;
 * 
 *           //Once the final reference variable pointed to one object //it can
 *           not be pointed to different object b1 = new Building(300); //This
 *           will not compile Building b2 = b1 ; // copying the address of b1
 *           into b2 final field :
 * 
 *           instance field a final instance field must be initialized before
 *           object creation complete
 * 
 *           1, it can be initialized in same line where it is defined 2, it can
 *           be initialized in instance block 3, it can be initialized in
 *           constructor
 * 
 *           instance field a final static field must be initialized before
 *           class finish loading
 * 
 *           1, it can be initialized in same line where it is defined 2, it can
 *           be initialized in static block final method parameters
 * 
 *           just like any other final variables it will block the method
 *           parameter from getting reassigned value
 * 
 *           public static void doSomething( final int x ){ x = 100 ; ERROR!!!
 *           can not reassign a final variable !!! }
 *
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Notes {

}
