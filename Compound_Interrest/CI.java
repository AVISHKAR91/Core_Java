package CI;

public class CI 
	{
	
		double principle;
		double rate;
		double time;
		
		public CI() {
			super();
		}
		
		
		public CI(double principle, double rate, double time) {
			
			this.principle = principle;
			this.rate = rate;
			this.time = time;
		}


		public void calc_CMP_Intereest() {
			
			double CI = principle*(Math.pow((1 + rate/100), time));
			
			System.out.println("Compound Interest is:" + CI);
		}
		
		
		

}
