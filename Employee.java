package Inheritance_salary;

public class Employee {
	
	int id;
	String name;
	public float salary;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("Id:" + id);
		System.out.println("Name:"+ name);
		System.out.println("Salary:"+ salary);

	}
	
	
	
	
	

}
