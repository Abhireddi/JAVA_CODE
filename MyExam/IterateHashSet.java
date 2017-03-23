package MyExam;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

	public static void main(String[] args) {
		// Create a HashSet
		HashSet<String> hset = new HashSet<String>();

		// add elements to HashSet
		hset.add("ram");
		hset.add("Rahul");
		hset.add("jhonny");
		hset.add("abhi");
		hset.add("rk");

		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}