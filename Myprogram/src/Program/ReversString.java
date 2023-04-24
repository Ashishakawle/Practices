package Program;

public class ReversString {

	public static void main(String[] args) {
	String S="Ashish Ashokrao Kawale";
    String []Words=S.split(" ");
    String Revers="";
    for(String A:Words) {
    	String Rev=" ";
    for(int i=A.length()-1;i>=0;i--) {
    	Rev=Rev+A.charAt(i);	
    	}
    Revers=Rev+Revers+" ";
    }
    System.out.println(Revers);
    
	}

}
