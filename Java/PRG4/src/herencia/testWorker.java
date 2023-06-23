package herencia;

public class testWorker {


	public static void main(String[] args) {
		
		
		
	Employee sajid = new Employee("Sajid", "19/06/2003", "01/01/2024");
	
	System.out.println(sajid);
	System.out.println("Age = " + sajid.getAge());
	System.out.println("Pay = " + sajid.collectPay());
	 
	SalariedEmployee tabish = new SalariedEmployee("Tabish Hashmi", "19/06/2003", "01/01/2024",180000);
	
	System.out.println(tabish);
	System.out.println("Salary = " + tabish.collectPay());
	
}}
