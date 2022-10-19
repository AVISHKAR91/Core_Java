package Assignment_Day_03;

public class Use_of_Var_Args {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Use_of_Var_Args U = new Use_of_Var_Args();
		
		U.fun(100);
		
		U.fun(1,2,3,4,5,6,7,8,9,10);
		
		U.fun();
		

	}
	
	public void fun(int... a) {
		// TODO Auto-generated method stub
		System.out.println("Number of Arguments:" + a.length);
		
		for (int i : a) {
			System.out.println(i + " ");
		}
	}

}
