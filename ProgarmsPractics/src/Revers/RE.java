package Revers;

public class RE {

	public static void main(String[] args) {
	 String s="Ashish Ashokrao kawale";
	 String []words=s.split(" ");
	 String rev=" ";
     for(String a:words) {
    	String rews=" ";
    for(int i=a.length()-1;i>=0;i--) {
    	rews=rews+a.charAt(i);
    }
    rev=rev+rews+(" ");
     }
     System.out.println(rev);
	}
}
