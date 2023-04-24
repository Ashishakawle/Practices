package Revers;

public class Stringrev {

	public static void main(String[] args) {
		String s="Ashish Kawale";
		String[] words=s.split(" ");
        String rev=" ";
        for( String a:words) {
        	String revsw=" ";
        	for(int i=a.length()-1;i>=0;i--) {
        		revsw=revsw+a.charAt(i);
        	}
        	rev=rev+revsw+(" ");
        }
        System.out.println(rev);
	}
}
