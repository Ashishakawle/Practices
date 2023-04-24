package collection;

import java.util.ArrayList;

public class Arraylis {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> AL = new ArrayList<Comparable>();
	
		AL.add(100);
		AL.add("ashish");
		AL.add('a');
		AL.add(true);
		AL.add(false);
		AL.add(null);
		AL.add(10.11);
		System.out.println(AL);

		
	}
	

}
