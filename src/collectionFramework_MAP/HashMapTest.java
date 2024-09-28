package collectionFramework_MAP;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
//HashMap is the implementation of Map, but it doesn't maintain any order.

	public static void main(String[] args) {

		Map<String,Integer> grades = new HashMap();
		
		grades.put("Indra", 95);
		grades.put("Raghu", 85);
		grades.put("Prutvi", 75);
		grades.put("Hari", 65);
		grades.put("Raghu", 10);
		
	
	for ( Map.Entry<String,Integer> entry : grades.entrySet () ) 
	{
		System.out.println(entry.getKey() + " # " + entry.getValue());
		
	}

	}
}
