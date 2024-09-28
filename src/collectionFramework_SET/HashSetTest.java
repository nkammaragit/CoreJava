package collectionFramework_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {

	//will not maintain insertion order - wont accept duplicates
	public static void main(String[] args) {
		Set<String> hs = new HashSet();
		
	
		hs.add("Prutvi");
		hs.add("Indra");
		hs.add("Indra");
		hs.add("Naveen");
		hs.add("Kumar");
		hs.add("Raghu");
		hs.add("Hari");
		hs.add("Prutvi");
		hs.add("Indra");
		
		System.out.println(hs);


		
		

	}

}
