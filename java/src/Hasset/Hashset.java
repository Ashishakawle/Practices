package Hasset;

import java.util.HashSet;

public class Hashset {

	public static <integer> void main(String[] args) {
	HashSet<Integer> H=new HashSet<Integer>();
          H.add(6);
          H.add(8);
          H.add(3);
          H.add(5);
          H.add(4);
     HashSet<Integer> Hs1=new HashSet<Integer>();	
		H.addAll(Hs1);
		System.out.println(H);
		
		H.removeAll(Hs1);
		System.out.println(Hs1);
	}

}
