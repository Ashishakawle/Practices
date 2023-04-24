package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Aarraylis {

	public static void main(String[] args) {
		ArrayList<String> Al=new ArrayList<String>();
		Al.add("A");
		Al.add("C");
		Al.add("B");
		Al.add("E");
		Al.add("D");
	 System.out.println(Al);
	 ArrayList<String> Duplicate=new ArrayList<String>();	
	 Duplicate.addAll(Al);
      System.out.println(Duplicate);
     Duplicate.removeAll(Al);
	 System.out.println(Duplicate);
     System.out.println(Duplicate);
	 Collections.sort(Al);
	 System.out.println(Al);
	}

}
