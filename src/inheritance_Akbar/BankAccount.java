package inheritance_Akbar;

public class BankAccount {

	String accountName;
	long accountNumber;
	double balance;
	
	
	

	public BankAccount(String accountName, long accountNumber, double balance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName
				+ ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	public void deposit (int  num) {
		this.balance+=num;
		
	}
	public void withdraw(int  num) {
		this.balance-=num;
		
	}
}
