package interfaces;

public class SalariedTax implements Tax1{
	
	int id=1;
	String name= "Avishkar";
	float salary=10000;
	
	@Override
	public void calcTax() {
		System.out.println("Calculating tax");
		
	}
	
	public void print() {
		System.out.println("Id is" + id);
		System.out.println("NAme is" + name);
		System.out.println("Salry is" + salary);
		

	}

}
