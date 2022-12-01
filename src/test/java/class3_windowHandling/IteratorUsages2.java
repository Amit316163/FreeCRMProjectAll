package class3_windowHandling;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorUsages2 {
	
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			hs.add(i);
		}
		System.out.println(hs);
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
		System.out.println( it.next());	
		}
	}

}
