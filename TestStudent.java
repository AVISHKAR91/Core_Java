package AWT_Package;
import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter Id : ");
		s.id = sc.nextInt();
		System.out.println("Enter Name : ");
		s.name = sc.next();
		System.out.println("Enter Marks : ");
		s.marks = sc.nextInt();
		s.print();


	}

}
