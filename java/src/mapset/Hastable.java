package mapset;

import java.util.Hashtable;

public class Hastable {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		 Hashtable ht=new Hashtable();
		     ht.put(1,"pune");
		     ht.put(2,"nagar");
		     ht.put(3,"nashik");
		     ht.put(4,"mumbai");
		    System.out.println(ht);
		    //add
		     ht.put(4,"aurangbad");
		     System.out.println(ht);
		     //remove
		     ht.remove(4,"aurangbad");
		     System.out.println(ht);
		     //contains value and key 
		     System.out.println(ht.containsKey(103));
		     System.out.println(ht.containsKey("pune"));
		     //contains value and key 
		     System.out.println(ht.containsValue(103));
		     System.out.println(ht.containsValue("pune")); 
		     
		     System.out.println(ht.entrySet());
		     System.out.println(ht.isEmpty());
		     for (Object obj:ht.keySet()) {
		    	 System.out.println(obj);
		     }
		     for (Object obj:ht.values()) {
		    	 System.out.println(obj);
		     }
		     for (Object obj:ht.keySet()) {
		    	 System.out.println(obj+" "+ht.get(obj));
		     }
	}

}
