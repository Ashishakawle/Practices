package Hasset;

import java.util.HashSet;
import java.util.Iterator;

public class Hasset {

	public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	HashSet<Comparable> hs=new HashSet<Comparable>(); 
	
	hs.add(100);
	hs.add("Welcome");
    hs.add('A');
	hs.add(14.3);	  
	hs.add("Java");

//	System.out.println(hs);
//	hs.remove("Welcome");
//	System.out.println(hs);
//	
//	//Contatains
//	System.out.println(hs.contains("Java"));
//	System.out.println(hs.contains("Welcome"));
//	
//	//Isempty 
//	  System.out.println(hs.isEmpty());
	   
	  for(Object o:hs) {
		  System.out.println(o);
	  }
	   @SuppressWarnings("rawtypes")
	Iterator<Comparable> t=hs.iterator();
	   while(t.hasNext()) {
		System.out.println(t.next());
	   }
	   
	
	}

}
