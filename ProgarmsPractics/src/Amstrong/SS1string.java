package Amstrong;

public class SS1string {

	public static void main(String[] args) {
	String s=" Ashish kawale";
    String m=s.replace(" ", "");
     System.out.println(m.length());
	System.out.println(s.length());
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {	
			count++;
	}
  }
   System.out.println(count);
	}
}
