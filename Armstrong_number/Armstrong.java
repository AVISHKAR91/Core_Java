package Armstrong_Number;

public class Armstrong

{
	public int number=0;
	
	public int original_number;
	
	public int rem;
	
	public int result=0;
	
		public void calcArmstrong() 
		{
			original_number = number;
		
			while(original_number != 0)
			{
				rem = original_number % 10;
				result += Math.pow(rem, 3);
				original_number/=10;
			}
		

		}
	
	

	public void print() {
		// TODO Auto-generated method stub
		if(result==number)
		{
			System.out.println(number + " is an armstrong number");
		}
		else
		{
			System.out.println(number + " is not an  Armstrong number");
		}

	}
	
	
	

}
