package Collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> H= new HashSet<Integer>();
           H.add(6);
           H.add(5);
           H.add(9);
           H.add(77);
           HashSet<Integer> Hs=new HashSet<>();
           Hs.addAll(H);
          System.out.println(Hs); 
          System.out.println(H);
          Hs.removeAll(Hs);
          System.out.println(Hs);
	}

}
