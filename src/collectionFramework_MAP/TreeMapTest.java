package collectionFramework_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

//	SortedMap-  It maintains ascending order
	public static void main(String[] args) {

		Map<String,Integer> grades = new TreeMap();
		
		grades.put("Indra", 95);
		grades.put("Raghu", 85);
		grades.put("Prutvi", 75);
		grades.put("Hari", 65);
		grades.put("Raghu", 10);
		
		System.out.println(grades.get("Indra"));
		
	
	for ( Map.Entry<String,Integer> entry : grades.entrySet () ) 
	{
		System.out.println(entry.getKey() + " # " + entry.getValue());
		
	}

	}
}
