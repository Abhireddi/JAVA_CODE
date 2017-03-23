package MyExam;

import java.util.ArrayList;

public class GetMethodExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("cherry");
		al.add("banana");
		al.add("Grape");
		System.out.println("First element of the ArrayList:" + al.get(0));
		System.out.println("Third element of ArrayList:" + al.get(2));
		System.out.println("Fourth element of ArrayList:" + al.get(3));
		System.out.println("Second element of the ArrayList:" + al.get(1));

	}
}
