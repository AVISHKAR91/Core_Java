package interfaces;

public abstract class Shape1 {
	
		float Area;
		
		abstract void findArea();
		
		void print()
		{
			System.out.println("Area of Square is:" + Area);
		}

}
