package Assignment_Day_04;

import java.util.Iterator;

public class Vehicle {
	
	String name;
	float speed;
	String color;
	
	String[] vehicles = {"Volvo", "BMW", "Ford", "Mazda"};
	
	
	public void accelerate() {
		   
		System.out.println("Do Something accelerate");

	}
	
	public void print() {
		 
		System.out.println("Print Something Accelerate");
		for (String string : vehicles) {
			System.out.println(vehicles[1]);
		}
		

	}

}
