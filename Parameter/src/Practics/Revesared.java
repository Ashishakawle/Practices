package Practics;

public class Revesared {

	public static void main(String[] args) {
	String s="Ashish Ashokrao kawale";
	 String[] Word=s.split(" ");
	 String Revrsworld="";
	 for(String a:Word) {
		 String Reves=" ";
		for(int i=a.length()-1;i>=0;i--) {
		  Reves=Reves+a.charAt(i);
		}
		Revrsworld=Revrsworld+Reves+" ";
	 }
      System.out.println(Revrsworld);
	}
}
