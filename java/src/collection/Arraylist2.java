package collection;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al=new ArrayList<Comparable>();
          al.add(10);
          al.add('A');
          al.add("ashish");
		al.add(true);
		al.add(false);
		al.add(null);
		al.add(0);
		al.add(-11);
		
		System.out.println(al);
		
		
		
		
		
	}

}
