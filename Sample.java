package simplePackage;
import java.util.Scanner;
public class Sample {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = 1;
		do
		{
		try {
		System.out.println("Enter First number: ");
		int n1 = input.nextInt();
		System.out.println("Enter Second number:");
		int n2 = input.nextInt();
		int result = n1/n2;
		System.out.println(result);
		x=2;
		}
		catch(Exception e)
		{
			System.out.println("You cant divisible by 0");
		}
		finally
		{
			System.out.println("Try another one");
		}
		}
		while(x==1);
	}

}
