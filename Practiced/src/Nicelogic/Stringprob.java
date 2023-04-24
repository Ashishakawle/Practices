package Nicelogic;

public class Stringprob {
  public static void main(String[] args) {
	String s="ABCDEFG123";
	String t1="";
	String t2="";
	String t3="";
    for(int i=0;i<4;i++) {  
    	t1=t1+s.charAt(i);
    }
    System.out.println(t1);
	for(int j=4;j<7;j++) {
		t2=t2+s.charAt(j);
	}
	System.out.println(t2);
	for(int k=7;k<10;k++) {
		t3=t3+s.charAt(k);
	}	System.out.println(t3);
	
}
}
