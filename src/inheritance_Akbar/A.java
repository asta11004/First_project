package inheritance_Akbar;

public class A {
	
	
public A() {
	System.out.println("A Constructor");
}
}
 class AA extends A {
AA() {
	System.out.println("AA Constructor");
}
 }
 class AAA extends AA {
 AAA() {
	System.out.println("AAA Constructor");

}
public static void main(String[] args) {
    AAA a = new AAA(); 
 System.out.println("-------");
 
  A a1 = new A(); 
  System.out.println("-------");
  
  
  
}


}
 

 





