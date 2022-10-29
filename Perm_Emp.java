package Inheritance_salary;

public class Perm_Emp extends Employee{
	
	float hra;
	float da;
	float basicSalary;
	
	public Perm_Emp() {
		super();
		System.out.println("Permanent Employee");
	}

	public Perm_Emp(float hra, float da, float basicSalary) {
		super();
		this.hra = hra;
		this.da = da;
		this.basicSalary = basicSalary;
	}
	
	public void calcSalary() {
		hra=basicSalary * 0.2f;
		da = basicSalary * 0.15f;
		salary=hra+da+basicSalary;

	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Basic salary:" + basicSalary);
		System.out.println("HRA:"+ hra);
		System.out.println("DA:"+ da);
	}
	
	

}
