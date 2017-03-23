package MyExam;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		// creating ArrayList by adding Sting
		ArrayList<String> obj = new ArrayList<String>();

		// adding elements to the array list

		obj.add("Abhi");
		obj.add("Abhi2");
		obj.add("Abhi3");
		obj.add("Abhi4");
		System.out.println("Currently the array list has following elements:" + obj);
		obj.add(0, "Raj");
		obj.add(1, "sunny");
		System.out.println("current array list is:" + obj);

		// remove elements from the given index
		obj.remove(1);
		System.out.println("Current array list is:" + obj);

	}

}
