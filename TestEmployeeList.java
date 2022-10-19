package arrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class TestEmployeeList {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Avishkar", 1234.7f));
		employees.add(new Employee(2, "prasad", 145687.6f));
		
		System.out.println(employees);
		
		for (Employee employee : employees) {
			System.out.println(employee);
			
		}
	}

	
	}


