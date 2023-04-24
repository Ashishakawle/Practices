package Revers;

public class Rewser {

	public static void main(String[] args) {
		String s="Ashish Ashokrao Kawale";
        String []words=s.split(" ");
        String rev="";
        for(String a:words) {
         String rew=" ";
         for(int i=a.length()-1;i>=0;i--) {
        	 rew=rew+a.charAt(i); 
         }
         rev=rew+rev+" ";
        }
        System.out.println(rev);
	}
}
