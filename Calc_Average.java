package Average_marks;
import java.util.ArrayList;
import java.util.Scanner;



public class Calc_Average {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		System.out.print("How mauch students data you want : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num ; i++)
		{
			System.out.println("Enter data " + i + " student :");
			students.add(new Student(sc.nextInt(), sc.next(), sc.nextInt()));
		}
		
		float sum = 0;
		System.out.printf("%20s%20s%20s%20s", "ID", "Name", "Marks", "Grade");
		for (Student student : students) {
			sum += student.marks;
			student.print();
		}
		
		float average = (sum / students.size());
		System.out.println();
		System.out.println("Average of students : "+ average);
		
	}
}
