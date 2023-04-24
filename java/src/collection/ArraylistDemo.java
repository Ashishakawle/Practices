package collection;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer>aa=new ArrayList<Integer>();
		
		al.add(1);
		al.add(11);
		al.add(111);
		al.add(102);
		al.remove(0);
		al.add(0, 12);
	
	System.out.println(al);
	aa.addAll(al);	
	System.out.println(aa);
//	aa.removeAll(al);
//	System.out.println(aa);
	int A=aa.size();
	System.out.println(A);
	}

}
