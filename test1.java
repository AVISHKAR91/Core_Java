package armstrong;

public class test1 {
	
		int number, ori_num, rem, result=0;

		public test1() {
			super();
		}

		public test1(int number, int ori_num, int rem, int result) {
			super();
			this.number = number;
			this.ori_num = ori_num;
			this.rem = rem;
			this.result = result;
		}
		
		public void print() 
		{
			
	     // TODO Auto-generated method stub
			if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
			

		}
		
		public void calcArmstrong()
		{
			ori_num = number;

	        while (ori_num != 0)
	        {
	        	rem = ori_num % 10;
	            result += Math.pow(rem, 3);
	            ori_num /= 10;
	        }
		}
		
			

}
