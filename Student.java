package AWT_Package;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		
	}
	
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Id is :" + id);
		System.out.println("Name is :" + name );
		System.out.println("marks is : " + marks);

	}
	

}
