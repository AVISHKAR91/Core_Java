package arrayList;
import java.util.Scanner;
import java.util.ArrayList;


public class TestMovieList {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Movie> movies = new ArrayList<>();
		System.out.println("How many movies list you want to create?");
		int num = sc.nextInt();
		int i=1;
		
		for( i=1; i<=num ; i++)
		{
			System.out.println("Enter " + i + " movies name :");
			movies.add(new Movie(sc.next(), sc.nextFloat(), sc.next()));
		}
		//movies.add(new Movie("SitaRamam", "3 hrs", "Ram"));
		
//		System.out.println(movies);
		
		for (Movie movie : movies) {
			System.out.println( movie);
		}
		
		
		
	}

}
