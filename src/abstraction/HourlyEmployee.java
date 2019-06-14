package abstraction;

public class HourlyEmployee extends Employee {

	
	private int monthlyHoursWorked;
	private int houlyRate;
	
	
	
	
	
	public HourlyEmployee(int id, String name, int monthlyHoursWorked, int houlyRate) {
		super(id, name);
		this.monthlyHoursWorked = monthlyHoursWorked;
		this.houlyRate = houlyRate;
	}


	public int getMonthlyHoursWorked() {
		return monthlyHoursWorked;
	}


	public void setMonthlyHoursWorked(int monthlyHoursWorked) {
		this.monthlyHoursWorked = monthlyHoursWorked;
	}

	public double getHoulyRate() {
		return houlyRate;
	}

	public void setHoulyRate(int houlyRate) {
		this.houlyRate = houlyRate;
	}

	public  void calculateAnualSalary() {
		int anual=monthlyHoursWorked  * houlyRate*12;
	System.out.println("your anual salary is  "+anual);
	}
	
	
	
	
	
	}
