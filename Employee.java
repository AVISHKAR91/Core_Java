package arrayList;

public class Employee {
	int id;
	String name;
	float salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Id : " + id);
		System.out.println("Name :" + name);
		System.out.println("Salary :"+ salary);
		
		
	}
}
	