package Revers;

public class Rever {

	public static void main(String[] args) {
		String s="ashish ashokro kawale";
		String[] word=s.split(" ");
        String Revers=" ";
       for(String a:word) {
    	  String rev=" ";
    	  for(int i=a.length()-1;i>=0;i--) {
    		 rev=rev+a.charAt(i) ;
    	  }
    	  Revers=rev+Revers+(" ");
       }
       System.out.println("this String is revers:-"+Revers);
	}
}
