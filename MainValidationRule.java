package custom1;
import java.util.Scanner;
public class MainValidationRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Case vr = new Case (); // object of validation rule
		
			System.out.println("Enter password : ");
			
			String st = sc.next();//take string as input from user 
			
			try {
				vr.password(st);//check password
			}
			catch(MinimumLengthException e)
			{
				System.out.println("Atleast 8 character");
			}
			catch(AtleastoneSpecialCharacterException e)
			{
				System.out.println("Password atleast one special Acharacter from ., #, $, <, > characteravs");
			}
			catch(AtleastOneUpperCaseLetter e)
			{
				System.out.println("Atleast one upper case letter");
			
		}

	}

}
