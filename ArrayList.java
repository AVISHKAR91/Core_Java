package arrayList;

public class ArrayList {
	int id;
	String name;
	float salary;
	float hrs;
	float perHrRate;
	
	

	public ArrayList() {
		
	}

	public ArrayList(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Id : " + id);
		System.out.println("Name :" + name);
		System.out.println("Salary :"+ salary);
		System.out.println("Total Hours :" + hrs);
		System.out.println("Total Hours per rate : " + perHrRate);
		System.out.println("Total Salary :" + salary);
		
	}
}
