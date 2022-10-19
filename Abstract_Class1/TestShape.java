package abstractClass;

import java.util.Scanner;

public class TestShape {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				Circle c = new Circle();
				System.out.println("Enter radius :");
				c.radius= sc.nextInt();
				c.findArea();
				c.print();
			}
}
