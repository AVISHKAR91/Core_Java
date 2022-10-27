package swap;

public class Swap {
	
	public static void main(String[] args) {
		
		int a=9;
		int b=4;
		
		System.out.println("Before swapping");
		System.out.println(" A is: " +" " + a + " B is: "+ b);
		
		a=a+b;
		b=a-b;
		a=a-b;
//		
//		int temp;
//		temp=a;
//		a=b;
//		b=temp; ///for by using third variable
		
		System.out.println("After swapping");
		System.out.println(" A is: " +" " + a + " B is: "+ b);
		
		
		
	}

}
