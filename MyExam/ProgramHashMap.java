package MyExam;

import java.util.HashMap;

public class ProgramHashMap {

	public static void main(String[] args) {
		//create new HashMap
HashMap<String,Integer> hash = new HashMap<>();

//write 3 key with values
hash.put("pen", 2);
hash.put("book", 3);
hash.put("lap", 4);
//look up some known values.
int a = hash.get("pen");
int b = hash.get("book");

//Display output
System.out.println(a);
System.out.println(b);
	}

}
