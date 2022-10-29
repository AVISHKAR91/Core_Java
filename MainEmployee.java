package Inheritance_salary;

public class MainEmployee {
	

	public static void main(String[] args) {
		
		Perm_Emp P = new Perm_Emp();
		Temp_Emp T = new Temp_Emp();
		P.id=1;
		P.name= "Avishkar";
		P.salary = 20000;
		P.basicSalary=40000;
//		P.hra=3000;
//		P.da = 2000;
		P.calcSalary();
		P.print();
		
		T.id=2;
		T.name= "pankaj";
		T.salary = 10000;
		T.hrs=5;
		T.PerHrRate=4;
		T.calcSalary();
		T.print();
	}

}
