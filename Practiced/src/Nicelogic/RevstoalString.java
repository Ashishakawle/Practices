package Nicelogic;

public class RevstoalString {

	public static void main(String[] args) {
		String st="Ashish Ashokrao kawale";
		String [] Ts=st.split("");
		String revstring="";
	for(String a:Ts) { 
		String Rev="";
		for(int i=a.length()-1;i>=0;i--)
			Rev=Rev+a.charAt(i);
	
	revstring=Rev+revstring+" ";
	}
	System.out.println(revstring);
}
}