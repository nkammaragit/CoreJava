package collectionFramework_LIST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Allows duplicates, maintains insertion order, insertion is faster, retrieval is slower.
public class LinkedListTest {

	public static void main(String[] args) {
    List<Object> ll = new LinkedList();
		
		ll.add("Indra");
		ll.add("Hari");
		ll.add("Prutvi");
		ll.add(123);
		ll.add(111);
		ll.add("Indra");
		ll.add("Indra");
		
		System.out.println(ll);
		System.out.println(ll.get(2));
		ll.add(2, "Naveen");
		System.out.println(ll);
		

		
		
		
	}
	
	

}
