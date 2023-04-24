package Hasset;

import java.util.HashSet;

public class linkhashset1 {

	public static void main(String[] args) {
		// Same method are implemed which are present in hashset.
		// Duplicate elemenet are not allowed
		// Insertion order is preserved
		// Underlaying Ds is  = Hashtable +Linked hashset
		// initial size and load factor  - 16 & 75%

	
	  //LinkedHashSet <Integer> LHS =new LinkedHashSet<Integer>();
		
		HashSet<Integer> LHS=new HashSet<Integer>();
		
		LHS.add(100);
		LHS.add(200);
		LHS.add(300);
		LHS.add(400);
		
		System.out.println(LHS);
			


	}

}
