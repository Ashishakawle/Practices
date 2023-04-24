package StringLogic;

public class NewReverstring {
   public static void main(String[] args) {
	String As ="Ashish Ashokrao kawale";
	String[] world= As.split(" ");
   String Rev=""; 	
	for(String v:world) {
		String wrev=" ";
	for(int i=v.length()-1;i>=0;i--) {
		wrev=wrev+v.charAt(i);
	}
	Rev=wrev+Rev+(" ");
	
	}
  System.out.println(Rev);   
}
}
