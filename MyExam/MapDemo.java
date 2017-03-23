package MyExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();

		// Adding Values to the HashMap

		map.put("test key 1", "test value 1");
		map.put("test key 2", "test value 2");
		map.put("test key 3", "test value 3");

		System.out.println("Retrieving values from HashMap");
		retrieveValuesFromListMethod(map);
		System.out.println("******\n\n");

	}

	// this method retrieves values from Map

	public static <E> void retrieveValuesFromListMethod(Map<E, ?> map) {

		Set<E> keys = map.keySet();
		Iterator<E> itr = keys.iterator();
		String Key;
		String value;
		while (itr.hasNext()) {
			Key = (String) itr.next();
			value = (String) map.get(Key);
			System.out.println(Key + "-" + value);
		}
	}

}
