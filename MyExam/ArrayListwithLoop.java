package MyExam;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListwithLoop {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		// add the values in array;
		a.add("ashik");
		a.add("chakravarthy");
		a.add("harish");
		a.add("nandhini");
		a.add("rekha");
		a.add("venkat");

		// display the array values

		// 1 using iterator
		System.out.println("Display the values using iterator");
		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// for each loop
		System.out.println("Display the values using foreach loop");
		for (String n : a) {
			System.out.println(n);
		}

		// remove
		a.remove("rekha");

		// After remove
		System.out.println("Display the values after remove");
		for (String n : a) {
			System.out.println(n);
		}

		a.remove(3);
		// After remove
		System.out.println("Display the values after remove");
		for (String n : a) {
			System.out.println(n);
		}
	}

}
