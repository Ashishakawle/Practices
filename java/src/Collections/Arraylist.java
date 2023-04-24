package Collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList <Comparable> arr=new ArrayList<Comparable>();
           arr.add(100);
           arr.add("ashish");
           arr.add('A');
           arr.add(15.4);
           arr.add(true);
           arr.add(false);
   @SuppressWarnings("unused")
ArrayList<?> Aa=new ArrayList<Object>();
      System.out.println(arr);
     System.out.println("*******************");
   System.out.println(arr.size());   
      System.out.println("*******************");
   System.out.println(arr);
     arr.remove(true);
     System.out.println(arr);
     System.out.println("*******************");
       arr.add(3,true );
     System.out.println(arr); 
  System.out.println("*******************");
     System.out.println(arr.get(3));
     System.out.println(arr.get(5));
  System.out.println("*******************"); 
        arr.set(2,"Guru");
        arr.set(4,"mom");
  System.out.println(arr);
     System.out.println("*******************"); 
         System.out.println(arr.isEmpty()); 
     for(int i=0; i<arr.size();i++) {
    	 System.out.println(arr.get(i));
     }
        
               
           
	}

}
