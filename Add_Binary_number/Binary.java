package add_binary;
import java.util.Scanner;

public class Binary {
	Scanner sc = new Scanner(System.in);
	
	public long b1, b2;
	
	public int i=0, carry=0;
	
	int[]  sum = new int[10]; // Holds the output o0f binary number
	
	

	public Binary() {
		super();
	}

	public Binary(long b1, long b2) {
		
		this.b1 = b1;
		this.b2 = b2;
	}
	
	public void takebinary() {
		System.out.println("Enter first binary number:");
		b1 = sc.nextLong();
		System.out.println("Enter Second binary number:");
		b2 = sc.nextLong();
		

	}
	
	public void calcBinary() {
		
		while(b1 !=0 || b2 !=0)
		{
			sum[i++] = (int)((b1%10 + b2%10 + carry) %2 );
			carry = (int)((b1%10 + b2%10 +carry)/2);
			b1=b1/10;
			b2=b2/10;
		}
		
		if(carry !=0 )
		{
			sum[i++] = carry;
		}
		
		--i;
		System.out.println("Output:");
		
		while(i >= 0) {
			System.out.print(sum[i--]);
		}
		

	}
	
	
}
