package arrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestGenericArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList <>();
		names.add("Avishkar");
		names.add("Prasad");
		names.add("Krishna");
		
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		
		System.out.println("Display one by one");
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
