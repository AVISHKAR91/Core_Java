package interfaces;
import java.util.*;

public class MainSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Square sh = new Square();
		System.out.println("Enter side");
		sh.side = sc.nextInt();
		sh.findArea();
		sh.print();
		
		
		

	}

}
