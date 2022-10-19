package Assignment_Day_03_Use_of_init_blocks;

public class Car {
	
	 Car()
	{
		System.out.println("Default cunstructor invovked");
	}
	
	 Car(int x)
	{
		System.out.println("Parameterised constructor invovked");
	}
	 
	 public static void main(String[] args) 
	 {
		Car C1 = new Car();
		
		C1 = new Car(10);
		
	}
	 
	 

}
