package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Aarray {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> A=new ArrayList<Comparable>();
		
           A.add(100);
           A.add("Welcome");
           A.add(15.4);
           A.add('A');
           A.add('C');
           A.add(true);
           A.add(false);
           A.add(null);
           @SuppressWarnings("unused")
		ArrayList<?> Aa=new ArrayList<Object>();
		System.out.println(A);
		
		//1.size
		System.out.println(A.size());
	  //2.Remove element by using index
		A.remove(3);
		System.out.println(A);
	 //3.Remove element	
		A.remove(true);
		System.out.println(A);
	//5.insert new element
		A.add(3,'A');
		System.out.println(A);
		A.add(5,true);
		System.out.println(A);
		
	//6.Retrive Specific value from arraylist
		System.out.println(A.get(3));
		System.out.println(A.get(6));
	//7.change element
		A.set(4,"paython");
		System.out.println(A);
	//8.contains
		System.out.println(A.contains("Welcome"));
		System.out.println(A.contains("paython"));
		
	//9.is empty 
		System.out.println(A.isEmpty());
		System.out.println("***********");
	//10.Reading the data from arraylist
		for(int i=0;i<A.size();i++) {
			System.out.println(A.get(i));
		}
		System.out.println("***********");
		for(Object a:A) {
			System.out.println(a);
		}
	//Iterator	
		System.out.println("***********");
		System.out.println("Reading element using iterator");
		@SuppressWarnings("rawtypes")
		Iterator<Comparable> it=A.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
		
	}

}
