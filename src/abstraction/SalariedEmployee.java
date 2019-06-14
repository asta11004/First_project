package abstraction;

public class SalariedEmployee extends Employee {

	
	private int monthlySalary;
	

	public SalariedEmployee(int id, String name) {
		super(id, name);
		
	}
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public  void calculateAnualSalary() {
	monthlySalary*=12;
	}
	
}
