package Average_marks;

public class Student 
{

	int id;
	String name;
	int marks;
	String grade;
	
	public void calGrade() {
		if(marks < 35)
		{
			grade = "Fail";
		}
		else if(marks >= 35 && marks < 50 )
		{
			grade = "C";
		}
		else if(marks >= 50 && marks < 75)
		{
			grade = "B";
		}
		else
		{
			grade = "A";
		}
	}
	
	
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		calGrade();
		
	}


	public Student() {
		super();
	}
	
	public void print() {
		// TODO Auto-generated method stub
//		System.out.println("Student id: " + id);
//		System.out.println("Student Name:" + name);
//		System.out.println("Student Mark :"+ marks);
//		
//		System.out.println("Grade of students :"+ grade);
//		System.out.println("Average of students :"+ average);
		System.out.println();
		System.out.format("%20s%20s%20s%20s", id, name, marks, grade);
		
	}
	
	
	
	


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
}
