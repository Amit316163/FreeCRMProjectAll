package class3_windowHandling;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorUsages {
	
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("Amit");
		hs.add("Singh");
		hs.add("Pune");
		
		System.out.println(hs);
		
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		
		
		
	}

}
