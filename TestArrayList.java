package arrayList;
import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2.0);
		list.add(3.0f);
		list.add("five");
		System.out.println(list);
		list.add(3,4);//insert
		System.out.println(list);
		list.remove(0);//delete
		System.out.println(list);
		list.set(3, "nice");
		System.out.println(list);
	}

}
