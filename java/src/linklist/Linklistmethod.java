package linklist;

import java.util.Collections;
import java.util.LinkedList;

public class Linklistmethod {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		   ll.add("A");
		   ll.add("B");
		   ll.add("F");
		   ll.add("D");
		   ll.add("E");
		   ll.add("C");
		   ll.add("G");
		   ll.add("J");
		   ll.add("I");
		   ll.add("H");
		   System.out.println(ll);
      LinkedList<String> ll1=new LinkedList<String>();
		   ll1.addAll(ll);
	   System.out.println(ll);
		  ll1.removeAll(ll);
		System.out.println(ll1);   
		Collections.sort(ll);   
		System.out.println(ll);
		Collections.sort(ll,Collections.reverseOrder());   
		 System.out.println(ll);  
		   ll.add("tiger");
		   ll.add("god");
		   ll.add("Elefant");
		 System.out.println(ll);  
		
		
		
		
		
		
		
		
		
		

	}

}
