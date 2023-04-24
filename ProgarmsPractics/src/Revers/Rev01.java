package Revers;

public class Rev01 {

	public static void main(String[] args) {
		String s="ashish Ashokrao kawale";
		String []word=s.split(" ");
		String rev=" ";
	for(String a:word) {
		String Rev=" ";
	for(int i=a.length()-1;i>=0;i--) {
		Rev=Rev+a.charAt(i);
	}
	rev=rev+Rev+(" ");
	}
    System.out.println(rev);
	}
}
