package methods;

public class MethodsWithMoreParameters {

	public static void main(String[] args) {
		
		
	login("asta", "cybertek",true);
	 
    String user = "abc" ; 
    String pass = "efg" ; 
    boolean isChecked = false ; 
    
    login(user, pass, isChecked);
    
    
	}
 public static void login(String user,String password, boolean rememberMe) {
	
	System.out.println("You entered username "+user);
	System.out.println("You entered password "+password);
	
	if(rememberMe==true) {
	System.out.println("You checked "+rememberMe+" box");
	}else {
		System.out.println("You did not check "+rememberMe+" box");
	}
}
}
