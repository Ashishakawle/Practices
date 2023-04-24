package StringJava;

public class Reverstring {

	public static void main(String[] args) {
		String s="ashish Ashokrao kawale";
		String[] w= s.split(" ");
         String Rev=" ";
         for(String a:w) {
        	 String Revers=" ";
        	 for(int i=a.length()-1;i>=0;i--) {
        		 Revers=Revers+a.charAt(i);
        	 }
        	 Rev=Revers+Rev+(" ");
         }
         System.out.println(Rev);
	}
}
