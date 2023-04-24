package Hasset;

import java.util.PriorityQueue;

public class linkhashset {

	public static void main(String[] args) {
		// Insertion order is preserved
		// Duplicate are allowed
		
		PriorityQueue<String> PQ =new PriorityQueue<String>();
		
		//Adding element 1. Add 2. offer
		PQ.add("A");
		PQ.add("B");
		PQ.add("C");
		PQ.add("C");
		PQ.offer("S");
		
//		System.out.println(PQ);  //[A, B, C, C, S]
		
		//3. Element() 4.Peek
		
	//	System.out.println(PQ.element());  - If queue is empty it will throw exceptuion(No such elemet)
	//	System.out.println(PQ.peek());   -   If empty it will return Null
		
		//5. Remove 6.poll
		
//		System.out.println(PQ.remove());  // if queue is empty it will throw  noSuchElementException
//		System.out.println(PQ);
		
		System.out.println(PQ.poll());
		System.out.println(PQ);
	

	}

}
