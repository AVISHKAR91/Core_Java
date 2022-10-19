package abstractClass;

public class Circle extends Shape {
	
	int radius;
	
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		Area = 3.14f * radius*radius;
	
	}
	
	@Override
	void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Radius: "  + radius);
		super.print();
	}

}
