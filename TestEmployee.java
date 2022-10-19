package day_02_Package;
import java.util.Scanner;

public class TestEmployee 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter Id : ");
		e.setId(sc.nextInt());
		System.out.println("Enter Name : ");
		e.setName(sc.next());
		System.out.println("Enter Salary : ");
		e.setSalary(sc.nextFloat());
		e.print();
		
		
		
	}

}
