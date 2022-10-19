package HashSetArrayList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> hm = new HashMap<>();
		hm.put(1, "Avishkar");
		hm.put(2, "Rohit");
		hm.put(3, "Pankaj");
		hm.put(4, "Prasad");
		hm.put(7, "Anjali");
		hm.put(9, "SHreyash");
		hm.put(6, "Aditya");
		hm.put(5, "Telegram");
		
		System.out.println("Printing the hashMap" + hm);
		
		LinkedHashMap <Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(1, "Avishkar");
		lhm.put(2, "Rohit");
		lhm.put(3, "Pankaj");
		lhm.put(4, "Prasad");
		lhm.put(7, "Anjali");
		lhm.put(9, "SHreyash");
		lhm.put(6, "Aditya");
		lhm.put(5, "Telegram");
		
		System.out.println("Printing the LinkedhashMap" + lhm);
		
		TreeMap <Integer, String> tm = new TreeMap<>();
		
		tm.put(1, "Avishkar");
		tm.put(2, "Rohit");
		tm.put(3, "Pankaj");
		tm.put(4, "Prasad");
		tm.put(7, "Anjali");
		tm.put(9, "SHreyash");
		tm.put(6, "Aditya");
		tm.put(5, "Telegram");
		
		System.out.println("Printing the TreeMap" + tm);
		
	}

}
