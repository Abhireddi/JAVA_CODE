package MyExam;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(10, "Abhi");
		ht.put(2, "Raj");
		ht.put(20, "Anji");
		ht.put(6, "pream");
		// Get a set of the entries
		Set set = ht.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

	}

}
