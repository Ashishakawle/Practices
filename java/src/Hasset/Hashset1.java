package Hasset;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet<Integer> Set1=new HashSet<Integer>();
		Set1.add(1);
		Set1.add(2);
		Set1.add(3);
		Set1.add(4);
		Set1.add(5);
		Set1.add(6);
	System.out.println(Set1);	
	HashSet<Integer> S2=new HashSet<Integer>();	
	    S2.add(4);
	    S2.add(5);
	    S2.add(6);
	System.out.println(S2);
	Set1.addAll(S2);
	System.out.println(Set1);
	
	
	
	
	
	}

}
