package Java;

public class Reverstring {

	public static void main(String[] args) {
//		String s="Ashish Ashokrao kawale";
//	    String []world=s.split(" ");
//	    String revers="";
//	   for(String a:world) {
//		   String Revworld=" ";
//		for(int i=a.length()-1;i>=0;i--)  {
//			Revworld=Revworld+a.charAt(i);
//		}
//		revers=Revworld+revers+(" ");
//	   }
//	   System.out.println(revers);
		
	String s="Ashish Ashokrao kawale";
	String words[]=s.split(" ");
	String Rev=" ";
	for(String a:words) {
	String rev=" ";
	for(int i=a.length()-1;i>=0;i--) {
	 rev=rev+a.charAt(i);	
	}
	 Rev=rev+Rev+(" ");
	}
	System.out.println(Rev);	
	}

}
