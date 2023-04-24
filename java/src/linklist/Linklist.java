package linklist;

import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList<Comparable> la= new LinkedList<Comparable>();
		
		 la.add("ashish");   	    	
		 la.add('a');
	     la.add(100);
         la.add("Welcome");
         la.add(15.4);
         la.add('d');
         la.add('C');
         la.add(true);
         la.add(false);
         la.add(null);
         LinkedList<?> la1= new LinkedList<Object>();
		System.out.println(la);
		//size
	   System.out.println(la.size());	
	    //removie
	   la.remove(2);
	   System.out.println(la);	
	  //add element
	   la.add(2, 100);;
	   System.out.println(la);
	//get
	   System.out.println(la);
	   //set
	   la.set(1, "kawale");
       System.out.println(la);
       //contain
       System.out.println(la.contains('C'));
       System.out.println(la.contains("welcome"));
       //empty
       System.out.println(la.isEmpty());
       System.out.println(la1.isEmpty());
       
       //readinf element
       System.out.println();
       System.out.println("******");
       for(Object g:la) {
    	   System.out.println(g);   
       }
       //for loop
       System.out.println();
       System.out.println("******");
       for(int i=0;i<la.size();i++) {
    	   System.out.println(la.get(i));
       }

	}

}
