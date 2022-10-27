package CI;
import java.util.Scanner;
public class Main_CI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CI ob = new CI();
		
		ob.principle = 1200;
		ob.rate = 5.4;
		ob.time=2;
		
		ob.calc_CMP_Intereest();
		
		
		
		

	}

}
