package inheritance_Akbar;

public class SavingAccount extends BankAccount {

//	String accountName;
//	long accountNumber;
//	double balance;
	
	double returnRate;

	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
		super(accountName, accountNumber, balance);
//		this.accountName = accountName;
//		this.accountNumber = accountNumber;
//		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName 
				+ ", accountNumber=" + accountNumber 
				+ ", balance=" + balance + "]";
	}
	@Override
	public void deposit (int  num) {
		this.balance+=num+100;
		
	}
	@Override
	public void withdraw(int  num) {
		this.balance-=num-10;
		
	}

}
