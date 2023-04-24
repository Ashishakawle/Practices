package LogicProPra;

public class Revers {

	public static void main(String[] args) {
		String s="ashish kawale";
		String []sw=s.split(" ");
		String r="";
	for(String a:sw) {	
      String rev=" ";
    for(int i=a.length()-1;i>=0;i--) {  	  
      rev=rev+a.charAt(i);
      }
      r=rev+r+" ";
	}
 System.out.println(r);
  }
}
