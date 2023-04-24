package mapset;

import java.util.HashMap;

public class Hasmap {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		   HashMap hm=new HashMap();
		     hm.put(101,"ashoo");
		     hm.put(102, "pune");
		     hm.put(103,"ashish");
		     hm.put(104, "aurangabad");
		     hm.put(105,"aashoo");
		     hm.put(106, "yavatmal");
		     
		     System.out.println(hm); 
		     hm.remove(105);
		     System.out.println(hm);
		    // containsvallue
		     System.out.println(hm.containsKey(106));
		     System.out.println(hm.containsKey("ashoo"));
			    // containsvallue
		     System.out.println(hm.containsValue("ashoo"));
		     System.out.println(hm.containsValue(106));
		     
		     System.out.println(hm.entrySet());
		     for(Object obj: hm.keySet()) {
		    	 System.out.println(obj);
		     }
		     for(Object obj: hm.values()) {
		    	 System.out.println(obj);
		     }
		     for(Object obj: hm.keySet()) {
		    	 System.out.println(obj+" "+hm.get(obj));
		     } 
	}

}
