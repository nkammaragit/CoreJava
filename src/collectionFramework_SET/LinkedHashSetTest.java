package collectionFramework_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Maintains insertion order - wont accept duplicates
public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet();
		
		hs.add("Indra");
		hs.add("Naveen");
		hs.add("Kumar");
		hs.add("Raghu");
		hs.add("Hari");
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
