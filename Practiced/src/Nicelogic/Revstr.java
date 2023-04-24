package Nicelogic;

public class Revstr {

	public static void main(String[] args) {
	 String St="Ashish ashokerao kawale";
	 String [] words=St.split(" ");
	 String rew="";
	 for(String a:words) {
		 String Rev="";
	 for(int i=a.length()-1;i>=0;i--) {
		 Rev=Rev+a.charAt(i);
	 }
		rew=rew+Rev+" "; 
	 }
	 System.out.println(rew);
}
}