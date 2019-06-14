package inheritance_Akbar;

public class AtTheTeller {

	public static void main(String[] args) {
		
		SavingAccount s1 = new SavingAccount("Asta", 12345, 28999, 2.5);
		
           System.out.println(s1.toString());
           
           s1.deposit(10);
           
           
           System.out.println("Current balance "+s1.balance);
	}

}
