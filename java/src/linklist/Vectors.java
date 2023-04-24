package linklist;

import java.util.Vector;

public class Vectors {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Vector vc=new Vector();
		     vc.add("1");
		     vc.add("2");
		     vc.add("3");
		     vc.add("4");
		     vc.add("5");
		     vc.add("6");
		     vc.add("7");
		     vc.add("8");
		     vc.add("9");

;
		     vc.add("11");
		System.out.println(vc);
		  System.out.println(vc.size());
		  System.out.println(vc.get(4));
		vc.remove(2);
		System.out.println(vc);
		vc.add(3, 202);
		System.out.println(vc);
		Vector<Integer> v=new Vector<Integer>();
		    v.add(235);
		    v.add(202);
		    v.addAll(vc);
		System.out.println(v);
		v.removeAll(vc);
		System.out.println(v);
		
		for(Object o:vc){
			System.out.println(o);
			
		}
	    
		

	}

}
