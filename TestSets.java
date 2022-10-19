package arrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> hs = new HashSet<Integer>();
			hs.add(1);
			hs.add(3);
			hs.add(2);
			hs.add(6);
			hs.add(5);
			hs.add(9);
			hs.add(86);
			hs.add(56);
			hs.add(77);
			
	 System.out.println("HashSet" + hs);
	 
	 LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	 lhs.add(1);
	 lhs.add(3);
	 lhs.add(2);
	 lhs.add(6);
	 lhs.add(5);
	 lhs.add(9);
	 lhs.add(86);
	 lhs.add(56);
	 lhs.add(77);
	 
	 System.out.println("LinkedHashSet" + lhs);
	 
	
	
	TreeSet<Integer> ts = new TreeSet<>();
	
	ts.add(1);
	ts.add(3);
	ts.add(2);
	ts.add(6);
	ts.add(5);
	ts.add(9);
	ts.add(86);
	ts.add(56);
	ts.add(77);
	System.out.println("TreeSet" + ts);
	
	Iterator di = ts.descendingIterator();
	System.out.println("Print in descending order");
	while(di.hasNext())
	{
		System.out.println(di.next());
	}
		Set set = ts.descendingSet();
		System.out.println("Printing a desc set:" + set);
	

}
}
