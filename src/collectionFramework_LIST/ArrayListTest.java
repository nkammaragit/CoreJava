package collectionFramework_LIST;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
//Allows duplicates, maintains insertion order, insertion is slower, retrieval is quick.
	public static void main(String[] args) {
		
		//Generics - specific data type
		List<String> alg = new ArrayList();
		
		alg.add("Indra");
		alg.add("Hari");
		alg.add("Hari");
		alg.add("Prutvi");
		alg.add("Prutvi");
		alg.add("Prutvi");
		
		//NonGenerics - accepts any data type
		List alng = new ArrayList();
//		List<Object> alng = new ArrayList();
		alng.add("Indra");
		alng.add("Hari");
		alng.add("Prutvi");
		alng.add(123);
		alng.add(111);
		alng.add("Prutvi");
		alng.add("Prutvi");
		
//		System.out.println(al.get(1));
//		System.out.println(al);
		
		

	}

}
