package Revers;

public class Rev {

	public static void main(String[] args) {
		String S="Ashish Ashokrao Kawale";
		String []words=S.split(" ");
		String rev="";
	for(String a:words) {
		String Rew=" ";
	for(int i=a.length()-1;i>=0;i--) {
		Rew=Rew+a.charAt(i);
	}
	rev=rev+Rew+" ";
	}
	System.out.println(rev);
	}
}
