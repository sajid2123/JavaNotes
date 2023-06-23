package herencia;

public class SalariedEmployee extends Employee {

	private double annualSalary;
	private boolean isRetired;
	
	
	public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public double collectPay() {
		return (int) annualSalary /26;
	}
	
}
 