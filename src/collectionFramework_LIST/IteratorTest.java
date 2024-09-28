package collectionFramework_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		//Generics - specific data type
				List<String> alg = new ArrayList();
				
				alg.add("Indra");
				alg.add("Hari");
				alg.add("Hari");
				alg.add("Prutvi");
				alg.add("Prutvi");
				alg.add("Prutvi");
				
				Iterator itr = alg.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
	}

}
