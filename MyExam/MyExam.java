package MyExam;

import java.util.ArrayList;
import java.util.*;

public class MyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nums = new ArrayList<String>();
		nums.add("One");
		nums.add("Two");
		nums.add("Three");
		nums.add("Four");
		ListIterator it = nums.listIterator();
		while(it.hasNext()) {
			System.out.print(it.nextIndex()+ " ");
	         Object element = it.next();
	         System.out.print(element + " ");
	         
	      }
}
}