package Revers;

public class Reve {

	public static void main(String[] args) {
		String s="Ashish Ashokrao Kawale";
		String []words=s.split(" ");
		String re=" ";
		for(String a:words) {
			String Rev=" ";
		for(int i=a.length()-1;i>=0;i--) {
			Rev=Rev+a.charAt(i);
		}
		re=Rev+re+(" ");
		}
        System.out.println(re);
	}
}
