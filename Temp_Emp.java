package Inheritance_salary;


public class Temp_Emp extends Employee {
	
	
	float hrs;
	float PerHrRate;
	
	
	public Temp_Emp() {
		super();
		System.out.println("Temporary Employee");
	}
	
	public void calcSalary() {
		salary =hrs*PerHrRate;

	}
	
	public void print() {
		super.print();
		System.out.println("Total hr:" + hrs);
		System.out.println("Total Hrs Per rate:"+ PerHrRate);
		System.out.println("Salary:"+ salary);
		

	}
	
	

}
