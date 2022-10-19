package abstractClass;

public abstract class Shape {
		
		float Area;
		abstract void findArea();
		
		void print()
		{
			System.out.println("Area :" + Area);
		}
}
