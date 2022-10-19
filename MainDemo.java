package Assignment_Day_03_Use_of_Static;

public class MainDemo {
	
	
	static void fun() {
		System.out.println("Fun without parametre invovked");
	}
	
	static void fun(int x, int y)
	
	{
		int add = x+y;
		System.out.println("Sum is :" + add);
		
	}
	
	public static void main(String[] args) 
	{
		MainDemo MD = new MainDemo();
		MD.fun();
		MD.fun(10,20);
		
	}

}
