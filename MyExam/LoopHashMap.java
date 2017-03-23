package MyExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class LoopHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String>hmap= new HashMap<Integer,String>();
//Adding elements to HashMap
hmap.put(6,"ABC");
hmap.put(15,"RAm");
hmap.put(55,"value");
hmap.put(21,"XYZ");
//For Loop
System.out.println("For Loop");
for(Map.Entry me: hmap.entrySet()){
	System.out.println("Key:"+me.getKey()+"& Value:"+me.getValue());
}
//WhileLoop & Iterator
System.out.println("While Loop:");
Iterator iterator =hmap.entrySet().iterator();
while(iterator.hasNext()){
	Map.Entry me2= (Map.Entry)iterator.next();
	System.out.println("Key:"+me2.getKey()+"& Value:"+me2.getValue());
	
}


	}

}
